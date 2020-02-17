//AMALIA CAHYA 123180111
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangun.datar;

/**
 *
 * @author DELL
 */
 //inheritance
public class Persegipanjang extends Segi4{
    public String  nama ="PERSEGI PANJANG";
    //polymorphism
    public void sisi(){
        System.out.println("Panjang sisinya berbeda ");
    }
    //encapsulation
    private double panjang;
    private double lebar;
    
    public double getPanjang(){
        return panjang;
    } 
    public void setPanjang(double panjang){
        this.panjang=panjang;
    }
    
    public double getLebar(){
        return lebar;
    } 
    public void setLebar(double lebar){
        this.lebar=lebar;
    }
    
    public double luas(double p,double l){
        return p*l;
    }
    public double getLuas(){
        return luas(panjang,lebar);
    } 
}
