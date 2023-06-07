import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] promedios = new double[4];

        rellenarNotas(promedios, sc);
        resultados(promedios);

    }

    public static void rellenarNotas(double[] promedios, Scanner sc) {
        double suma = 0;

        for (int i = 0; i <= 9; i++) {

            System.out.println("Ingresa la nota del primer trabajo del alumno " + (i + 1));
            suma += (sc.nextDouble() * 0.1);
            System.out.println("Ingresa la nota del segundo trabajo del alumno " + (i + 1));
            suma += (sc.nextDouble() * 0.15);
            System.out.println("Ingresa la nota del primer integrador del alumno " + (i + 1));
            suma += (sc.nextDouble() * 0.25);
            System.out.println("Ingresa la nota del segundo trabajo del alumno " + (i + 1));
            suma += (sc.nextDouble() * 0.5);

            promedios[i] = suma;

            suma = 0;

        }

    }

    public static void resultados(double[] promedios) {
        int aprobados = 0;
        int reprobados = 0;

        for (int i = 0; i <= 9; i++) {

            if (promedios[i] >= 7) {

                System.out.println("El alumno " + (i + 1) + " aprobó el cursado!");
                aprobados += 1;

            } else {

                System.out.println("El alumno " + (i + 1) + " reprobó el cursado :(");
                reprobados += 1;

            }

        }

        System.out.println("La cantidad de alumnos aprobados es: " + aprobados);
        System.out.println("La cantidad de alumnos reprobados es: " + reprobados);

    }

}
