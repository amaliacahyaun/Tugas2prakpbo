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
public class Persegi extends Segi4{
  public String  nama ="PERSEGI";
  
    //encapsulation  
    private double panjang;
    private double lebar;
    
    public double getPanjang(){
        return panjang;
    } 
    public void setPanjang(double panjang){
        this.panjang=panjang;
    }
    
    public double luas(double p){
        return p*p;
    }
    public double getLuas(){
        return luas(panjang);
    }
}