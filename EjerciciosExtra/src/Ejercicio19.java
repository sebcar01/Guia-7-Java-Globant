import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el tamaño de los 2 vectores");
        int tamano = sc.nextInt();
        int[] vector1 = new int[tamano];
        int[] vector2 = new int[tamano];

        ingresarDatos(vector1, vector2, sc, tamano);
        comparacion(vector1, vector2, sc, tamano);

    }

    public static void ingresarDatos(int[] vector1, int[] vector2, Scanner sc, int tamano) {

        for (int i = 0; i <= (tamano - 1 ); i++) {

            System.out.println("Ingresa el valor del índice " + i + " del vector 1");
            vector1[i] = sc.nextInt();
            System.out.println("Ingresa el valor del índice " + i + " del vector 2");
            vector2[i] = sc.nextInt();

        }

    }

    public static void comparacion(int[] vector1, int[] vector2, Scanner sc, int tamano) {
        int conteo = 0;

        for (int i = 0; i <= (tamano - 1); i++) {

            if (vector1[i] != vector2[i]) {

                System.out.println("Los valores del índice " + i + " son diferentes. Chau.");
                conteo += 1;
                break;

            }

        }

        if (conteo == 0) {

            System.out.println("Los vectores son iguales!");

        }

    }

}
