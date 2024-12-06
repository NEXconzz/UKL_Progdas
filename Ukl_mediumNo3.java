package com.mycompany.ukl_mediumno3;

import java.util.Random;
import java.util.Scanner;

public class Ukl_mediumNo3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {

            int num1 = random.nextInt(10) + 1;
            int num2 = random.nextInt(10) + 1;

            int operatorChoice = random.nextInt(3);
            String operator = "";
            int correctAnswer = 0;

            if (operatorChoice == 0) {
                operator = "*";
                correctAnswer = num1 * num2;
            } else if (operatorChoice == 1) {
                operator = "/";
                correctAnswer = num1 / num2;
            } else {
                operator = "%";
                correctAnswer = num1 % num2;
            }

            System.out.println("Soal: " + num1 + " " + operator + " " + num2);
            System.out.print("Jawaban soal: ");

            int userAnswer = scanner.nextInt();
            if (userAnswer == correctAnswer) {
                System.out.println("Jawaban anda benar!");
            } else {
                System.out.println("Jawaban anda salah. Jawaban yang benar adalah: " + correctAnswer);
            }

            System.out.print("Apakah Anda ingin melanjutkan? (ya/tidak): ");
            String continueQuiz = scanner.next();
            if (continueQuiz.equalsIgnoreCase("tidak")) {
                System.out.println("Terima kasih telah bermain!");
                break;
            }
        }
    }
}
