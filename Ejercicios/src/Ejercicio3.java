import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una frase");
        String fraseUsuario = scanner.nextLine();
        System.out.println("Tu frase en mayúsculas: " + fraseUsuario.toUpperCase());
        System.out.println("Tu frase en minúsculas: " + fraseUsuario.toLowerCase());

    }

}
