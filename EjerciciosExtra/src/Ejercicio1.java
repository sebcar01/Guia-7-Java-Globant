import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa los minutos");
        int minutos = sc.nextInt();

        conversion(minutos); // 1600

    }

    public static void conversion(int minutos) { // 1 dia, 2 horas
        int dias = Math.round(minutos / 1440);
        int horas = 0;

        if (minutos < 1440) {

            horas = Math.round(minutos / 60);

        } else {

            horas = ((minutos / 60) % 24 );

        }

        if (dias > 1 || dias == 0) {

            System.out.print(minutos + " minutos son: " + dias + " días, ");

        } else {

            System.out.print(minutos + " minutos son: " + dias + " día, ");

        }

        if (horas > 1 || horas == 0) {

            System.out.println(horas + " horas. ");

        } else {

            System.out.println(horas + " hora. ");

        }

    }

}
