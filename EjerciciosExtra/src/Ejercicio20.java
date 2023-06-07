public class Ejercicio20 {

    public static void main(String[] args) {

        int[] vector = new int[3];

        rellenarVector(vector);
        mostrarVector(vector);

    }

    public static void rellenarVector(int[] vector) {

        for (int i = 0; i <= 2; i++) {

            vector[i] = (int) (Math.random() * 10);

        }

    }

    public static void mostrarVector(int[] vector) {

        for (int i = 0; i <= 2; i++) {

            System.out.println("El valor del índice " + i + " es: " + vector[i]);

        }

    }

}
