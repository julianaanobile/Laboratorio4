


import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class OperacionesConMatrices {

    int m;
    int n;
    int[][] matrizA;
    int[][] matrizAT;
    boolean esDiagonal;
    boolean esSimetrica;

    public OperacionesConMatrices() {
        JTextArea jTextArea = new JTextArea();
        String stringMatrizA = "";
        String stringMatrizAT = "";
        
        crearMatrizA();
        crearMatrizAT();
        verificarDiagonalYSimetria();
        
        
        stringMatrizA = imprimirMatrizA();
        stringMatrizAT = imprimirMatrizAT();
        
        jTextArea.append("   ***Programa Matrices***\n\n");
        jTextArea.append("Matriz A:\n");
        jTextArea.append(stringMatrizA);
        if(esDiagonal){
            jTextArea.append("\nLa Matriz A ES una Matriz Diagonal");
        }else{
            jTextArea.append("\nLa Matriz A NO es una Matriz Diagonal");
        }
        jTextArea.append("\n\nMatriz Traspuesta:\n");
        jTextArea.append(stringMatrizAT);
        if(esSimetrica){
            jTextArea.append("\nLa Matriz A ES una Matriz Simetrica\n");
        }else{
            jTextArea.append("\nLa Matriz A NO es una Matriz Simetrica\n");
        }
        JOptionPane.showMessageDialog(null, jTextArea);
    }

    private String imprimirMatrizAT() {
        String result = "";
        for (int i = 0; i < matrizAT.length; i++) {
            result = result +  Arrays.toString(matrizAT[i]) + "\n";
        }
        return result;
    }

    private String imprimirMatrizA() {
        String result = "";
        for (int i = 0; i < matrizA.length; i++) {
            result = result + Arrays.toString(matrizA[i]) + "\n";
        }
        return result;
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

     private void verificarDiagonalYSimetria() {
         esDiagonal = true;
         esSimetrica = true;
        if(n==m){
            for (int i = 0; i < matrizA.length; i++) {
                for (int j = 0; j < matrizA[i].length; j++) {
                    if(i!=j&&matrizA[i][j]!=0){
                        esDiagonal = false;
                    }
                    if(matrizA[i][j]!=matrizAT[i][j]){
                        esSimetrica=false;
                    }
                }
            }
        }else {
           esSimetrica = false;
           esDiagonal = false;
        }
    }
    
    public static void main(String[] args) {
        OperacionesConMatrices ocm = new OperacionesConMatrices();
    } 
}
