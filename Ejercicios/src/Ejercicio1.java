import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el primer número");
        int primerNumero = scanner.nextInt();
        System.out.println("Ingresa el segundo número");
        int segundoNumero = scanner.nextInt();

        System.out.println("El resultado de la suma de los dos números es: " + (primerNumero + segundoNumero));
    }
}
