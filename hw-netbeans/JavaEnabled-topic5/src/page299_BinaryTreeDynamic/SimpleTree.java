package page299_BinaryTreeDynamic;

/**
 * Implements a binary tree. Duplicate entries not allowed.
 * See p.299 in the red book.
 * @author Mark Hayes
 */
public class SimpleTree {
    
    public SimpleTreeNode root;

    // used when deleting a node, and the node has two children
    // to keep the tree balanced over time, alternate between L and R
    private boolean replaceWithLeftSubtree = true;

    public SimpleTree() {
        root = null;
    }

    //------------------------------------------------------- insert (recursive)
    /** Insert data into the tree. */
    public void insert(int data) {

        // Store the data in a node.
        SimpleTreeNode newNode = new SimpleTreeNode(data);
        // Insert the node into the tree.
        insert(newNode, root);
    }

    /** Insert a node into the tree. */
    private void insert(SimpleTreeNode newNode, SimpleTreeNode currentNode) {

        // If the tree is empty, put new node at the root.
        if (root == null) {
            root = newNode;
        }
        else {
            // Is new node < current node?
            if (newNode.data < currentNode.data) {
                // Is left node empty?
                if (currentNode.left == null) {
                    // Put new node on the left
                    currentNode.left = newNode;
                }
                else {
                    // Move down left branch one level, try to insert there
                    currentNode = currentNode.left;
                    insert(newNode, currentNode);           // recursive call
                }
            }
            else {
                // New node > current node
                // Is right node empty?
                if (currentNode.right == null) {
                    // Store new node on the right
                    currentNode.right = newNode;
                }
                else {
                    // Move down right branch one level, try to insert there
                    currentNode = currentNode.right;
                    insert(newNode, currentNode);           // recursive call
                }
            }
        }
    }

    //------------------------------------------------------- Search (iterative)
    /**
     * Uses iteration, not recursion.
     * Search for an int in the tree.
     * Performs a binary search, ie, it does not need to visit every node;
     * it continually chops the tree in half as it traverses downward.
     * 
     * @param data The integer to search for.
     * @return SimpleTreeNode The matching node, otherwise null.
     */
    public SimpleTreeNode search(int data) {
        
        SimpleTreeNode currentNode = root;   // start searching from the root

        // Traverse down the tree until we find a match, or until we hit the bottom
        while (currentNode != null) {

            if (data == currentNode.data) {
                // Found match, break out of loop
                break;
            }
            else if (data < currentNode.data) {
                // Follow left branch
                currentNode = currentNode.left;
            }
            else {
                // Follow right branch
                currentNode = currentNode.right;
            }
        }
        return currentNode;
    }

    //------------------------------------------------------- Search (recursive)
    /**
     * Search for an int in the tree.
     * Uses a recursive helper.   
     */
    public SimpleTreeNode searchR(int data) {
        return searchR(data, root);
    }

    /**
     * Uses recursion, not iteration.
     * Search for an int in the tree.
     * Performs a binary search, ie, it does not need to visit every node;
     * it continually chops the tree in half as it traverses downward.
     * Note that the method is private.
     *
     * @param data The integer to search for.
     * @return SimpleTreeNode The matching node, otherwise null.
     */
    private SimpleTreeNode searchR(int data, SimpleTreeNode node) {

        // Base case, empty tree, return null.
        if (node == null) {
            return null;
        }
        else if (data == node.data) {
            // Found the node, return it.
            return node;
        }
        else {
            // See if we should traverse left or right.
            if (data < node.data) {
                // Search the left subtree.
                return(searchR(data, node.left));
            }
            else {
                // Search the right subtree.
                return(searchR(data, node.right));
            }
        }
    }

    //------------------------------------------------------- Delete (recursive)
    /**
     * Delete a node from the tree.
     * Uses a recursive helper method.
     * 
     * Very stubborn bug fixed by Pascal So, Y13, 10Jan2014.
     * Problem: attempts to delete the root when the root had only one 
     *          child caused the app to fail (NullPointerException?).
     */
    public void delete(int data) {
       
        delete(data, root, null);
    }

