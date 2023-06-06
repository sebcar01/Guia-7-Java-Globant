import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número");
        int num = sc.nextInt();

        System.out.println(num + " tiene " + calcularDigitos(num) + " dígitos.");

    }

    public static int calcularDigitos(int num) {
        int contador = 0;

        do {

            num /= 10;
            contador += 1;

        } while (num > 0);

        return contador;

    }

}
