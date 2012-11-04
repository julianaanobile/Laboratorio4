package aa;


import java.util.Arrays;
import javax.swing.JOptionPane;


public class OperacionesConMatrices {

    int m;
    int n;
    int[][] matrizA;
    int[][] matrizAT;

    public OperacionesConMatrices() {
        crearMatrizA();
        crearMatrizAT();
        for (int i = 0; i < matrizA.length; i++) {
            System.out.println(Arrays.toString(matrizA[i]));
        }
        System.out.println("\n");
        for (int i = 0; i < matrizAT.length; i++) {
            System.out.println(Arrays.toString(matrizAT[i]));
        }
    }

    private void crearMatrizA() {
        m = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas"));
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas"));
        matrizA = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrizA[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la posicion [" + i + "][" + j + "]"));
            }
        }
    }

    private void crearMatrizAT() {
        matrizAT = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrizAT[j][i] = matrizA[i][j];
            }
        }
    }

    public static void main(String[] args) {
        OperacionesConMatrices ocm = new OperacionesConMatrices();
    }
}
