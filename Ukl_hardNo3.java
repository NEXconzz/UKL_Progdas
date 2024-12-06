package com.mycompany.ukl_hardno3;



public class Ukl_hardNo3 {

    public static void main(String[] args) {
        int[] arr = {3, 7, 3, 1, 7, 7, 5};

        int angkaPalingSering = arr[0];
        int maxFrekuensi = 1;

        for (int i = 0; i < arr.length; i++) {
            int frekuensi = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    frekuensi++;
                }
            }
            if (frekuensi > maxFrekuensi) {
                maxFrekuensi = frekuensi;
                angkaPalingSering = arr[i];
            }
        }

        System.out.println("Angka yang paling sering muncul adalah " + angkaPalingSering + " sebanyak " + maxFrekuensi + " kali.");
    }
}