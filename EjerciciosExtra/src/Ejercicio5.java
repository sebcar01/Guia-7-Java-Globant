import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String categoria = "";
        double costo = 0;

        do {

            System.out.println("Ingresa la clase de socio. Tiene que ser A, B o C.");
            categoria = sc.nextLine();

        } while (categoria.length() > 1 || !categoria.equalsIgnoreCase("a") && !categoria.equalsIgnoreCase("b") && !categoria.equalsIgnoreCase("c"));

        do {

            System.out.println("Ingresa el costo del tratamiento. No puede ser 0 o negativo.");
            costo = sc.nextDouble();

        } while (costo < 1);

        descuento(categoria, costo);

    }

    public static void descuento(String categoria, double costo) {
        categoria = categoria.toUpperCase();

        switch (categoria) {

            case "A" -> {

                costo -= (costo * 0.5);
                System.out.println("Los socios categoría A reciben un descuento del 50%, por lo tanto el precio final de tu tratamiento es: $" + costo);

            }
            case "B" -> {

                costo -= (costo * 0.35);
                System.out.println("Los socios categoría B reciben un descuento del 35%, por lo tanto el precio final de tu tratamiento es: $" + costo);

            }
            case "C" -> System.out.println("Los socios categoría C no reciben descuento, por lo tanto el costo de tu tratamiento es: $" + costo);

        }

    }

}
