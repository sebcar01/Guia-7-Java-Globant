import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una frase");
        String frase = scanner.nextLine();

        if (frase.equals("eureka")) {

            System.out.println("Ingresaste la misma frase!");

        } else {

            System.out.println("La frase es diferente");
        }

    }

}
