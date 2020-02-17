/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangun.datar;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
//import java.util.Scanner;

public class BangunDatar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        Scanner rumus = new Scanner (System.in);
           Persegi p=new Persegi();
           System.out.println("Nama Bangun Datar: "+ p.nama);
           System.out.println(p.sifatsegi4);
           p.sisi();
           System.out.print("sisi=");
           p.setPanjang(rumus.nextDouble());
           System.out.println("Luas persegi: " + p.getLuas());
           
           System.out.println("");
           Persegipanjang pp=new Persegipanjang();
           System.out.println("Nama Bangun Datar: "+ pp.nama);
           System.out.println(p.sifatsegi4);
           pp.sisi();
           System.out.print("panjang=");
           pp.setPanjang(rumus.nextDouble());
           System.out.print("lebar=");
           pp.setLebar(rumus.nextDouble());
           System.out.println("Luas persegi panjang: " + pp.getLuas());
      
   /* Scanner rumus = new Scanner (System.in);
        Segi4 S[]= new Segi4[2];
        S[0]= new Persegi();
        S[1]= new Persegipanjang();
        for (int i = 0; i < 2; i++) {
        System.out.println("Nama Bangun Datar: "+ S[i].nama);
           System.out.println(S[i].sifatsegi4);
           S[i].sisi();
           System.out.print("sisi=");
           S[i].setPanjang(rumus.nextDouble());
           System.out.println("Luas persegi: " + S[i].getLuas());
         }
        */
       //}
        // TODO code application logic here
    }
    
}
