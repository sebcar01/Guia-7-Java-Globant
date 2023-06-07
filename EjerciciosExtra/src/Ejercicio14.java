import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de familias");
        int familias = sc.nextInt();

        calculoHijos(familias, sc);



    }

    public static void calculoHijos(int familias, Scanner sc) {
        int edad = 0;
        int suma = 0;

        for (int i = 1; i <= familias; i++) {

            System.out.println("Ingresa la cantidad de hijos de la familia " + i);
            int hijos = sc.nextInt();

            for (int j = 1; j <= hijos; j++) {

                System.out.println("Ingresa la edad del hijo " + j + " de la familia " + i);
                edad = sc.nextInt();
                suma += edad;

            }

            System.out.println("El promedio de edad de los hijos de la familia " + i + " es: " + (suma / hijos));

        }

    }

}
