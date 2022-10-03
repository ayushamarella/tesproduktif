/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cinemaxxi;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Cinemaxxi {

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int hasil=0;
    int tiket;
    
        System.out.println("PEMESANAN TIKET CINEMA XXI ARAYA");
        System.out.println("PILIHAN FILM: ");
        String ulang = "";
        do {
            System.out.println("1. UNTIL TOMORROW : JAM 1 | JAM 4 | JAM 6 | JAM 8");
            System.out.println("2. SMILE : JAM 1 | JAM 3 | JAM 5 | JAM 8");
            System.out.println("3. JAILANGKUNG SANDEKALA : JAM 12 | JAM 2 | JAM 4 | JAM 7 | JAM 8");
            System.out.println("4. LARA ATI : JAM 2 | JAM 4 | JAM 6 | JAM 9");
            System.out.println("5. MIRACLE IN CELL NO. 7 : JAM 12 | JAM 3 | JAM 5 | JAM 8");
            System.out.println("------------------------------------------------------------------");
            
            System.out.println("PILIH FILM: ");
            int film= input.nextInt();
            System.out.println("PILIH JAM: ");
            int jam=input.nextInt();
            
            int harga = 0;
            
            System.out.println("harga tiket: 25.000");
            System.out.println("masukkan uang anda: ");
            int uang=input.nextInt();
            int kembalian;
            if (uang>harga){
                kembalian=uang-harga;
                System.out.println("kembaliannya: "+kembalian);
                System.out.println("apakah ada tambahan tiket?");
            }else
                System.out.println("mohon maaf uang anda kurang");
                
            ulang=input.next();
            }while (ulang.equalsIgnoreCase("iyaa"));
        
            }
}
            
            
            
        
        
        
        
        
    

    

