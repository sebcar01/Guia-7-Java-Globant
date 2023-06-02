import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        do {

            System.out.println("Ingresa un número entre 1 y 10");
            num = sc.nextInt();

        } while (num < 1 || num > 10);

        conversion(num);

    }

    public static void conversion(int num) {

        System.out.print(num + " en su versión Romana es: ");

        switch (num) {

            case 1 -> System.out.println("I");
            case 2 -> System.out.println("II");
            case 3 -> System.out.println("III");
            case 4 -> System.out.println("IV");
            case 5 -> System.out.println("V");
            case 6 -> System.out.println("VI");
            case 7 -> System.out.println("VII");
            case 8 -> System.out.println("VIII");
            case 9 -> System.out.println("IX");
            case 10 -> System.out.println("X");

        }

    }

}