    /** 
     * Recursive helper method to delete a node from the tree.
     * @param data The data to be deleted.
     * @param current Current node in the tree
     * @param parentD Parent of the current node
     * @return SimpleTreeNode The deleted node, or null if not found.
     */
    private SimpleTreeNode delete(int data, SimpleTreeNode current,
            SimpleTreeNode parentD) {

        SimpleTreeNode result = null;       // assume not found

        // in notes below, D = node to be deleted; R = replacement node

        // drill down to find D
        if (current == null) {
            result = null;
        }
        else if (data < current.data) {
            delete(data, current.left, current);
        }
        else if (data > current.data) {
            delete(data, current.right, current);
        }
        else {
            // found a matching node; what kind of node is it?
            if (current.left == null && current.right == null) {
                // D is leaf; delete the leaf; set pointer in parent to null
                if (parentD == null) 
                    root = null;
                else if(parentD.left == current)
                    parentD.left = null;
                else
                    parentD.right = null;
                result = current;
            }
            else if (current.left != null && current.right == null && parentD != null) {
                // D has one child, on the left
                // point the parent of D to the child of D
                // set the left of D to null
                if (parentD.left != null && parentD.left == current) {
                    parentD.left = current.left;                
                }
                else {
                    parentD.right = current.left;
                }
                current.left = null;
                result = current;
            }
            else if (current.left == null && current.right != null && parentD != null) {
                // D has one child, on the right
                // point the parent of D to the child of D
                // set the right of D to null
                if (parentD.left != null && parentD.left == current) {
                    parentD.left = current.right;
                }
                else {
                    parentD.right = current.right;
                }
                current.right = null;
                result = current;
            }
            else if (current.left == null && current.right != null && parentD == null){
                root = current.right;
                current.right = null;
            }
            
            else if (current.left != null && current.right == null && parentD == null){
                root = current.left;
                current.left = null;
            }
            
            else {
                // D has two children; replace D with:
                //   - the largest node R from the left subtree of D
                //     this will be the rightmost node of left subtree
                //     (note, that node could have a left child)
                //     or
                //   - the smallest node R from the right subtree of D
                //     this will be the leftmost node of the right subtree
                //     (note, that node could have a right child)
                if (replaceWithLeftSubtree) {
                    // if R will come from the left subtree of D:
                    // R will be the rightmost node in the left subtree.
                    // if R is a leaf:
                    //   - create a temp pointer to D
                    //   - set the parent of D to point to R
                    //   - set the parent of R to point to null
                    //   - set the right-pointer of R to point to right subtree of D
                    //   - set the left-pointer of R to point to left subtree of D
                    //   - set the left and right of D to null
                    // if R has a left child (steps are same as above, except for *)
                    //   - create a temp pointer to D
                    //   - set the parent of D to point to R
                    //   - * set the left-pointer of R's parent to point to the left child of R
                    //   - set the right-pointer of R to point to right subtree of D
                    //   - set the left-pointer of R to point to left subtree of D
                    //   - set the left and right of D to null
                    
                    // drill down to get the rightmost node R in left subtree
                    // keep track of that node's parent
                    SimpleTreeNode replacementNode = current.left;
                    SimpleTreeNode parentR = current;
                    while (replacementNode.right != null) {
                        parentR = replacementNode;
                        replacementNode = parentR.right;
                    }

                    // what kind of node is R?
                    if (replacementNode.left == null && replacementNode.right == null) {
                        // R is a leaf
                        // set the parent of D to point to R
                        if (parentD == null) {
                            // must be deleting the root; no parent for D
                            root = replacementNode;
                        }
                        else if (parentD.left != null && parentD.left == current) {
                            parentD.left = replacementNode;
                        }
                        else {
                            parentD.right = replacementNode;
                        }
                        // set the parent of R to point to null
                        if (parentR.left != null && parentR.left == replacementNode) {
                            parentR.left = null;
                        }
                        else {
                            parentR.right = null;
                        }
                        // set the right-pointer of R to point to right subtree of D
                        replacementNode.right = current.right;
                        // set the left-pointer of R to point to left subtree of D
                        replacementNode.left = current.left;
                        // decouple D from the tree
                        current.left = null;
                        current.right = null;
                        result = current;
                    }
                    else {
                        // R has a left child
                        // set the parent of D to point to R
                        if (parentD.left != null && parentD.left == current) {
                            parentD.left = replacementNode;
                        }
                        else {
                            parentD.right = replacementNode;
                        }
                        // set the left-pointer of R's parent to point to the left child of R
                        parentR.left = replacementNode.left;
                        // set the right-pointer of R's parent to point to null
                        parentR.right = null;
                        // set the right-pointer of R to point to right subtree of D
                        replacementNode.right = current.right;
                        // set the left-pointer of R to point to left subtree of D
                        replacementNode.left = current.left;
                        // decouple D from the tree
                        current.left = null;
                        current.right = null;
                        result = current;
                    }                                                            
                    //replaceWithLeftSubtree = false;
                }
                else {
                    // if R will come from the right subtree of D:
                    // if R is a leaf:
                    //   - create a temp pointer to D
                    //   - set the parent of D to point to R
                    //   - set the parent of R to point to null
                    //   - set the right-pointer of R to point to right subtree of D
                    //   - set the left-pointer of R to point to left subtree of D
                    //   - set the left and right of D to null
                    // if R has a right child (steps are same as above, except for *)
                    //   - create a temp pointer to D
                    //   - set the parent of D to point to R
                    //   - * set the right-pointer of R's parent to point to the right child of R
                    //   - set the right-pointer of R to point to right subtree of D
                    //   - set the left-pointer of R to point to left subtree of D
                    //   - set the left and right of D to null

                    //replaceWithLeftSubtree = true;
                }
            }
        }
        return result;
    }

