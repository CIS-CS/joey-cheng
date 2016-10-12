/*
 *  QuickSorert.java
 *  From p.263 in the red book
 *  NOTE: The pivot is a value, not a position.
 *        It is the value of the center element of the array.
 */

package page263_QuickSort;

public class QuickSort {

    private static int recursiveCalls = 0;
    
    public static void main(String[] args)
    {        
        //int[] data = {10, 4, 8, 1, 100, -1, 26, 5, 32};
        
        // Fill the array with a large number of assorted values
        int[] data = new int[1024*1024];
        for (int i = 0; i < data.length; i++) {
            // use random numbers
            data[i] = (int)(Math.random() * 10000000);

            // use descending numbers
            //data[i] = data.length - i;

            // use ascending numbers (data already sorted)
            //data[i] = i;
        }
        
        //display(data);
        quickS(0, data.length-1, data);
        //display(data);
        System.out.println("\nNumber of calls to quickS() = " + recursiveCalls);
    }

    // See p262 in the book for a description of the algorithm
    public static void quickS(int start, int finish, int[] data) {

        int left  = start;
        int right = finish;
        int pivot = data[(left + right) / 2];    // get the value of the center item
        int temp;
        
        

        // Move the values that are less than pivot, to the left of the pivot.
        // Move the values that are greater than the pivot, to the right of the pivot.
        // When done, the pivot will be in the correct place.
        while (left <= right) {
            // adjust left ptr: look for a value that is > pivot
            // left will not move to the right of the pivot's location
            while (data[left] < pivot) {
                left++;
                recursiveCalls++;
            }
            // adjust right ptr: look for a value that is < pivot
            // right will not move to the left of the pivot's location
            while (data[right] > pivot) {
                right--;
                recursiveCalls++;
            }
            // if pointers have not crossed, do a swap
            if (left <= right) {
                // Swap the left and right values
                temp = data[left];
                data[left] = data[right];
                data[right] = temp;
                // Adjust indexes inward
                left++;
                right--;
                recursiveCalls++;
            }
        }        
        
        // Do the left side of the list
        if (start < right)
            quickS(start, right, data);

        // Do the right side of the list
        if (left < finish)
            quickS(left, finish, data);
    }

    public static void display(int[] data) {

        System.out.println("\n----------");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
