package page267_Hashing;
import ibio.IBIO;

/**
 * JRRHasher.java
 * This class inserts words from JRR Tolkien's Telerin language into a
 * hash table. The hash table could later be used as a lookup table by
 * a Telerin spell checker to quickly find valid Telerin words.
 * This version does not check for collisions.
 */
public class JRRHasherApp {

    // "awhw" collides with "kevin"
    private String[] keys = {"trumbe", "vanua", "vane",  "auta", "ulga",
                             "alice",  "kevin", "kahin", "awhw", "waboo"};
    private String[] hashTable = new String[51];
    private int      hashValue;
        
    public static void main(String[] args) {
                
        JRRHasherApp jHash = new JRRHasherApp();
                
        jHash.clearHashTable();      // Initialize the hash table
        jHash.buildHashTable();      // Insert the keys into the hash table
        jHash.displayHashTable();    // Show the contents of the hash table
    }

    public void addkey(String key) {

        // hash the key
        // check if HT slot occupied
        // if not occupied, store key in HT
        // if occupied, call collisionHandler()
        //     check if room in the overflow area
        //     if space avaialable, store key in overflow area
        //     if no space, error msg; improve the hash function


    }

    /**
     * Clears the hash table.
     */
    public void clearHashTable() {
        
        for (int i = 0; i < hashTable.length; i++) {
            hashTable[i] = "";
        }
    }
    
    /**
     * Populates the hash table.
     * Hashes each key and inserts the key into the table.
     */
    public void buildHashTable() {
        
        // Add each key to the hash table
        for (int i = 0; i < keys.length; i++) {
            // Hash the key to get the hash value
            hashValue = hashFunction(keys[i]);
            // Store the key in the table
            hashTable[hashValue] = keys[i];
        }        
    }
    
    /**
     * Calculate the hash value for a key. Sum the ascii values of each
     * character in the key, and then mod by a prime number.
     * @param key the key to be hashed
     * @return int hash value
     */
    public int hashFunction(String key) {
        
        int asciiSum = 0;
        int hashValue = 0;
        
        for (int i = 0; i < key.length(); i++) {
            asciiSum = asciiSum + key.charAt(i);            
        }
        hashValue = asciiSum % hashTable.length;
        return hashValue;
    }    
    
    /**
     * Displays the contents of the hash table.
     */
    public void displayHashTable() {
         
        IBIO.output("\nIndex\tContents");
        IBIO.output("-----\t--------");
        for (int i = 0; i < hashTable.length; i++) {
            IBIO.output(i + "\t" + hashTable[i]);
        }
    }
}