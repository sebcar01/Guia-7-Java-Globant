public class Ejercicio18 {

    public static void main(String[] args) {

        int[][] matriz = new int[4][4];

        rellenarMatriz(matriz);
        mostrarMatriz(matriz);
        System.out.println("");
        mostrarTranspuesta(matriz);

    }

    public static void rellenarMatriz(int[][] matriz) {
        int min = 1;
        int max = 100;

        for (int i = 0; i <= 3; i++) {

            for (int j = 0; j <= 3; j++) {

                matriz[i][j] = (int) (Math.random() * (max - min + 1) + min);

            }

        }

    }

    public static void mostrarMatriz(int[][] matriz) {

        System.out.println("Versión original");

        for (int i = 0; i <= 3; i++) {

            for (int j = 0; j <= 3; j++) {

                System.out.print(matriz[i][j] + " ");

            }

            System.out.println("");

        }

    }

    public static void mostrarTranspuesta(int[][] matriz) {

        System.out.println("Versión transpuesta");

        for (int i = 0; i <= 3; i++) {

            for (int j = 0; j <= 3; j++) {

                System.out.print(matriz[j][i] + " ");

            }

            System.out.println("");

        }

    }

}
