// HashTable.java
package page267_Hashing;

/**
 * Implements a hash table in an array.
 * @author Mark Hayes
 */
public class HashTable {
    
    // This is the hash table; col1 = student name (key), col2 = phone#
    private String[][] hashTable    = new String[100][2];
    private String[][] overflowArea = new String[50][2];
        
    /**
     *  Generates a hash value for a given hash key. The keys should be unique.
     *  @param key A unigue field from the 'record'
     *  @return int The hash value
     */
    private int hashFunc(String key) {

        int hashValue = 0;

        for (int i = 0; i < key.length(); i++)
        {
            hashValue += key.charAt(i) + i;
        }
        hashValue = hashValue % hashTable.length;
        return hashValue;
    }
    
    /**
     *  Use the key to find a value in the hash table
     *  @param key
     *  @return
     */
    public int lookup(String key) {

        return 0;
    }

    public void insert(String key, String phone) {

        int hashValue = hashFunc(key);

        hashTable[hashValue][0] = key;
        hashTable[hashValue][1] = phone;
    }
    
    public void removeKey(String key) {
        
    }
    
    public boolean isDuplicate(String key) {
        return false;
    }

    public boolean isEmpty() {
        return true;
    }
    
    public boolean isFull() {
        return false;
    }
    
    public int size() {
        return 0; 
    }
}





