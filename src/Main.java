import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a, b;
        boolean czyPrawda = true;


        while (czyPrawda) {
            System.out.print("Wybierz program:\n1.Dodawanie\n2.Odejmowanie\n3.Mnożenie\n4.Dzielenie\n5.Zakończ program\n");
            int userChoice = scanner.nextInt();
            switch (userChoice) {
                case 1:
                    System.out.print("Podaj liczbę A: ");
                    a = scanner.nextFloat();
                    System.out.print("Podaj liczbę B: ");
                    b = scanner.nextFloat();
                    System.out.println("A + B = " + (a + b));
                    break;
                case 2:
                    System.out.print("Podaj liczbę A: ");
                    a = scanner.nextFloat();
                    System.out.print("Podaj liczbę B: ");
                    b = scanner.nextFloat();
                    System.out.println("A - B = " + (a - b));
                    break;
                case 3:
                    System.out.print("Podaj liczbę A: ");
                    a = scanner.nextFloat();
                    System.out.print("Podaj liczbę B: ");
                    b = scanner.nextFloat();
                    System.out.println("A * B = " + (a * b));
                    break;
                case 4:
                    System.out.print("Podaj liczbę A: ");
                    a = scanner.nextFloat();
                    System.out.print("Podaj liczbę B: ");
                    b = scanner.nextFloat();
                    if(b == 0){
                        System.out.print("Nie można dzielić przez 0.\n");
                        System.out.print("Podaj liczbę A: ");
                        a = scanner.nextFloat();
                        System.out.print("Podaj liczbę B: ");
                        b = scanner.nextFloat();
                    }
                    System.out.println("A / B = " + (a / b));
                    break;
                case 5:
                    czyPrawda = false;
                    break;
            }
        }
    }
}
