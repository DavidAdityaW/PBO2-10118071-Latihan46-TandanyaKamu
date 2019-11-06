/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan46.tandanyakamu;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA              : David Aditya Winarto
 * KELAS             : PBO2
 * NIM               : 10118071
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 *                     perhitungan umur
 */
public class PBO210118071Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        Age umur = new Age(2019);
        
        System.out.print("Masukkan Tahun Lahir Anda : ");
        umur.setYearBirth(input.nextInt());
        
        System.out.println("\n======Hasil Perhitungan Umur======");
        System.out.println("Tahun Lahir Anda \t : " + umur.getYearBirth());
        System.out.println("Hari ini Tahun \t\t : " + umur.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + umur.hitungUmur() + " tahun");
        System.out.println("Tandanya Kamu " + umur.tandanyaKamu(umur.hitungUmur()));
        
    }
    
}
