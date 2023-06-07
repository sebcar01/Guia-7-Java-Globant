import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el tamaño del vector");
        int tamano = sc.nextInt();
        int[] vector = new int[tamano];
        int suma = 0;

        for (int i = 0; i <= (tamano - 1); i++) {

            System.out.println("Ingresa el valor para el índice " + i);
            vector[i] = sc.nextInt();
            suma += vector[i];

        }

        System.out.println("La sumatoria total del vector es: " + suma);

    }

}
