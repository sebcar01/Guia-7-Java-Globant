import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[][] matriz = new String[20][20];

        llenarSopaDeLetras(matriz, sc);
        mostrarSopaDeLetras(matriz);

    }

    public static void llenarSopaDeLetras(String[][] matriz, Scanner sc){
        int min = 0;
        int max = 19;
        int[] vector = new int[5];
        String num = "";
        int j;
        String palabra = "";

        for (int i = 1; i <= 5; i++) {

            do {

                System.out.println("Ingresa la palabra " + i + ". La longitud tiene que ser mayor o igual a 3 y menor o igual a 5");
                palabra = sc.nextLine();

            } while (palabra.length() < 3 || palabra.length() > 5);

            for (int l = 0; l <= 4; l++) {

                vector[l] = (int) (Math.random() * (max - min + 1) + min);

            }

            for (int l = 0; l <= 4; l++) {

                if (l <= 3) {

                    if (vector[l] == vector[l + 1]) {

                        vector[l + 1] = (int) (Math.random() * (max - min + 1) + min);

                    }

                }

            }

            j = vector[i - 1];

            for (int k = 0; k <= 19; k++) {

                if (k <= (palabra.length() - 1)) {

                    matriz[j][k] = palabra.substring(k,k + 1);

                }

            }

        }

        max = 9;

        for (int i = 0; i <= 19; i++) {

            for (j = 0; j <= 19; j++) {

                if (matriz[i][j] == null) {

                    num = num.valueOf((int) (Math.random() * (max - min + 1) + min));
                    matriz[i][j] = num;

                }

            }

        }

    }

    public static void mostrarSopaDeLetras(String[][] matriz) {

        for (int i = 0; i <= 19; i++) {

            for (int j = 0; j <= 19; j++) {

                if (j == 19) {

                    System.out.println(matriz[i][j]);

                } else {

                    System.out.print(matriz[i][j] + " | ");

                }

            }

        }

    }

}
