/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119067.latihan23.nilaiterbesardanterkecil;
import java.util.Scanner;

/**
 *
 * @author Danhago
 * NAMA     : Andreas Danhago P.I
 * KELAS    : IF2
 * NIM      : 10119067
 * Deskripsi Program :Nilai Terbesar dan Terkecil
 */
public class PBOIF210119082Latihan23NilaiTerbesarDanTerkecil {

    /**
     */
    
    public static int max (int max, int nilai[], int n) {
        max=nilai[1];
        for (int i = 1; i <=n; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            }
        }
        return max;
    }
    
    public static int min (int min, int nilai[], int n) {
        min=nilai[1];
        for (int i = 1; i <=n; i++) {
            if (nilai[i] < min) {
                min=nilai[i];
            }
        }
        return min;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int[]nilai = new int [10];
        int n;
        int max = 0;
        int min = 0;
        String nama;
        
        System.out.println("======Program Terbesar dan Terkecil Nilai Mahasiswa======");
        System.out.print("Masukkan Nama Petugas : ");
        nama = scanner.nextLine();
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        n = scanner.nextInt();
        
        for (int i = 1; i <=n; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + "=");
            nilai[i] = scanner.nextInt();
        }
        System.out.println("");
        System.out.println("Hasil Nilai Mahasiswa");
        for (int i = 1; i <=n; i++) {
            System.out.println("Nilai Mahasiswa ke-" + i + " = " + nilai[i]);
        }
        System.out.println("");
        System.out.println("Nilai Terbesar adalah : " + max(max,nilai,n));
        System.out.println("Nilai Terkecil adalah : " + min(min,nilai,n));
        System.out.println("");
        System.out.println("Petugas : " + nama);
        System.out.println("Developed by : Danhago");
    }
    
}