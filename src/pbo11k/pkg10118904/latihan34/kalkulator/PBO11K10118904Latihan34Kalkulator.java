/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118904.latihan34.kalkulator;
import java.util.*;
/**
 *
 * @author ACER
 * Nama     : Firman Alfinas
 * Kelas    : IF 11-K
 * Nim      : 10118904
 * Deskripsi Program : Program ini berisi tentang kalkulator
 */
public class PBO11K10118904Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Kalkulator k = new Kalkulator();
        double bil1,bil2;
        System.out.println("=====Aplikasi Kalkulator Bilangan=====");
        System.out.print("Masukan Angka ke-1 : ");
        bil1 = input.nextDouble();
        k.value1 = bil1;
        System.out.print("Masukan Angka ke-2 : ");
        bil2 = input.nextDouble();
        k.value2 = bil2;
        System.out.println("");
        System.out.println("Hasil Pertambahan : "+k.tambahBilangan());
        System.out.println("Hasil Pengurangan : "+k.kurangBilangan());
        System.out.println("Hasil Perkalian : "+k.kaliBilangan());
        System.out.println("Hasil Pembagian : "+k.bagiBilangan());
        System.out.println("Hasil Sisa : "+k.sisaBilangan());
    }
    
}
