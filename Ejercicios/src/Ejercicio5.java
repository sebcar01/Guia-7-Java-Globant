import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número entero");
        int num = scanner.nextInt();

        System.out.println("El doble de " + num + " es: " + (num * 2));
        System.out.println("El triple de " + num + " es: " + (num * 3));
        System.out.println("La raíz cuadrada de " + num + " es: " + Math.sqrt(num));

    }

}
