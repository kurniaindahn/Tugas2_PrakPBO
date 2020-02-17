/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaskur;

/**
 *
 * @author sistem
 */
public class Karyawan {
    double gaji;
    private double bonus;
    
    Karyawan(){
        gaji=1000000;
        bonus=250000;
        System.out.println("Gaji Karyawan mula-mula "+gaji+" dan bonus standar "+bonus);        
    }
    private double Hitunggaji(double gaji, double bonus){
        return gaji+bonus;
    }
     void naikgaji(){
     System.out.println("Beda profesi beda gaji");}
     
    public void setbonus(double bonus){
        this.bonus=bonus;
    }
    public double getTotalgaji(){
        return Hitunggaji(gaji,bonus);
    }
}
