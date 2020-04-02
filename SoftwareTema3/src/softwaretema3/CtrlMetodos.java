
package softwaretema3;
import java.util.ArrayList;

/**
 *
 * @author Eliel Novelo
 */
public class CtrlMetodos {
    public tblJacobi Jacobi(int [][]A, int [] b, int iteraciones)
    {
    ArrayList<CsJacobi> lista = null;
    tblJacobi tabla; 
    int cont = 0;
    //despejes 
    //int x1,x2,x3;
    double x1Anterior = 0, x2Anterior = 0, x3Anterior=0;
    //x1 = (- A[0][1] - 2*(A[0][2]) + 9)/b[0];
    //x2 = (- 2*(A[1][0]) - (A[1][2]) - 5)/b[1];
    
    lista = new ArrayList<CsJacobi> ();    
    
    
            
            while(cont != iteraciones){
                CsJacobi fila = new CsJacobi();
                fila.setIteraciones(cont + 1);
                fila.setX1(((- A[0][1]*x2Anterior) - (A[0][2] * x3Anterior) + b[0])/A[0][0]);
                fila.setX2(((-A[1][0]*x1Anterior) - (A[1][2]*x3Anterior) + b[1])/A[1][1]);
                fila.setX3(((-A[2][0]*x1Anterior)-(A[2][1] * x2Anterior) + b[2])/A[2][2]);
                
                x1Anterior = fila.getX1();
                x2Anterior = fila.getX2();
                x3Anterior = fila.getX3();
                fila.toString();
                lista.add(fila);
                cont++;
            }          
            tabla = new tblJacobi(lista);
            return tabla;

        
    }
    
    public tblGauss Gauss(int [][]A, int [] b, int iteraciones)
    {
    ArrayList<CsJacobi> lista = null;
    tblGauss tabla; 
    int cont = 0;
    //despejes 
    //int x1,x2,x3;
    double x1Anterior = 0, x2Anterior = 0, x3Anterior=0;
    //x1 = (- A[0][1] - 2*(A[0][2]) + 9)/b[0];
    //x2 = (- 2*(A[1][0]) - (A[1][2]) - 5)/b[1];
    
    lista = new ArrayList<CsJacobi> ();    
    
    
            
            while(cont != iteraciones){
                CsJacobi fila = new CsJacobi();
                fila.setIteraciones(cont + 1);
                fila.setX1(((- A[0][1]*x2Anterior) - (A[0][2] * x3Anterior) + b[0])/A[0][0]);
                fila.setX2(((-A[1][0]*x1Anterior) - (A[1][2]*x3Anterior) + b[1])/A[1][1]);
                fila.setX3(((-A[2][0]*x1Anterior)-(A[2][1] * x2Anterior) + b[2])/A[2][2]);
                
                x1Anterior = fila.getX1();
                x2Anterior = fila.getX2();
                x3Anterior = fila.getX3();
                fila.toString();
                lista.add(fila);
                cont++;
            }          
            tabla = new tblGauss(lista);
            return tabla;

        
    }
}
