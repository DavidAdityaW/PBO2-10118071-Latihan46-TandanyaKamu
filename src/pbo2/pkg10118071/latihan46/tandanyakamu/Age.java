/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan46.tandanyakamu;

/**
 *
 * @author 
 * NAMA              : David Aditya Winarto
 * KELAS             : PBO2
 * NIM               : 10118071
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 *                     perhitungan umur
 */
public class Age {
    
    private int yearBirth;
    private int yearNow;
    private String red;

    public Age(int yearNow) {
        this.red = "\u001b[31m";
        this.yearNow = yearNow;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }

    public int hitungUmur() {
        return getYearNow() - getYearBirth();
    }

    public String tandanyaKamu(int umur) {
        String tanda;
        if ((umur >= 0) && (umur <= 5)) {
            tanda = red + "LAGI LUCU-LUCU NYA";
        } else if ((umur > 5) && (umur <= 10)) {
            tanda = red + "MASIH ANAK-ANAK";
        } else if ((umur > 10) && (umur <= 13)) {
            tanda = red + "MASIH REMADJA";
        } else if ((umur > 13) && (umur <= 19)) {
            tanda = red + "ALAY";
        } else if ((umur > 19) && (umur <= 29)) {
            tanda = red + "LAGI GALAU NYARI JODOH";
        } else if ((umur > 29) && (umur <= 35)) {
            tanda = red + "LAGI SIBUK NYARI UANG";
        } else if ((umur > 35) && (umur <= 150)) {
            tanda = red + "SUDAH TUA";
        } else {
            tanda = red + "TIDAK TERDETEKSI DI KEHIDUPAN";
        }
        return tanda;
    }
}
