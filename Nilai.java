/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.nilai;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Nilai {

    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
        System.out.println("Masukkan 5 angka dari 1-100: ");
        System.out.println("Nilai Pertama: ");
        int satu = input.nextInt();
        System.out.println("Nilai Kedua: ");
        int dua = input.nextInt();
        System.out.println("Nilai ketiga: ");
        int tiga = input.nextInt();
        System.out.println("Nilai keempat: ");
        int empat = input.nextInt();
        System.out.println("Nilai kelima: ");
        int lima = input.nextInt();
        
        System.out.println("Jumlah dari keseluruhan adalah : ");
            System.out.println((satu + dua + tiga + empat + lima)/5);
            
            System.out.println("");
            int jumlah = (satu + dua + tiga + empat + lima)/5;
            if (jumlah < 60){
                System.out.println("jumlah nilai anda: "+jumlah+", nilai anda kurang");  
            }
            else if (jumlah <= 70){
                System.out.println("jumlah nilai anda "+jumlah+ ", nilai anda cukup");   
            }
            else if (jumlah <= 80){
                System.out.println("jumlah nilai anda "+jumlah+ ", nilai anda baik");
            }
            else if (jumlah >80){
                System.out.println("jumlah nilai anda "+jumlah+ ", nilai anda luar biasa");
            }
    }
}
