package page299_BinaryTreeDynamic;

/**
 *  A node for holding Contact info in a binary tree.
 *  See p.299 in the red book
 */
public class BinaryTreeNode {

    // Instance variables
    private Contact contact = null;
    private BinaryTreeNode left  = null;
    private BinaryTreeNode right = null;

    public BinaryTreeNode(Contact contact) {
        this.contact = contact;
    }

    /** Set the data in the node. */
    public void setContact(Contact contact) {
        this.contact = contact;
    }

    /** Get the data from the node. */
    public Contact getContact() {
        return contact;
    }

    /** Set the left pointer. */
    public void setLeft(BinaryTreeNode node) {
        left = node;
    }

    /** Get the left pointer. */
    public BinaryTreeNode getLeft() {
        return left;
    }

    /** Set the right pointer. */
    public void setRight(BinaryTreeNode node) {
        right = node;
    }

    /** Get the right pointer. */
    public BinaryTreeNode getRight() {
        return right;
    }
}
