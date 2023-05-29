import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el tamaño del cuadrado");
        int tamano = sc.nextInt();
        cuadrado(tamano);

    }

    public static void cuadrado(int tamano) {

        for (int i = 0; i <= tamano; i++) {

            for (int j = 1; j <= tamano; j++) {

                if (i == 0 || i == tamano || j == 1 || j == tamano) {

                    System.out.print("*");

                } else {

                    System.out.print(" ");

                }

            }

            System.out.println("");

        }

    }

}
