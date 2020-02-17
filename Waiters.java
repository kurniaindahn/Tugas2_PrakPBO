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
public class Waiters extends Karyawan{
    Waiters(){
        gaji+=1000000;
        setbonus(200000);    
    }      
    
    @Override
    void naikgaji(){
        gaji+=1500000;
}
  /*  @Override
    public double getTotalgaji(){
        return Hitunggaji(gaji,bonus);
    }
    public double Hitunggaji(double gaji,double bonus){
        return gaji+bonus;
    }  */
    
    
}
