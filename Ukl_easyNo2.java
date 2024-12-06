package com.mycompany.ukl_easyno2;

import java.util.Scanner;

public class Ukl_easyNo2 {

    public static void main(String[] args) {
        Scanner Walah = new Scanner(System.in);

        System.out.print("Masukan total belanjaan anda : ");
        int totalBelanja = Walah.nextInt();

        int diskon = 0;
        if (totalBelanja >= 200000) {
            diskon = 20;
            
        } else if (totalBelanja >= 100000) {
            diskon = 10;
        }
        int jumlahDiskon = (totalBelanja * diskon) / 100;
        int bayar = totalBelanja - jumlahDiskon;

        System.out.println("Total belanja : " + totalBelanja);
        System.out.println("Mendapat diskon : " + diskon + " Persen");
        System.out.println("Membayar sebesar : " + bayar);
    }
}
