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
public class Circle extends Shape {
    
    private double radius;
    
    //default no-arg constructor
    public Circle()
    {
        super();
        radius = 1.0;
    }
    
    //constructor specifying radius
    public Circle(double userRadius)
    {
        super();
        radius = userRadius;
    }
    
    //constructor specifying radius, color and whether shape is filled
    public Circle (double userRadius, String userColor, boolean userFilled)
    {
        super (userColor, userFilled);
        radius = userRadius;
    }
    
    //accessor method for radius field
    public double getRadius(){
        return radius;
    }
    
    //mutator method for radius field
    public void setRadius(double userRadius){
        radius = userRadius;
    }
    
    //calculates area of circle 
    public double getArea (){
        return Math.PI*radius*radius;
    }
    //calculates perimeter of circle
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    
    @Override
    public String toString(){
        return "A circle with radius= " + radius + ", which is a subclass of " + super.toString();
    }
      
}
