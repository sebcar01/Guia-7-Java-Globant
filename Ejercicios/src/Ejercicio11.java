import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el primer número entero");
        int primerNumero = scanner.nextInt();
        System.out.println("Ingresa el segundo número entero");
        int segundoNumero = scanner.nextInt();
        int opcionMenu;

        do {

            System.out.println("Escoge alguna de las siguientes opciones del menú:");
            System.out.println("Menú");
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Salir");
            opcionMenu = scanner.nextInt(); // \n

            switch(opcionMenu) {

                case 1 -> System.out.println("La suma entre " + primerNumero + " y " + segundoNumero + " es: " + (primerNumero + segundoNumero));
                case 2 -> System.out.println("La resta entre " + primerNumero + "y " + segundoNumero + " es: " + (primerNumero - segundoNumero));
                case 3 -> System.out.println("La multiplicación entre " + primerNumero + "y " + segundoNumero + " es: " + (primerNumero * segundoNumero));
                case 4 -> System.out.println("La división entre " + primerNumero + "y " + segundoNumero + " es: " + (primerNumero / segundoNumero));
                case 5 -> {

                    System.out.println("¿Estás seguro de salir? (S/N)");
                    String salirONo = scanner.next();

                    if (salirONo.equals("S")) {

                        System.out.println("Gracias por visitar el menú. Bai");

                    } else {

                        opcionMenu = 0;

                    }

                }

                default -> System.out.println("La opción ingresada no es válida. Bai");

            }

        } while (opcionMenu != 5);


    }

}
