/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

/**
 *
 * @author yusri
 */
public abstract class AeroPlans extends Vehicle {
    public void walk(){
        System.out.println("Aeroplans is Flying");
    }
    public static void main(String []args){
        AeroPlans Garuda= new AeroPlans() {};
        Garuda.function();
        Garuda.fuel();
        Garuda.walk();
    }
}
