/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author yusri
 */
public class PembayaranGaji {
    public int hitunggaji(Pegawai peg){
        int uang =peg.gaji();
        if (peg instanceof Direktur) {
            uang+=((Direktur)peg).tunjangan();
            if (peg instanceof Staff) {
                uang+=((Staff)peg).bonus();
            }
        }
        return uang;
    }
    public static void main (String[]args){
        PembayaranGaji ping=new PembayaranGaji();
        Staff Simon=new Staff();
        Direktur Yusril=new Direktur();
        System.out.println("Gaji yang dibayarkan untuk staff="+ping.hitunggaji(Simon));
        System.out.println("Gaji yang dibayarkan kepada Direktur="+ping.hitunggaji(Yusril));
    }
}
