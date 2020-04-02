
package softwaretema3;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Eliel Novelo
 */
public class tblGauss extends AbstractTableModel {

   private String[] fila = {"itera","x1","x2","x3"};
    
    private ArrayList<CsJacobi> lista =null;

    public tblGauss(ArrayList<CsJacobi> resultados) {
        this.lista = resultados;
    }

    @Override
    public int getRowCount() {
        return this.fila.length;
    }

    @Override
    public int getColumnCount() {
        return this.lista.size();
    }

    @Override
    public Object getValueAt(int fila, int i) {
        CsJacobi fli = this.lista.get(i);
        
        switch(fila){
            case 0:
                return fli.getIteraciones();
            case 1:
                return fli.getX1(); 
            case 2: 
                return fli.getX2();
            case 3:
                return fli.getX3();
                
        }
        return null;
    }
    @Override
    public boolean isCellEditable(int i, int i1) {
        return true;
    }
    
}
