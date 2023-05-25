import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una frase o palabra");
        String fraseOPalabra = scanner.nextLine();

        if (fraseOPalabra.length() <= 8) {

            System.out.println("Tu frase o palabra es menor o igual a 8 caracteres!");

        } else {

            System.out.println("Tu frase o palabra es mayor a 8 caracteres!");

        }

    }

}
