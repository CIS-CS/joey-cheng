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
public class Rectangle extends Shape {
    
    private double width;
    private double length;
    
    //default no-arg constructor
    public Rectangle(){
      
        super();
        width = 1.0;
        length = 1.0;
    }
    
    //constructor specifying length and width by user
    public Rectangle (double userWidth, double userLength){
      
        super();
        width = userWidth;
        length = userLength;
    }
    
    //constructor specifying length, width, color, and whether color is filled by user
    public Rectangle (double userWidth, double userLength, String userColor, boolean userFilled ){
        
        super(userColor, userFilled);
        width = userWidth;
        length = userLength;
       
    }
    
    //accessor method for width field
    public double getWidth(){
        return width;
    }
    
    //mutator method for width field
    public void setWidth(double userWidth){
        width = userWidth;
    }
    
    //accessor method for length field
    public double getLength(){
        return length;
    }
    
    //mutator method for length field
    public void setLength(double userLength){
        
        length = userLength;
    }
    
    //returns area of rectangle
    public double getArea(){
        return width*length;  
    }
    
    //returns perimeter of rectangle
    public double getPerimeter(){
        return 2*(width + length);
    }
    
    @Override
    public String toString(){
        return "A rectangle with width= " + width + " and length= " + length + ", which is a subclass of " + super.toString();
    }
    
}
