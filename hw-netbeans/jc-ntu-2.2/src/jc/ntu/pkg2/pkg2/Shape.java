/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jc.ntu.pkg2.pkg2;

/**
 *
 * @author joeycheng
 */
public class Shape {
    
    private String color; // instance variable color
    private boolean filled; // instance variable of whether the shape is filled

    // default no-arg constructor 
    public Shape (){
        color = "red";
        filled = true;
    }
    
    //shape constructor specifying color and whether shape is filled by user
    public Shape (String userColor, boolean userFilled) {
        color = userColor;
        filled = userFilled;
    }
    
    //accessor method for color field
    public String getColor(){
        return color;
    }
    
    //mutator method for color field
    public void setColor(String userColor){
        color = userColor;
    } 
    
    //accessor method for color field
    public boolean isFilled(){
        return filled;
    }
    
    //mutator method for color field 
    public void setFilled (boolean userFilled){
        filled = userFilled;
    }
    
    public String toString (){
        if (filled == false)
        return "A shape with color of " + color + " and not filled"  ;
        else
            return "A shape with color of " + color + " and filled";
    } 
    /**
     * @param args the command line arguments
     */

}
