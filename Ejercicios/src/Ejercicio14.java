import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de euros para la conversión");
        double euros = sc.nextDouble();
        int opcionMenu;
        String aConvertir = "";

        do {

            System.out.println("Selecciona la moneda a la cuál quieres convertir");
            System.out.println("1 - Dólares");
            System.out.println("2 - Libras");
            System.out.println("3 - Yenes");
            System.out.println("4 - Salir");
            opcionMenu = sc.nextInt();

            switch (opcionMenu) {

                case 1 -> {

                    aConvertir = "Dolares";
                    conversion(euros, aConvertir);

                }
                case 2 -> {

                    aConvertir = "Libras";
                    conversion(euros, aConvertir);

                }
                case 3 -> {

                    aConvertir = "Yenes";
                    conversion(euros, aConvertir);

                }
                case 4 -> System.out.println("Gracias por visitar el programa. Bai!");
                default -> System.out.println("El número ingresado no es válido");

            }

        } while (opcionMenu != 4);

    }

    public static void conversion(double euros, String divisa) {
        double conversion = 0;

       if (divisa.equals("Dolares")) {

           conversion = euros * 1.28611;
           System.out.println(euros + " Euros son: " + conversion + " Dólares.");

       } else if (divisa.equals("Libras")) {

            conversion = euros * 0.86;
            System.out.println(euros + " Euros son: " + conversion + " Libras.");

        } else {

            conversion = euros * 129.852;
            System.out.println(euros + " Euros son: " + conversion + " Yenes.");

        }

    }

}
