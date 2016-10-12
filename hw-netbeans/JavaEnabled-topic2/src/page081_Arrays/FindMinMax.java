/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package page081_Arrays;

/**
 *
 * @author mhayes
 */
public class FindMinMax {
    
    // The tedious way to initialize the array
    private int[] nums = new int[6];
    
    public static void main(String[] args)
    { 
        FindMinMax fmm = new FindMinMax();
        fmm.initArray();    
    }
    
    private int findMin()
    {
        return 0;
    }
    
    private int findMax()
    {
        return 0;
    }    
    
    private void initArray()
    {
        nums[0] = 3;
        nums[1] = 67;
        nums[2] = -9;
        nums[3] = 304;
        nums[4] = -56;
        nums[5] = 2;        
    }
}
