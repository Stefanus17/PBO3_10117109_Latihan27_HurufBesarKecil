/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117109_latihan27_hurufbesarkecil;

import java.util.Scanner;

/**
 * Nama  : Stefanus Saputra
 * NIM   : 10117109
 * Kelas : IF 3
 * Deskripsi : Membuat Program Menampilkan Huruf Kapital atau Kecil
 */
public class PBO3_10117109_Latihan27_HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Kalimat;
        
        Scanner input = new Scanner(System.in);
    
        System.out.print("Masukan Kalimat : ");
        Kalimat = input.nextLine();
        
        System.out.print("");
        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar : " + Kalimat.toUpperCase());
        System.out.println("Huruf Kecil : " + Kalimat.toLowerCase());
    }
    
}
