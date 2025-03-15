package Zad2_2;

import java.util.Scanner;

public class Zad2_2 {

    public static void main(String[] args) {
        System.out.println("Jak się nazywasz?");
        Scanner scanner = new Scanner(System.in);
        String imie;
        imie = scanner.next();
        System.out.println("Cześć " + imie);

    }
}