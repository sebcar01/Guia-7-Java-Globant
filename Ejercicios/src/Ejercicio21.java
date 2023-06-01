public class Ejercicio21 {

    public static void main(String[] args) {

        int[][] matrizM = new int[10][10];
        int[][] matrizP = new int[3][3];

        rellenarMatrizM(matrizM);
        rellenarMatrizP(matrizP);
        comprobarMatrices(matrizM, matrizP);

    }

    public static void rellenarMatrizM(int[][] matriz) {

        matriz[0][0] = 36;
        matriz[0][1] = 5;
        matriz[0][2] = 67;
        matriz[0][3] = 823542;
        matriz[0][4] = 905;
        matriz[0][5] = 5435;
        matriz[0][6] = 72;
        matriz[0][7] = 81;
        matriz[0][8] = 95;
        matriz[0][9] = 10;
        matriz[1][0] = 89;
        matriz[1][1] = 90;
        matriz[1][2] = 75;
        matriz[1][3] = 21;
        matriz[1][4] = 41;
        matriz[1][5] = 22;
        matriz[1][6] = 67;
        matriz[1][7] = 20;
        matriz[1][8] = 10;
        matriz[1][9] = 61;
        matriz[2][0] = 14;
        matriz[2][1] = 22;
        matriz[2][2] = 26;
        matriz[2][3] = 90;
        matriz[2][4] = 9;
        matriz[2][5] = 90;
        matriz[2][6] = 17;
        matriz[2][7] = 12;
        matriz[2][8] = 87;
        matriz[2][9] = 67;
        matriz[3][0] = 41;
        matriz[3][1] = 87;
        matriz[3][2] = 24;
        matriz[3][3] = 56;
        matriz[3][4] = 97;
        matriz[3][5] = 74;
        matriz[3][6] = 87;
        matriz[3][7] = 42;
        matriz[3][8] = 64;
        matriz[3][9] = 35;
        matriz[4][0] = 32;
        matriz[4][1] = 76;
        matriz[4][2] = 79;
        matriz[4][3] = 1;
        matriz[4][4] = 54;
        matriz[4][5] = 66;
        matriz[4][6] = 68;
        matriz[4][7] = 96;
        matriz[4][8] = 12;
        matriz[4][9] = 11;
        matriz[5][0] = 99;
        matriz[5][1] = 13;
        matriz[5][2] = 54;
        matriz[5][3] = 88;
        matriz[5][4] = 897;
        matriz[5][5] = 92;
        matriz[5][6] = 73;
        matriz[5][7] = 16;
        matriz[5][8] = 41;
        matriz[5][9] = 76;
        matriz[6][0] = 67;
        matriz[6][1] = 78;
        matriz[6][2] = 87;
        matriz[6][3] = 45;
        matriz[6][4] = 15;
        matriz[6][5] = 24;
        matriz[6][6] = 27;
        matriz[6][7] = 42;
        matriz[6][8] = 56;
        matriz[6][9] = 78;
        matriz[7][0] = 98;
        matriz[7][1] = 45;
        matriz[7][2] = 34;
        matriz[7][3] = 23;
        matriz[7][4] = 32;
        matriz[7][5] = 56;
        matriz[7][6] = 74;
        matriz[7][7] = 16;
        matriz[7][8] = 19;
        matriz[7][9] = 18;
        matriz[8][0] = 24;
        matriz[8][1] = 67;
        matriz[8][2] = 97;
        matriz[8][3] = 46;
        matriz[8][4] = 87;
        matriz[8][5] = 13;
        matriz[8][6] = 67;
        matriz[8][7] = 89;
        matriz[8][8] = 93;
        matriz[8][9] = 24;
        matriz[9][0] = 21;
        matriz[9][1] = 68;
        matriz[9][2] = 78;
        matriz[9][3] = 98;
        matriz[9][4] = 90;
        matriz[9][5] = 67;
        matriz[9][6] = 12;
        matriz[9][7] = 41;
        matriz[9][8] = 65;
        matriz[9][9] = 12;

    }

    public static void rellenarMatrizP(int[][] matriz) {

        matriz[0][0] = 36;
        matriz[0][1] = 5;
        matriz[0][2] = 67;
        matriz[1][0] = 89;
        matriz[1][1] = 90;
        matriz[1][2] = 75;
        matriz[2][0] = 14;
        matriz[2][1] = 22;
        matriz[2][2] = 26;

    }

    public static void comprobarMatrices(int[][] matrizM, int[][] matrizP) {
        int conteo = 0;
        int fila = 0;
        int columna = 0;

        for (int i = 0; i <= 9; i++) {

            for (int j = 0; j <= 9; j++) {

                if (matrizM[i][j] == matrizP[0][0] && matrizM[i][j + 1] == matrizP[0][1] && matrizM[i][j + 2] == matrizP[0][2]) {

                    conteo += 1;
                    fila = i;
                    columna = j;
                    break;

                }

                if (conteo < 2 && matrizM[fila + 1][columna] == matrizP[1][0] && matrizM[fila + 1][columna + 1] == matrizP[1][1] && matrizM[fila + 1][columna + 2] == matrizP[1][2]) {

                    conteo += 1;

                }

                if (conteo < 3 && matrizM[fila + 2][columna] == matrizP[2][0] && matrizM[fila + 2][columna + 1] == matrizP[2][1] && matrizM[fila + 2][columna + 2] == matrizP[2][2]) {

                    conteo += 1;

                }

            }

        }

        if (conteo == 3) {

            System.out.println("La Matriz P está contenida en la Matriz M!");
            System.out.println("El primer elemento de la Matriz P se encuentra en la posicion [ " + fila + ", " + columna + " ] de la Matriz M.");

        } else {

            System.out.println("La Matriz P no está contenida en la Matriz M :(");

        }

    }

}
