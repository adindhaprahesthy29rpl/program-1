/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program.pkg1;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Program1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Deklarasi Variabel
        String nama, jenisKelamin, agama,tempatTanggalLahir, alamat, kota;
        int nisn, noInduk;
        
        // inputan user
        Scanner input = new Scanner (System.in);
        
        // input
        System.out.println("----BIODATA SISWA SMK TELKOM MALANG----");
        System.out.println("=======================================");
        
        System.out.println("Nama Lengkap : ");
        nama= input.nextLine();
        
        System.out.println("Jenis Kelamin : ");
        jenisKelamin= input.nextLine();
        
        System.out.println("Agama : ");
        agama= input.nextLine();
        
        System.out.println("Tempat Tanggal Lahir : ");
        tempatTanggalLahir= input.nextLine();
                
        System.out.println("Alamat : ");
        alamat= input.nextLine();
        
        System.out.println("NISN : ");
        nisn= input.nextInt();
        
        System.out.println("No Induk : ");
        noInduk= input.nextInt();
        
        // output
        System.out.println("___________________________________________");
        System.out.println("------KARTU PELAJAR SMK TELKOM MALANG------");
        System.out.println("Jl. Danau Ranau Telp (0341) 712500 - Malang");
        System.out.println("___________________________________________");
        
        System.out.println("Nama : "+nama);
        System.out.println("NISN : "+nisn);
        System.out.println("No. Induk : "+noInduk);
        System.out.println("Jenis Kelamin : "+jenisKelamin);
        System.out.println("Agama : "+agama);
        System.out.println("TTL : "+tempatTanggalLahir );
        System.out.println("Alamat : "+alamat);
        
      
     
    }
    
}
