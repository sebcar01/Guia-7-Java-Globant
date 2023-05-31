import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el tamaño del vector");
        int tamano = sc.nextInt();

        int[] vector = new int[tamano];
        rellenarVector(vector, tamano);
        conteoNumeros(vector, tamano);

    }

    public static void rellenarVector(int[] vector, int tamano) {
        int min = 1;
        int max = 11000;

        for (int i = 0; i <= (tamano - 1); i++) {

            vector[i] = (int) (Math.random() * (max - min + 1) + min);

        }

    }

    public static void conteoNumeros(int[] vector, int tamano) {
        int conteo1digito = 0;
        int conteo2digitos = 0;
        int conteo3digitos = 0;
        int conteo4digitos = 0;
        int conteo5digitos = 0;

        for (int i = 0; i <= (tamano - 1); i++) {

           if (vector[i] < 1 && vector[i] < 10) {

               conteo1digito += 1;

           } else if (vector[i] > 9 && vector[i] < 100) {

               conteo2digitos += 1;

           } else if (vector[i] > 99 && vector[i] < 1000) {

               conteo3digitos += 1;

           } else if (vector[i] > 999 && vector[i] < 10000) {

               conteo4digitos += 1;

           } else {

               conteo5digitos += 1;

           }

        }

        System.out.println("La cantidad de números con un 1 dígito es: " + conteo1digito);
        System.out.println("La cantidad de números con un 2 dígitos es: " + conteo2digitos);
        System.out.println("La cantidad de números con un 3 dígitos es: " + conteo3digitos);
        System.out.println("La cantidad de números con un 4 dígitos es: " + conteo4digitos);
        System.out.println("La cantidad de números con un 5 dígitos es: " + conteo5digitos);

    }

}
