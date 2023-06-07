import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de filas");
        int n = sc.nextInt();
        System.out.println("Ingresa la cantidad de columnas");
        int m = sc.nextInt();

        int[][] matriz = new int[n][m];

        rellenarMatriz(matriz, n, m);
        mostrarSuma(matriz, n, m);

    }

    public static void rellenarMatriz(int[][] matriz, int n, int m) {

        for (int i = 0; i <= (n - 1); i++) {

            for (int j = 0; j <= (m - 1); j ++) {

                matriz[i][j] = (int) (Math.random() * 10);

            }

        }

    }

    public static void mostrarSuma(int[][] matriz, int n, int m) {
        int suma = 0;

        for (int i = 0; i <= (n - 1); i++) {

            for (int j = 0; j <= (m - 1); j++) {

                suma += matriz[i][j];

            }

        }

        System.out.println("La suma de la matriz es: " + suma);

    }

}
