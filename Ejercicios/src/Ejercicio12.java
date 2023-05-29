import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String frase = "";
        int correcto = 0;
        int incorrecto = 0;

        do {

            System.out.println("Ingresa la frase. Máximo 5 caracteres, debe iniciar con X y finalizar con O");
            System.out.println("Si deseas salir ingresa &&&&&");
            frase = sc.nextLine();

            if (frase.length() <= 5 && frase.startsWith("X") || frase.startsWith("x") && frase.endsWith("O") || frase.endsWith("o")) {

                correcto++;

            } else if (frase.equals("&&&&&")) {

                incorrecto = incorrecto;

            } else {

                incorrecto++;

            }

        } while (!frase.equals("&&&&&"));

        System.out.println("La cantidad de veces que la frase fue correcta fue: " + correcto);
        System.out.println("La cantidad de veces que la frase fue incorrecta fue: " + incorrecto);
    }

}
