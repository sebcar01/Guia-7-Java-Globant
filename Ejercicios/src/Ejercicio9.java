import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una palabra o frase");
        String frase = scanner.nextLine();
        String primeraLetra = frase.substring(0,1);

        if (primeraLetra.equals("A")) {

            System.out.println("La primera letra es una A!");

        } else {

            System.out.println("La primera letra no es una A :(");

        }

    }

}
