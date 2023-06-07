import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de personas");
        int personas = sc.nextInt();

        verificacion(personas, sc);

    }

    public static void verificacion(int personas, Scanner sc) {
        String continuarONo = "";
        String nombre = "";
        int edad = 0;

        for (int i = 1; i <= personas; i++) {

            System.out.println("Ingresa el nombre de la persona " + i);
            nombre = sc.next();
            System.out.println("Ingresa la edad de la persona " + i);
            edad = sc.nextInt();

            if (edad < 18) {

                System.out.println(nombre + " es menor de edad.");

            } else {

                System.out.println(nombre + " es mayor de edad.");

            }

            System.out.println("Deseas seguir mostrando más personas?");
            continuarONo = sc.next();

            if (continuarONo.equalsIgnoreCase("no")) {

                System.out.println("Gracias por visitar el programa. Adios!");
                break;

            }

        }

    }

}
