package page267_Hashing;

/**
 * This class is used to test HashTable.java
 * @author put your name here
 */
public class HashTableApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        HashTableApp app = new HashTableApp();
        app.test();
    }

    public void test() {

        HashTable ht = new HashTable();

        String[] keys   = {"alice", "kahin", "kevin"};
        String[] phones = {"A001", "K001", "K002"};

        String[][] data = {{"alice","A001"},
                           {"kahin","K001"},
                           {"kevin","K002"} };

        for (int i = 'A'; i <= 'Z'; i++) {
            ht.insert(Integer.toString(i), Integer.toString(i));
        }
    }

}














