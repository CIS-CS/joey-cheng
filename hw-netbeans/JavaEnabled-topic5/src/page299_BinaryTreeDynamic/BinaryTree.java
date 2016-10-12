package page299_BinaryTreeDynamic;

/**
 * Implements a binary tree in a linked list. 
 * Duplicate entries are not allowed.
 * See p.299 in the red book.
 * @author Mark Hayes
 */
public class BinaryTree {
    
    // Instance variables
    private BinaryTreeNode root;
    private StringBuffer sortBuffer;

    /** Constructor */
    public BinaryTree() {
        root = null;
        sortBuffer = new StringBuffer();
    }

    //---------------------------------------------------------------- Insert
    /** Insert data into the tree. */
    public void insert(Contact contact) {

        // Store the Contact object in a node.
        BinaryTreeNode newNode = new BinaryTreeNode(contact);
        // Insert the node into the tree.
        insert(newNode, root);
    }

    /** Insert a node into the tree. */
    private void insert(BinaryTreeNode newNode, BinaryTreeNode currentNode) {

        // If the tree is empty, put new node at the root.
        if (root == null) {
            root = newNode;
        }
        else {
            // Get the names from the two nodes
            String newName     = newNode.getContact().getName();
            String currentName = currentNode.getContact().getName();

            // Is new name < current name?
            if (newName.compareTo(currentName) < 0) {
                // Is left node empty?
                if (currentNode.getLeft() == null) {
                    // Store new node on the left
                    currentNode.setLeft(newNode);
                }
                else {
                    // Move down left branch one level, try to insert there
                    currentNode = currentNode.getLeft();
                    insert(newNode, currentNode);           // recursive call
                }
            }
            else {
                // New name > current name
                // Is right node empty?
                if (currentNode.getRight() == null) {
                    // Store new node on the right
                    currentNode.setRight(newNode);
                }
                else {
                    // Move down left branch one level, try to insert there
                    currentNode = currentNode.getRight();
                    insert(newNode, currentNode);           // recursive call
                }
            }
        }
    }

    //------------------------------------------------------- search (iterative)
    /** 
     * Search for a person's phone number.
     * Performs a binary search, ie, it does not need to visit every node;
     * it continually chops the tree in half as it traverses downward.
     * Uses iteration, not recursion.
     * 
     * @param name The name to search for.
     * @return String Phone number if found, otherwise null.
     */
    public String search(String searchName) {
        
        BinaryTreeNode currentNode = root;   // start searching from the root
        String phone = null;

        searchName = searchName.toLowerCase();

        // Traverse down the tree until we find a match, or until we hit the bottom
        while (currentNode != null) {
            // Get the key for the current node
            String nodeName = currentNode.getContact().getName().toLowerCase();

            if (nodeName.equals(searchName)) {
                // Found matching name, get phone number, break out of loop
                phone = currentNode.getContact().getPhone();
                break;
            }
            else if (searchName.compareTo(nodeName) < 0) {
                // Follow left branch
                currentNode = currentNode.getLeft();
            }
            else {
                // Follow right branch
                currentNode = currentNode.getRight();
            }
        }
        return phone;
    }

    //------------------------------------------------------- search (recursive)
    /**
     * Search for an name in the tree.
     * Uses a recursive helper.
     */
    public BinaryTreeNode searchR(String name) {
        return searchR(name, root);
    }

    /**
     * Uses recursion, not iteration.
     * Search for a contact in the tree.
     * Performs a binary search, ie, it does not need to visit every node;
     * it continually chops the tree in half as it traverses downward.
     * Note that the method is private.
     *
     * @param data The name to search for.
     * @param node The node to start searching from.
     * @return BinaryTreeNode The matching node, otherwise null.
     */
    private BinaryTreeNode searchR(String name, BinaryTreeNode node) {

        // Base case, empty tree, return null.
        if (node == null) {
            return null;
        }
        else if (name.equals(node.getContact().getName())) {
            // Found the node, return it.
            return node;
        }
        else {
            // See if we should traverse left or right.
            if (name.compareTo(node.getContact().getName()) < 0) {
                // Search the left subtree.
                return(searchR(name, node.getLeft()));
            }
            else {
                // Search the right subtree.
                return(searchR(name, node.getRight()));
            }
        }
    }

