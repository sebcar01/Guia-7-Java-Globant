import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 0;

        do {

            System.out.println("Ingresa la cantidad de números a ingresar. Tiene que ser mayor a 0.");
            num = sc.nextInt();

        } while (num < 0);

        //cicloWhile(num, sc);
        cicloDoWhile(num, sc);

    }

    public static void cicloWhile(int num, Scanner sc) {
        int mayor = 0;
        int menor = 10;
        int conteo = 0;
        int sum = 0;
        double promedio = 0;

        while (conteo < num) {

            System.out.println("Ingresa el número");
            int numeroActual = sc.nextInt();

            if (numeroActual > mayor) {

                mayor = numeroActual;

            }

            if (numeroActual < menor) {

                menor = numeroActual;

            }

            sum += numeroActual;
            conteo += 1;

        }

        promedio = (double) sum / num;

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
        System.out.println("El promedio es: " + promedio);

    }

    public static void cicloDoWhile(int num, Scanner sc) {
        int mayor = 0;
        int menor = 10;
        int conteo = 0;
        int sum = 0;
        double promedio = 0;

        do {

            System.out.println("Ingresa el número");
            int numeroActual = sc.nextInt();

            if (numeroActual > mayor) {

                mayor = numeroActual;

            }

            if (numeroActual < menor) {

                menor = numeroActual;

            }

            sum += numeroActual;
            conteo += 1;

        } while (conteo < num);

        promedio = (double) sum / num;

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
        System.out.println("El promedio es: " + promedio);

    }

}
