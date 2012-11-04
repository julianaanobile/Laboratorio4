
import javax.swing.JOptionPane;


public class OperacionesConMatrices {

    int m;
    int n;
    int [][] matrizA;
    
    public OperacionesConMatrices() {
        m = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas"));
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas"));
        matrizA = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrizA[m][n] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la posicion ["+m+"]["+n+"]"));
            }
        }
    }
    
    public static void main(String[] args) {
        
    }
    
    
    
    
}
