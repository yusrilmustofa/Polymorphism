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
public class TestShape {
    public static void main (String[]simon){
        Shape ww=new Rectangle("red",4,5);
        System.out.println(ww);
        System.out.println("Area is:"+ww.getArea());
        
        Shape www=new Triangle("Blue",4,5);
        System.out.println(www);
        System.out.println("Area is:"+www.getArea());
    }
}
