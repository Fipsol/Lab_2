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
                case 3:
                    case 4:
                case 5:
                    czyPrawda = false;
                    break;


            }
        }
    }
}
