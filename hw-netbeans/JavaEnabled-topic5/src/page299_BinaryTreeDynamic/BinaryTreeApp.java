/*
 * An application that uses the BinaryTree class.
 * See p.299 in the red book.
 */

package page299_BinaryTreeDynamic;

public class BinaryTreeApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BinaryTree bt = new BinaryTree();
        BinaryTreeNode node = null;
        Contact contact = null;
        String name = null;

        contact   = new Contact("Mark", "M1234");
        bt.insert(contact);
        
        contact   = new Contact("Zoe", "Z1234");
        bt.insert(contact);

        contact   = new Contact("Joe", "J1234");
        bt.insert(contact);

        contact   = new Contact("Albert", "A1234");
        bt.insert(contact);

        contact   = new Contact("Rick", "R1234");
        bt.insert(contact);

        contact   = new Contact("Aaron", "A9999");
        bt.insert(contact);

        contact   = new Contact("Aaaron", "A9999");
        bt.insert(contact);

        bt.traverseInOrder();
        System.out.println(bt.display());
        System.out.println("size = " + bt.size());

        // Search for a node (iterative)
        name = bt.search("Rick");
        System.out.println(name == null ? "Not found." : "Found.");

        // Search for a node (recursive)
        node = bt.searchR("Rick");
        System.out.println(node == null ? "Not found." : "Found.");

 /*
        // Delete a node
        node = bt.delete(new Contact("Rick", "R1234"));
        System.out.println(node == null ? "Cannot delete, not found." : "Deleted.");

        // Delete a node
        node = bt.delete(new Contact("Aaaron", "A9999"));
        System.out.println(node == null ? "Cannot delete, not found." : "Deleted.");

        // Delete a node
        node = bt.delete(new Contact("Aaron", "A9999"));
        System.out.println(node == null ? "Cannot delete, not found." : "Deleted.");
*/
        // Delete a node
        node = bt.delete(new Contact("Aaronx", "A9999"));
        System.out.println(node == null ? "Cannot delete, not found." : "Deleted.");

        // Display the contents of the tree
        bt.traverseInOrder();
        System.out.println("BT = " + bt.display());

        System.out.println("size = " + bt.size());
    }

}
