public class Ejercicio12 {

    public static void main(String[] args) {
        String iString = "";
        String jString = "";
        String kString = "";

        for (int i = 0; i <= 4; i++) {

            for (int j = 0; j <= 4; j++) {

                for (int k = 0; k <= 4; k++) {

                    iString = Integer.toString(i);
                    if (iString.equals("3")) {

                        iString = "E";
                        System.out.print(iString + " - ");

                    } else {

                        System.out.print(i + " - ");

                    }

                    jString = Integer.toString(j);
                    if (jString.equals("3")) {

                        jString = "E";
                        System.out.print(jString + " - ");

                    } else {

                        System.out.print(j + " - ");

                    }

                    kString = Integer.toString(k);
                    if (kString.equals("3")) {

                        kString = "E";
                        System.out.println(kString);

                    } else {

                        System.out.println(k);

                    }


                }

            }

        }

    }

}
