package page299_BinaryTreeDynamic;

/**
 *  A node for holding integers in a binary tree.
 *  See p.299 in the red book
 */
public class SimpleTreeNode {

    // Instance variables (made public so we don't need the get/set methods)
    public int data = 0;
    public SimpleTreeNode left  = null;
    public SimpleTreeNode right = null;

    public SimpleTreeNode(int data) {
        this.data = data;
    }
}
