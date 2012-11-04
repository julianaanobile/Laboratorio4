


import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class ProductoPunto {
    
    int [] A = new int[5];
    int [] B = new int[5];
    int productoPunto;

    public ProductoPunto() {
        llenarVectores();
        calcularProductoPunto();
        
        JTextArea textArea = new JTextArea();
        
        textArea.append("\nVector A = " + Arrays.toString(A));
        textArea.append("\n\nVector B = " + Arrays.toString(B));
        textArea.append("\n\nProducto Punto = " + productoPunto+"\n\n");
        
        JOptionPane.showMessageDialog(null, textArea);
        
    }

    private void calcularProductoPunto() {
        productoPunto = 0;
        
        for (int i = 0; i < A.length; i++) {
            productoPunto = productoPunto + A[i]*B[i];
        }
    }
    
    private void llenarVectores(){
        int randomA;
        int randomB;
        A = new int[5];
        B = new int[5];
        
        for (int i = 0; i < A.length; i++) {
           randomA = (int) Math.ceil(Math.random()*10);
           randomB = (int) Math.ceil(Math.random()*10);
           
           A[i] = randomA;
           B[i] = randomB;
        }
    }
    
    public static void main(String[] args) {
        ProductoPunto pp = new ProductoPunto();
    }
    
}
