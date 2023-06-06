import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int dividendo;
        int divisor;

        do {

            System.out.println("Ingresa el divisor. Tiene que ser mayor a 1");
            divisor = sc.nextInt();

        } while (divisor < 1);

        do {

            System.out.println("Ingresa el dividendo. Tiene que ser mayor que el divisor");
            dividendo = sc.nextInt();

        } while (dividendo < divisor);

        restas(dividendo, divisor);

    }

    public static void restas(int dividendo, int divisor) {
        int cociente = 0;
        int residuo;

        do {

            residuo = dividendo - divisor;
            dividendo = residuo;
            cociente += 1;

        } while (residuo > divisor);

        System.out.println("El residuo es: " + dividendo + ". El cociente es: " + cociente);

    }

}
