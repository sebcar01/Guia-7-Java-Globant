import java.util.Scanner;

public class Ejercicio11GuiaTeorica {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String frase = "";
        do {

            System.out.println("Ingresa una frase, finaliza utilizando un punto (.)");
            frase = sc.nextLine();

        } while (!frase.endsWith("."));

        System.out.println("Tu frase codificada es: " + conversion(frase));

    }

    public static String conversion(String frase) {
        String resultado = "";

        String[] caracteres = new String[frase.length()];

        for (int i = 0; i <= (frase.length() - 1) ; i++) {

            caracteres[i] = frase.substring(i, i + 1);

            if (caracteres[i].equalsIgnoreCase("a")) {

                caracteres[i] = "@";

            } else if (caracteres[i].equalsIgnoreCase("e")) {

                caracteres[i] = "#";

            } else if (caracteres[i].equalsIgnoreCase("i")) {

                caracteres[i] = "$";

            } else if (caracteres[i].equalsIgnoreCase("o")) {

                caracteres[i] = "%";

            } else if (caracteres[i].equalsIgnoreCase("u")) {

                caracteres[i] = "*";

            }

            resultado = resultado.concat(caracteres[i]);

        }

        return resultado;

    }

}
