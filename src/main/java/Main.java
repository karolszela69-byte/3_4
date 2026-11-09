import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą nieujemną do obliczenia silni (n!): ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Błąd: Silnia jest zdefiniowana tylko dla liczb nieujemnych.");
        } else {
            long silnia = 1; // Używamy typu long, bo wyniki silni rosną bardzo szybko

            for (int i = 1; i <= n; i++) {
                silnia *= i;
            }

            System.out.println(n + "! = " + silnia);
        }

        scanner.close();
    }
}
        
                