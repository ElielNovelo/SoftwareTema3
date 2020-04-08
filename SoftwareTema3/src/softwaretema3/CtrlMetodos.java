
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
    
     public tblNewton Newton(double li,double errorDeseado, int it){
         
         ArrayList <csNewton> lista = null;
         tblNewton tabla= null;
         double errorCalculado = 1;
         double xAnterior=0;
        int i = 1;
        lista = new ArrayList<csNewton>();
        while (errorCalculado > errorDeseado && it>0) {
            csNewton fila = new csNewton();
            fila.setIteracion(i); 
            fila.setXi(li); 
            double fxo = this.Funcion(fila.getXi());
            double fxdo = this.DerivadaFuncion(fila.getXi());
            fila.setFxi(fxo); 
            fila.setFdxi(fxdo); 
            fila.setResta(fila.getXi() - (fxo / fxdo));
            xAnterior = fila.getXi(); 
            li = fila.getResta();          
            if (i > 1) {
                      
                errorCalculado = Math.abs((fila.getResta() - fila.getXi()) / fila.getResta());
                fila.setError(errorCalculado);

            } else {
                fila.setError(errorCalculado);
            }
            lista.add(fila);
            i++;
        }
        if (errorCalculado < errorDeseado) {
            tabla = new tblNewton(lista);
            return tabla;
        } else {
            return null;
        }
         
         
     }
     
     //Ejercicio vPunto Fijo
    public ArrayList<csFijo> PuntoFijo(double xo, double errorDeseado, int iteraciones){ 
        double x = this.funcion(xo);
        double errorCalculado=1;
        
        ArrayList<csFijo> lista;

        int i = 1; 
        
        lista = new ArrayList<csFijo>();
        
        while (i <= iteraciones && errorCalculado > errorDeseado) {
           
            csFijo fila = new csFijo();
            fila.setIteracion(i);
            fila.setXi(xo); 
            fila.setGx(this.funcion(fila.getXi()));
            
            xo = fila.getGx();         
            if (i > 1) {
                     
                errorCalculado = Math.abs((this.funcion(fila.getXi()) - fila.getXi()) / this.funcion(fila.getXi()));
                fila.setError(errorCalculado);
            } else {
                fila.setError(errorCalculado);
            }
            lista.add(fila);
            i++;
        }
        
        return lista;   
    }
   
    private double funcion(double x){
     
        return Math.pow(2.7182818284590452353602874713527,-x);
    }
}
