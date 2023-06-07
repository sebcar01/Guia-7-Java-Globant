import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número");
        int num = sc.nextInt();

        verificacionPrimo(num, sc);

    }

    public static void verificacionPrimo(int num, Scanner sc) {
        int i = 2;
        int conteo = 0;

        do {

            if (i != num && num % i == 0) {

                conteo += 1;

            }

            i += 1;

        } while (i <= num);

        if (conteo != 0) {

            System.out.println(num + " no es un número primo.");

        } else {

            System.out.println(num + " es un número primo.");

        }

    }

}
