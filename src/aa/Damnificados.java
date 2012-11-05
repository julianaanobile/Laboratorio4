
package aa;


public class Damnificados {

    String [] departamentos = {"Bolivar","Magdalena","Atlantico","Guajira","Cordoba","Sucre"};//Filas en la matriz
    String [] anios = {"2005","2006","2007","2008"};//columnas en la matriz
    
    int [] damnificadosPorAnio = new int[anios.length];
    int menorNumeroDamnificados;
    int indiceDept;
    
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
    }

    private void calcularDamnificadosPorAnio() {
        int sumaAux = 0;
        
        for (int i = 0; i < damnificados.length; i++) {
            for (int j = 0; j < damnificados[i].length; j++) {
                sumaAux = damnificados[i][j];
            }
            damnificadosPorAnio[i]=sumaAux/damnificados[0].length;
        }
    }

    private void calcularDptoMenorNumeroDamnificado() {
        
    }
}
