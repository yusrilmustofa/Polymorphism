/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author yusri
 */
public class Rectangle extends Shape {
    private int length;
    private int width;
    //contruktor
    public Rectangle(String color,int length,int width){
        super(color);
        this.width = width;
        this.length=length;
    }
    
    public String toString(){
        return "Rectangle [length="+length+ ", width="+width+","+super.toString()+"]";
    }
    public double getArea(){
        return length*width;
    }
}
