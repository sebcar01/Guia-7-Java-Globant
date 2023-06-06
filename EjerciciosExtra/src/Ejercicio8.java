import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        int par = 0;
        int impar = 0;
        int total = 0;

        do {

            System.out.println("Ingresa un número");
            num = sc.nextInt();

            if (num > 0) {

                total += 1;

            }

            if (num % 2 == 0 && num > 0) {

                par += 1;

            } else if (num % 2 != 0 && num > 0) {

                impar += 1;

            }

            if (num % 5 == 0) {

                System.out.println("La cantidad total de números es : " + total);
                System.out.println("La cantidad de números pares es : " + par);
                System.out.println("La cantidad de números impares es : " + impar);
                break;

            }

        } while (num > 0 || num < 0);


    }

}