    //---------------------------------------------------------------- Delete
    /**
     * Delete a node from the tree.
     * Uses a recursive helper method.
     */
    public BinaryTreeNode delete(Contact contact) {

        BinaryTreeNode node = null;
        try {
             node = delete(contact, root);
        }
        catch (Exception e) {
            // Normally you would not write to the GUI from here.
            // This method should throw the exception to the caller.
            System.out.println("Node not found.");
        }
        return(node);
    }

    /** 
     * Recursive helper method to remove a node from the tree.
     * Four possibilities: node to be deleted could have:
     *   1. two children
     *   2. one child on the left
     *   3. one child on the right
     *   4. no children
     *
     * @param contact The data to be deleted.
     * @param current The node from which to begin the operation.
     * @return Contact The deleted data.
     */
    private BinaryTreeNode delete(Contact contact, BinaryTreeNode current) {

        if (current == null) {
            return current;
        }
        String deleteName  = contact.getName().toLowerCase();
        String currentName = current.getContact().getName().toLowerCase();

        if ((size() == 1) && (deleteName.equals(currentName))) {
            root = null;
            return current;
        }

        if (deleteName.compareTo(currentName) < 0) {
            current.setLeft(delete(contact, current.getLeft()));
        }
        else if (deleteName.compareTo(currentName) > 0) {
            current.setRight(delete(contact, current.getRight()));
        }
        else if (current.getLeft() != null && current.getRight() != null) {
            current.setContact(locateMinValue(current.getRight()).getContact());
            current.setRight(delete(current.getContact(), current.getRight()));
        }
        else {
            if (current.getLeft() != null) {
                current = current.getLeft();
            }
            else {
                current = current.getRight();
            }
        }
        return current;
    }

    /** Returns the minimum value in the right subtree of current. */
    private BinaryTreeNode locateMinValue(BinaryTreeNode current) {

        if (current.getLeft() == null) {
            return current;
        }
        else {
            return locateMinValue(current.getLeft());
        }
    }

    //---------------------------------------------------------------- Traverse
    /**
     * Displays the entire tree.
     * An application would call this method.
     */
    public void traverseInOrder() {
        traverseInOrder(root);
    }

    /** 
     * Performs an in-order traversal of the tree and stores the sorted
     * tree in a StringBuffer.
     * 
     * Traversals:
     *   Pre-order:  root, left, right
     *   In-order:   left, root, right
     *   Post-order: left, right, root
     */
    private void traverseInOrder(BinaryTreeNode current) {
        
        if (current != null) {
            traverseInOrder(current.getLeft());                             // left
            sortBuffer.append(current.getContact().getName() + " ");    // root
            //System.out.println(current.getContact().getName());
            traverseInOrder(current.getRight());                            // right
        }
    }

    //---------------------------------------------------------------- Display
    /**
     * Returns the contents of the sortBuffer, then empties the buffer.
     * @return String the sorted tree (in-order)
     */
    public String display() {

        String sortedTree = sortBuffer.toString();  // Save buffer contents
        sortBuffer.setLength(0);                    // Empty the buffer
        return sortedTree;                          // Return sorted string
    }

    //---------------------------------------------------------------- Size
    /**
     * Returns the number of nodes in the tree.
     * Uses a recursive helper that recurs down the tree and counts the nodes.
     */
    public int size() {
        return(size(root));
    }

    /**
     * Recursive helper to compute size of the tree.
     * Note that method is private.
     */
    private int size(BinaryTreeNode node) {
        if (node == null) {
            return(0);
        }
        else {
            // In-order traversal: left, root, right
            return(size(node.getLeft()) + 1 + size(node.getRight()));
        }
    }

    //---------------------------------------------------------------- isEmpty

    /** Returns true if the tree is empty. */
    public boolean isEmpty() {
        return (root == null);
    }

    //---------------------------------------------------------------- Accessors
    /** Returns the root node. */
    public BinaryTreeNode root() {

        return (root != null) ? root : null;
    }

    /** Returns the left node of the current node. */
    public BinaryTreeNode leftChild(BinaryTreeNode node) {

        return (node.getLeft() != null) ? node.getLeft() : null;
    }

    /** Returns the right node of the current node */
    public BinaryTreeNode rightChild(BinaryTreeNode node) {

        return (node.getRight() != null) ? node.getRight() : null;
    }

    /** Returns the parent of the current node. */
    public BinaryTreeNode parent(BinaryTreeNode node) {

        // Not implemented for now.
        return null;
    }
}
