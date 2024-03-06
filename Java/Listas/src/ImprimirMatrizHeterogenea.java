public class ImprimirMatrizHeterogenea {
    public static void imprimirMatrizDouble(double[][] matriz, int fila, int columna) {
        System.out.println(" ");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    public static void imprimirMatrizInt(int[][] matriz, int fila, int columna) {
        System.out.println(" ");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    public static void imprimirMatrizString(String[][] matriz, int fila, int columna) {
        System.out.println(" ");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
}
