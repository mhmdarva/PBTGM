/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab11soal2;
import java.util.Scanner;
/**
 *
 * @author PC RPL - R1
 */
public class Bab11soal2 {

      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("ID Karyawan: ");
        String idKaryawan = scanner.nextLine();

        System.out.print("Nama Karyawan: ");
        String namaKaryawan = scanner.nextLine();

        System.out.print("Gol: ");
        int gol = scanner.nextInt();

        String jabatan;
        double gajiPokok;
        
        switch (gol) {
            case 1:
                jabatan = "Assisten Staff";
                gajiPokok = 3_000_000;
                break;
            case 2:
                jabatan = "Staff";
                gajiPokok = 3_500_000;
                break;
            case 3:
                jabatan = "Supervisor";
                gajiPokok = 4_000_000;
                break;
            case 4:
                jabatan = "Assisten Manager";
                gajiPokok = 5_000_000;
                break;
            case 5:
                jabatan = "Manager";
                gajiPokok = 6_000_000;
                break;
            default:
                jabatan = "Tidak valid";
                gajiPokok = 0;
        }
        
        // Menampilkan hasil
        System.out.println("ID Karyawan: " + idKaryawan);
        System.out.println("Nama Karyawan: " + namaKaryawan);
        System.out.println("Gol: " + gol);
        System.out.println("Jabatan: " + jabatan);
        // Format gajiPokok dengan pemisah ribuan
        System.out.printf("Gaji Pokok: Rp %, .2f%n", gajiPokok);
        
        scanner.close(); // Menutup scanner
    }
}
