import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        rellenarMatriz(matriz, sc);
        mostrarMatriz(matriz);
        System.out.println("");
        mostrarTranspuesta(matriz);
        antiSimetrica(matriz);

    }

    public static void rellenarMatriz(int[][] matriz, Scanner sc) {

        for (int i = 0; i <= 2; i++) {

            for (int j = 0; j <= 2; j++) {

                matriz[i][j] = sc.nextInt();

            }

        }

    }

    public static void mostrarMatriz(int[][] matriz) {

        System.out.println("Versión original");

        for (int i = 0; i <= 2; i++) {

            for (int j = 0; j <= 2; j++) {

                System.out.print(matriz[i][j] + " ");

            }

            System.out.println("");

        }

    }

    public static void mostrarTranspuesta(int[][] matriz) {

        System.out.println("Versión transpuesta");

        for (int i = 0; i <= 2; i++) {

            for (int j = 0; j <= 2; j++) {

                System.out.print(matriz[j][i] + " ");

            }

            System.out.println("");

        }

    }

    public static void antiSimetrica(int[][] matriz) {
        int conteo = 0;

        for (int i = 0; i <= 2; i++) {

            for (int j = 0; j <= 2; j++) {

                if (matriz[i][j] < 0) {

                    if (matriz[i][j] == (matriz[j][i] - (matriz[j][i] * 2))) {

                        conteo += 1;

                    }

                } else {

                    if (matriz[i][j] == (matriz[j][i] + (matriz[i][j] * 2))) {

                        conteo += 1;

                    }

                }

            }

        }

        if (conteo == 9) {

            System.out.println("La matriz es anti-simétrica!");

        } else {

            System.out.println("La matriz no es anti-simétrica :(");

        }

    }

}
