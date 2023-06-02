import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int totalPersonas;

        do {

            System.out.println("Ingresa el número de personas. No puede ser menor a 2 o negativo.");
            totalPersonas = sc.nextInt();

        } while (totalPersonas < 2);

        promedios(totalPersonas, sc);

    }

    public static void promedios(int total, Scanner sc) {
        double promedioTotal = 0;
        double promedioInferior = 0;
        double estatura = 0;
        int totalInferior = 0;

        for (int i = 1; i <= total; i++) {

            System.out.println("Ingresa la estatura de la persona " + i);
            estatura = sc.nextDouble();
            promedioTotal += estatura;

            if (estatura <= 1.60) {

                promedioInferior += estatura;
                totalInferior += 1;

            }

        }

        System.out.println("El promedio de estatura debajo de 1.60 fue: " + (promedioInferior / totalInferior));
        System.out.println("El promedio general de estatura fue: " + (promedioTotal / total));


    }

}
