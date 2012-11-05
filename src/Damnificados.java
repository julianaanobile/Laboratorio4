


import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class Damnificados {

    String [] departamentos = {"Bolivar","Magdalena","Atlantico","Guajira","Cordoba","Sucre"};//Filas en la matriz
    String [] anios = {"2005","2006","2007","2008"};//columnas en la matriz
    
    int [] damnificadosPorAnio = new int[anios.length];
    String departamentoMenorDamnificados;
    String deptartamentoMayorIncremento;
    
    int[][] damnificados = {
        {110698, 125147, 257321, 389010},
        {98742, 123654, 325698, 282965},
        {187524, 204287, 149528, 228914},
        {108111, 198365, 206879, 216758},
        {65541, 54211, 100365, 169446},
        {105230, 98745, 203698, 119575}};
    
    public Damnificados() {
        
        calcularDamnificadosPorAnio();
        calcularDptoMenorNumeroDamnificado();
        calculaDptoMayorIncremento();
        
        JTextArea jTextArea = new JTextArea();
        jTextArea.append("   *** Programa Damnificados por Invierno*** ");
        jTextArea.append("\n\nDepartamentos:\n");
        jTextArea.append(imprimeDepartamentos(departamentos));
        jTextArea.append("\nDamnificados:\n");
        jTextArea.append(imprimeDamnificados(damnificados));
        jTextArea.append("\n\nDamnificados por Anio:\n\n");
        jTextArea.append(imprimeDamnificadosPorAnio(damnificadosPorAnio));
        jTextArea.append("\n\nDepartamento menos afectado por el invierno en todos los anios es: "+departamentoMenorDamnificados);
        jTextArea.append("\nDepartamento con mayor incremento de damnificados entre los anios 2006 y 2008 es: "+departamentoMenorDamnificados);
        
        JOptionPane.showMessageDialog(null, jTextArea);
        
    }

    private void calcularDamnificadosPorAnio() {
        int sumaAux = 0;
        for (int j = 0; j < damnificados[0].length; j++) {
            for (int i = 0; i < damnificados.length; i++) {
                sumaAux = damnificados[i][j];
            }
            damnificadosPorAnio[j] = sumaAux / damnificados[0].length;
        }
    }

    private void calcularDptoMenorNumeroDamnificado() {
            int menorNumeroDamnificados=0;
            int indiceDept=0;
        
        for (int i = 0; i < damnificadosPorAnio.length; i++) {
            if(i==0){
                menorNumeroDamnificados = damnificadosPorAnio[i];
                indiceDept = i;
            }
            if (damnificadosPorAnio[i]<menorNumeroDamnificados) {
                menorNumeroDamnificados = damnificadosPorAnio[i];
                indiceDept = i;
            }
        }
        departamentoMenorDamnificados = departamentos[indiceDept];
    }

    private void calculaDptoMayorIncremento() {
        int mayorIncremento=0;
        int indiceDeptMayorIncremento=0;
        
        for (int i = 0; i < damnificadosPorAnio.length; i++) {
            if(i==0){
                mayorIncremento = damnificados[i][3]-damnificados[i][1];
                indiceDeptMayorIncremento = i;
            }
            if (damnificados[i][3]-damnificados[i][1]>mayorIncremento) {
                mayorIncremento = damnificados[i][3]-damnificados[i][1];
                indiceDeptMayorIncremento = i;
            }
        }
        
        deptartamentoMayorIncremento = departamentos[indiceDeptMayorIncremento];
    }

    private String imprimeDepartamentos(String[] departamentos) {
        String resultado = "";
        for (int i = 0; i < departamentos.length; i++) {
            resultado+= "\t" + departamentos[i];
        }
        return resultado;
    }

    private String imprimeDamnificados(int[][] damnificados) {
        String resultado = "";
        for (int j = 0; j < damnificados[0].length; j++) {
            for (int i = 0; i < damnificados.length; i++) {
                 resultado+= "\t" + damnificados[i][j];
            }
            resultado+= "\n";
        }
        return resultado;
    }

    private String imprimeDamnificadosPorAnio(int[] damnificadosPorAnio) {
        String resultado = "";
        for (int i = 0; i < damnificadosPorAnio.length; i++) {
            resultado+= " --- "+anios[i] +":\t"+ damnificadosPorAnio[i]+"\n";
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        Damnificados d = new Damnificados();
    }
}
