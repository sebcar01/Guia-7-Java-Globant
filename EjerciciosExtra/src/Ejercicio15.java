import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa dos números");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Ingresa alguna de las siguientes opciones");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        int opcion = sc.nextInt();

        switch (opcion) {

            case 1 -> System.out.println("El resultado de la suma entre " + num1 + " y " + num2 + " es: " + suma(num1, num2));
            case 2 -> System.out.println("El resultado de la resta entre " + num1 + " y " + num2 + " es: " + resta(num1, num2));
            case 3 -> System.out.println("El resultado de la multiplicación entre " + num1 + " y " + num2 + " es: " + multiplicacion(num1, num2));
            case 4 -> System.out.println("El resultado de la división entre " + num1 + " y " + num2 + " es: " + division( num1, num2));
            default -> System.out.println("Opción inválida. Adiós!");

        }

    }

    public static int suma(int num1, int num2) {

        return num1 + num2;

    }

    public static int resta(int num1, int num2) {

        return num1 - num2;

    }

    public static int multiplicacion(int num1, int num2) {

        return num1 * num2;

    }

    public static double division(double num1, double num2) {

        return num1 / num2;

    }

}
