public class Ejercicio2 {

    public static void main(String[] args) {

        int A = 13;
        int B = 2;
        int C = 4;
        int D = 6;

        cambioDeValores(A,B,C,D);

    }

    public static void cambioDeValores(int a, int b, int c, int d) {
        int aux;

        System.out.println("Valor original de A: " + a);
        System.out.println("Valor original de B: " + b);
        System.out.println("Valor original de C: " + c);
        System.out.println("Valor original de D: " + d);

        aux = a;
        a = d;
        d = b;
        b = c;
        c = aux;

        System.out.println("Valor nuevo de A: " + a);
        System.out.println("Valor nuevo de B: " + b);
        System.out.println("Valor nuevo de C: " + c);
        System.out.println("Valor nuevo de D: " + d);

    }

}
