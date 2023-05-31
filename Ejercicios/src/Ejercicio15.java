public class Ejercicio15 {

    public static void main(String[] args) {

        int[] vector = new int[100];
        rellenarVector(vector);
        mostrarVector(vector);

    }

    public static void rellenarVector(int[] vector) {

        for (int i = 0; i <= 99 ; i++) {

            vector[i] = i + 1;

        }

    }

    public static void mostrarVector(int[] vector) {

        for (int i = 99; i >= 0; i--) {

            System.out.println(vector[i]);

        }

    }

}
