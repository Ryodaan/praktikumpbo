/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan1;
import java.util.Scanner;
/**
 *
 * @author J U L D A N
 */
public class bangundatar {
    
    private int panjang;
    private int lebar;
    
    public void isipanjang(){
        panjang=20;
        lebar=100;
    }
    Scanner input=new Scanner(System.in);
    
    public int getpanjang(){
        return this.panjang;
    }
    public int getlebar(){
        return this.lebar;
    }
    public void cetak(){
        int hasil;
        System.out.print("Panjang   : ");
        panjang=input.nextInt();
        System.out.print("Lebar   : " );
        lebar=input.nextInt();
        
        hasil=panjang*lebar;
        System.out.println("Hasil :" + hasil);
    }
}      
