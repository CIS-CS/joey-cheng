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
public class Square extends Rectangle {
    
    //default no-arg constructor
    public Square (){
        super();
    }
    
    //consturctor specifying length of each side
    public Square (double side){
        super(side, side);
    }
    
    //constructor specifying length of side, color, and whether square is filled
    public Square (double side, String color, boolean filled){
        super (side, side, color, filled );
    }
    
    //returns side length
    public double getSide(){
        return super.getLength();
    }
    
    //sets side length
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    
    @Override
    public void setWidth(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    
    @Override
    public void setLength(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    
    @Override
    public String toString (){
        return "A square with side= "  + getSide() + ", which is a subclass of " + super.toString();
    }
  
    
    
}
