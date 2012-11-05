

import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Jigsaw {

    int[][] ciudad = {{4, 12, 5, -1, 3, 4},
        {9, 6, 14, -1, 20, 41},
        {39, -1, -1, -1, 28, 58},
        {24, 8, 36, 2, 4, 49},
        {41, 64, 14, 1, 2, 61},
        {21, 73, 16, 3, 4, 87}};

    public Jigsaw() {

        int F = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de Filas del terreno"));
        int C = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de Columnas del terreno"));

        int[] resultado1 = buscar(F, C);
        int[] resultado2 = buscar(C, F);

        int[] resultadoFinal = new int[3];


        if (resultado1 != null && resultado2 != null && resultado1[2] <= resultado2[2]) {
            resultadoFinal = resultado1;
        } else if (resultado1 != null && resultado2 != null && resultado2[2] <= resultado1[2]) {
            resultadoFinal = resultado2;
        } else if (resultado1 == null) {
            resultadoFinal = resultado2;
        } else if (resultado2 == null) {
            resultadoFinal = resultado1;
        } else {
            resultadoFinal = null;
        }


        JTextArea jTextArea = new JTextArea();
        String resultadoString = imprimir(resultadoFinal);
        jTextArea.append(resultadoString);

        JOptionPane.showMessageDialog(null, jTextArea);
    }

    int[] buscar(int F, int C) {
        int[] resultado = new int[3];
        resultado[2] = Integer.MAX_VALUE;
        int valor = 0;
        boolean hayEdificio = false;

        for (int i = 0; i <= ciudad.length - F; i++) {
            for (int j = 0; j <= ciudad[i].length - C; j++) {
                for (int k = 0; k < F; k++) {
                    for (int l = 0; l < C; l++) {
                        if (ciudad[i + k][j + l] == -1) {
                            hayEdificio = true;
                        }
                        valor += ciudad[i + k][j + l];
                    }
                }
                if (!hayEdificio && valor < resultado[2]) {
                    resultado[0] = i;
                    resultado[1] = j;
                    resultado[2] = valor;
                }
                hayEdificio = false;
                valor = 0;
            }
        }
        if (resultado[2] == Integer.MAX_VALUE) {
            return null;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Jigsaw jigsaw = new Jigsaw();
    }

    private String imprimir(int[] resultadoFinal) {
        String resultado = "";
        if (resultadoFinal == null) {
            resultado += "\n   Game Over!!\n";
        } else {
            resultado += "Posicion del terreno \n ";
            resultado += "\nFila : " + (resultadoFinal[0] + 1);
            resultado += "\nColumna : " + (resultadoFinal[1] + 1);
            resultado += "\nValor : " + resultadoFinal[2];
        }
        return resultado;
    }
}
