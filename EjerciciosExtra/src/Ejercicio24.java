import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de números que deseas ver de la sucesión de Fibonacci");
        int num = sc.nextInt();
        int[] vector = new int[num];

        sucesionFibonacci(num, vector);
        mostrarSucesion(num, vector);

    }

    public static void sucesionFibonacci(int num, int[] vector) {

        for (int i = 0; i <= (num - 1); i++) {

            if (i == 0 || i == 1) {

                vector[i] = 1;

            } else {

                vector[i] = vector[i - 1] + vector[i - 2];

            }

        }

    }

    public static void mostrarSucesion(int num, int[] vector){

        for (int i = 0; i <= (num - 1); i++) {

            if (i <= (num - 2)) {

                System.out.print(vector[i] + ", ");

            } else {

                System.out.println(vector[i]);

            }

        }

    }

}
