import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);

        int multiplicacion = num1 * num2;

        do {

            System.out.println("Ingresa el resultado");
            num = sc.nextInt();

            if (num == multiplicacion) {

                System.out.println("Felicidades! Adivinaste el número!");

            } else {

                System.out.println("Resultado incorrecto. Intenta de nuevo.");

            }

        } while (num != multiplicacion);

    }

}
