import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un valor límite positivo");
        int limitePositivo = scanner.nextInt();
        System.out.println("Ingresa el primer número");
        int num = scanner.nextInt();

        if (num >= limitePositivo) {

            System.out.println("El número ingresado es mayor o igual al límite. Bai");

        } else {

            while (num < limitePositivo) {

                System.out.println("Ingresa el próximo número");
                num = num + scanner.nextInt();

            }

            System.out.println("El número superó el límite. Bai");

        }

    }

}
