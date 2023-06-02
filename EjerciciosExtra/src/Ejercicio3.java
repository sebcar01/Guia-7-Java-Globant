import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String letra = "";

        do {

            System.out.println("Ingresa una letra");
            letra = sc.nextLine();

        } while (letra.length() > 1);

        chequearLetra(letra);

    }

    public static void chequearLetra(String letra) {

        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {

            System.out.println(letra + " es una vocal!");

        } else {

            System.out.println(letra + " no es una vocal :(");

        }

    }

}
