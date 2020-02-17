/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaskur;

import java.util.Scanner;

/**
 *
 * @author sistem
 */
public class TugasKur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pil;
        Karyawan K = new Karyawan();
        Scanner p=new Scanner (System.in);
        System.out.println("Gaji Bulanan Karyawan");
        System.out.println("Pilihan Karyawan");
        System.out.println("1. Waiters");
        System.out.println("2. Koki");
        System.out.println("PILIH : ");
        pil=p.nextInt();
        switch(pil){
            case 1 :
                Karyawan K1=new Waiters();
                K1.naikgaji();
                System.out.println("Gaji Akhir Karyawan Khusus Waiters = "+ K1.getTotalgaji());
                break;
            case 2:
                Karyawan K2=new Koki();
                K2.naikgaji();
                System.out.println("Gaji Akhir Karyawan Khusus Koki = "+ K2.getTotalgaji());
                break;
        }  
    }
    
}
