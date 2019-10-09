/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118016.latihan17.tunjangan;
import java.util.Scanner;

/**
 *
 * @author Rezky
 * NAMA      : Rezky Nur Fauzi
 * KELAS     : IF-1
 * NIM       : 10118016
 * Deskripsi Program   : Program ini berisi program Tunjangan
 */
public class IF0110118016Latihan17Tunjangan {

    double gaji;
    String status;
    
    public void tunjangan(){
        System.out.println("===========Program Tunjangan===========");
        
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        Scanner tampung1 = new Scanner(System.in);
        
        gaji = tampung1.nextDouble();
        
        System.out.print("Status anda ? (Menikah/Belum)\t: ");
        Scanner tampung2 = new Scanner(System.in);
        
        status = tampung2.nextLine();   
    }
    
    public void hitung(){
        //variabel lokal
        double tunjangan;
        double total;
        
        tunjangan = status.equals("Menikah")?0.35*gaji:0;
        total = gaji + tunjangan;
        
        System.out.println();
        System.out.println("===========Hasil Perhitungan===========");
        System.out.println("Gaji Pokok\t\t: Rp. " + gaji);
        System.out.println("Tunjangan\t\t: Rp. " + tunjangan);
        System.out.println("Total Gaji\t\t: Rp. " + total);
        System.out.println("(Developed by : Rezky Nur Fauzi)");        
    }
    
    public static void main(String[] args) {
    
       IF0110118016Latihan17Tunjangan Tunjangan = new IF0110118016Latihan17Tunjangan();
       Tunjangan.tunjangan();
       Tunjangan.hitung();
    }
    
}
