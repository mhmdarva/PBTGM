/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab6soal1.java;

/**
 *
 * @author PC RPL - R1
 */
public class Bab6soal1Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Meminta input dari pengguna
        System.out.print("NIM ? : ");
        int NIM = input.nextInt();
        input.nextLine();  // Membersihkan buffer

        System.out.print("NAMA ? : ");
        String Nama = input.nextLine();

        System.out.print("NILAI ? : ");
        int Nilai = input.nextInt();

        // Menentukan grade berdasarkan nilai
        char grade;
        if (Nilai >= 85) {
            grade = 'A';
        } else if (Nilai >= 70) {
            grade = 'B';
        } else if (Nilai >= 55) {
            grade = 'C';
        } else if (Nilai >= 40) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        // Menampilkan hasil
        System.out.println("\nOutput:");
        System.out.println("NIM : " + NIM);
        System.out.println("NAMA : " + Nama);
        System.out.println("NILAI : " + Nilai);
        System.out.println("GRADE : " + grade);

        input.close();
    }
    
}