    //------------------------------------------------------------- display tree
    /**
     * Returns the contents of the tree as a string.
     * @return String the contents of the tree.
     */
    public String display() {

        StringBuffer buffer = new StringBuffer();

        traverse(root, buffer);
        return buffer.toString();
    }

    // Do an in-order traversal of tree; return contents as a string
    private void traverse(SimpleTreeNode current, StringBuffer buffer) {

        if (current != null) {
            traverse(current.left, buffer);          // left
            buffer.append(current.data + " ");       // root
            traverse(current.right, buffer);         // right
        }
    }

    //--------------------------------------------------------- Size (recursive)
    /**
     * Returns the number of nodes in the tree.
     * Uses a recursive helper that recurs down the tree and counts the nodes.
     */
    public int size() {
        return(size(root));
    }

    /**
     * Recursive helper to compute size of the tree.
     * Note that the method is private.
     */
    private int size(SimpleTreeNode node) {
        if (node == null) {
            return(0);
        }
        else {
            // In-order traversal: left, root, right
            return(size(node.left) + 1 + size(node.right));
        }
    }

    //---------------------------------------------------------------- isEmpty
    /** Returns true if the tree is empty. */
    public boolean isEmpty() {
        return (root == null);
    }

    //---------------------------------------------------------------- Accessors
    /** Returns the root node. */
    public SimpleTreeNode root() {

        return (root != null) ? root : null;
    }

    /** Returns the left node of the current node. */
    public SimpleTreeNode leftChild(SimpleTreeNode node) {

        return (node.left != null) ? node.left : null;
    }

    /** Returns the right node of the current node */
    public SimpleTreeNode rightChild(SimpleTreeNode node) {

        return (node.right != null) ? node.right : null;
    }

    /** Returns the parent of the current node. */
    public SimpleTreeNode parent(SimpleTreeNode node) {

        // Not implemented for now.
        return null;
    }
}
