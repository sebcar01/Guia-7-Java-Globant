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
        int[] vectorFila = new int[5];
        int[] vectorColumna = new int[5];
        int j;
        int k;
        int conteo = 0;
        String palabra = "";

        numeroAleatorio(vectorFila, min, max); // Se generan 5 numeros aleatorios para las filas, se verifica que no se repitan
        max = 15;
        numeroAleatorio(vectorColumna, min, max); // Se generan 5 numeros aleatorios para las filas, se verifica que no se repitan

        for (int i = 0; i <= 4; i++) { // 1

            // Se ingresa la palabra y se verifica que sea mayor a 3 y menor a 5

            do {

                System.out.println("Ingresa la palabra " + (i + 1) + ". La longitud tiene que ser mayor o igual a 3 y menor o igual a 5");
                palabra = sc.nextLine();

            } while (palabra.length() < 3 || palabra.length() > 5);

            // Se ingresa la palabra en la fila y columnas aleatorias que se generaron anteriormente

            j = vectorFila[i];
            k = vectorColumna[i];

            while (conteo <= palabra.length() - 1) {

                matriz[j][k] = palabra.substring(conteo,conteo + 1);
                conteo += 1;
                k += 1;

            }

            conteo = 0;

        }

        // Se rellenan los espacios vacios con numeros aleatorios, maximo el numero 9

        max = 9;

        numeroAleatorio(matriz, min, max);

    }

    public static void numeroAleatorio(int[] vector, int min, int max) {

        for (int i = 0; i <= 4; i++) {

            vector[i] = (int) (Math.random() * (max - min + 1) + min);

        }

        verificarRepetidos(vector, min, max);

    }

    public static void verificarRepetidos(int[] vector, int min, int max) {

        for (int i = 0; i <= 4; i++) {

            for (int j = 1; j <= 4; j++) {

                if (i != j) {

                    if (vector[i] == vector[j]) {

                        vector[j] = (int) (Math.random() * (max - min + 1) + min);

                    }

                }

            }

        }

    }

    public static void numeroAleatorio(String[][] matriz, int min, int max) {
        String num = "";

        for (int i = 0; i <= 19; i++) {

            for (int j = 0; j <= 19; j++) {

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
