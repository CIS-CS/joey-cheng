/*
 * An application that exercises/tests the SimpleTree class.
 * See p.299 in the red book.
 */

package page299_BinaryTreeDynamic;

public class SimpleTreeApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SimpleTree tree = new SimpleTree();

        tree.insert(51);
        tree.insert(48);
        tree.insert(71);
        tree.insert(2);
        tree.insert(49);
        tree.insert(80);
        tree.insert(10);
        tree.insert(50);
        tree.insert(75);
        tree.insert(91);
        tree.insert(79);
        
        
        /*tree.insert(2);
        tree.insert(10);
        tree.insert(48);
        tree.insert(49);
        tree.insert(50);
        tree.insert(51);
        tree.insert(71);
        tree.insert(75);
        tree.insert(79);
        tree.insert(80);
        tree.insert(91);
        */

        //tree.delete(25);

        // Display the tree
        System.out.println("BT = " + tree.display());        
        System.out.println("size = " + tree.size());

/*
        SimpleTreeNode result = null;
        // Search for a node (iterative)
        result = tree.search(20);
        System.out.println(result == null ? "Not found." : "Found.");

        // Search for a node (recursive)
        result = tree.searchR(20);
        System.out.println(result == null ? "Not found." : "Found.");

        // Delete a node
*/
        //tree.delete(51);
        //tree.delete(2);
        tree.delete(2);
        tree.delete(10);
        tree.delete(48);
        tree.delete(49);
        tree.delete(50);
        tree.delete(80);
        tree.delete(75);
        tree.delete(91);
        tree.delete(79);
        tree.delete(51);
        tree.delete(71);
        

        // Display the contents of the tree
        System.out.println("BT = " + tree.display());
        System.out.println("size = " + tree.size());
 
 
    }

    public static void print(SimpleTreeNode node) {
        System.out.println(node == null ? "Node not found." : "Deleted.");
    }
}











