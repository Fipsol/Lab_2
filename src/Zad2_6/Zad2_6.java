package Zad2_6;

import java.util.Scanner;

public class Zad2_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int number;
        number = scanner.nextInt();
        if(number<=1)
        {
            System.out.println("Liczba nie jest liczbą pierwszą.");
        } else {
            for(int i=2;i<=Math.sqrt(number);i++){
                if(number%i==0)
                {
                    System.out.println("Liczba " + number + " nie jest liczbą pierwszą.");
                    return;
                }
            }
            System.out.println("Liczba " + number + " jest liczbą pierwszą.");
        }
    }
}
