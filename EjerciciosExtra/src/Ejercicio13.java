import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el tamaño de la escalera");
        int tamano = sc.nextInt();

        escalera(tamano);

    }

    public static void escalera(int tamano) {

        for (int i = 1; i <= tamano; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(j);

            }

            System.out.println("");

        }

    }

}
