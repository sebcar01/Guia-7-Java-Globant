import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el tamaño del vector");
        int tamano = sc.nextInt();
        int num;

        int[] vector = new int[tamano];
        rellenarVector(vector, tamano);

        do {

            System.out.println("Ingresa el número deseas buscar en el vector. Mayor a 1, menor o igual que 100");
            num = sc.nextInt();

        } while (num < 1 || num > 100);

        buscarNumero(num, vector, tamano);

    }

    public static void rellenarVector(int[] vector, int tamano) {
        int min = 1;
        int max = 100;

        for (int i = 0; i <= (tamano - 1); i++) {

            vector[i] = (int) (Math.random() * (max - min + 1) + min);

        }

    }

    public static void buscarNumero(int num, int[] vector, int tamano) {
        int conteo = 0;

        for (int i = 0; i <= (tamano - 1); i++) {

            if (num == vector[i]) {

                System.out.println(num + " se encuentra en la posición " + i);
                conteo += 1;

            }

        }

        if (conteo > 1) {

            System.out.println(num + " se encontró " + conteo + " veces.");

        } else if (conteo == 0) {

            System.out.println("El número no se encontró.");

        }

    }

}
