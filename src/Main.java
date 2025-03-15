import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    boolean czyPrawda = true;

    public static float[] pobierzLiczby(){
        float[] liczby = new float[2];
        System.out.println("Podaj liczbę A: ");
        liczby[0] = scanner.nextFloat();
        System.out.println("Podaj liczbę B: ");
        liczby[1] = scanner.nextFloat();
        return liczby;
    }
    public static void dodajLiczba(float a, float b){
    System.out.println("A + B = " + (a + b));
    }
    public static void odejmijLiczba(float a, float b){
        System.out.println("A - B = " + (a - b));
    }
    public static void pomnozLiczba(float a, float b){
        System.out.println("A * B = " + (a * b));
    }
    public static void podzielLiczba(float a, float b){
        System.out.println("A / B = " + (a / b));
    }
    public static void main(String[] args) {
        float [] liczby;
        boolean czyPrawda = true;
        while (czyPrawda) {
            System.out.print("Wybierz program:\n1.Dodawanie\n2.Odejmowanie\n3.Mnożenie\n4.Dzielenie\n5.Zakończ program\n");
            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    liczby = pobierzLiczby();
                    dodajLiczba(liczby[0], liczby[1]);
                    break;
                case 2:
                    liczby = pobierzLiczby();
                    odejmijLiczba(liczby[0], liczby[1]);
                    break;
                case 3:
                    liczby = pobierzLiczby();
                    pomnozLiczba(liczby[0], liczby[1]);
                    break;
                case 4:
                    liczby = pobierzLiczby();
                    while(liczby[1] == 0){
                        System.out.print("Nie można dzielić przez 0.\n");
                        liczby =  pobierzLiczby();
                    }
                    podzielLiczba(liczby[0], liczby[1]);
                    break;
                case 5:
                    czyPrawda = false;
                    break;
            }
        }
    }
}