import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        rellenarMatriz(matriz, sc);
        comprobarMatriz(matriz);

    }

    public static void rellenarMatriz(int[][] matriz, Scanner sc) {
        int valor = 0;

        for (int i = 0; i <= 2; i++) {

            for (int j = 0; j <= 2; j++) {

                do {

                    System.out.println("Ingresa el valor de la posición [ " + i + ", " + j + " ]");
                    valor = sc.nextInt();

                } while (valor < 1 || valor > 9);

                matriz[i][j] = valor;

            }

        }

    }

    public static void comprobarMatriz(int[][] matriz) {
        int[] vectorFilas = new int[3];
        int[] vectorColumnas = new int[3];
        int sumaFilas = 0;
        int sumaColumnas = 0;
        int sumaVerticalPrincipal = 0;
        int sumaVerticalSecundaria = 0;
        boolean chequeoVerticales = false;
        boolean chequeoFyC = true;

        for (int i = 0; i <= 2; i++) {

            for (int j = 0; j <= 2; j++) {

                sumaFilas += matriz[i][j];

                sumaColumnas += matriz[j][i];

                if (i == j) {

                    sumaVerticalPrincipal += matriz[j][i];

                }

            }

            vectorFilas[i] = sumaFilas;
            vectorColumnas[i] = sumaColumnas;
            sumaFilas = 0;
            sumaColumnas = 0;

        }

        // Vertical secundaria

        int j = 2;
        for (int i = 0; i <= 2; i++) {

            sumaVerticalSecundaria += matriz[i][j];
            j -= 1;

        }

        // Comprobacion filas y columnas

        for (int i = 0; i <= 2; i++) {

            for (j = 1; j <= 2; j++) {

                if (vectorFilas[i] != vectorColumnas[i] || vectorFilas[i] != vectorFilas[j] || vectorColumnas[i] != vectorColumnas[j]) {

                    chequeoFyC = false;

                }

            }

        }

        chequeoVerticales = sumaVerticalPrincipal == sumaVerticalSecundaria;

        if (chequeoFyC && chequeoVerticales) {

            System.out.println("Esta es una matriz mágica, por lo tanto la suma de cualquier fila, columna o vertical es: " + sumaVerticalPrincipal);

        } else {

            System.out.println("Esta no es una matriz mágica");

        }

    }

}
