/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareinformaticomvc;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Eliel Novelo
 */
public class tblNewton extends AbstractTableModel{
    
    private String []columnas= {"i", "Xi", "f(x)","f'(x)","xi+1","Error"};
    private ArrayList<csNewton> lista;

    public tblNewton(ArrayList<csNewton> lista) {
        this.lista = lista;
    }
        
    public tblNewton() {
    }
    
    @Override
    public int getRowCount() {
      return this.lista.size();
    }
    
    @Override
    public int getColumnCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     return this.columnas.length;
    }
    
    @Override
    public Object getValueAt(int fila, int columna) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     switch(columna){
         case 0: return this.lista.get(fila).getIteracion();
         case 1: return this.lista.get(fila).getXi();
         case 2:return this.lista.get(fila).getFxi();
         case 3:return this.lista.get(fila).getFdxi();
         case 4:return this.lista.get(fila).getResta();
         case 5:return this.lista.get(fila).getError();
         default:return null;     
     }
    }

    @Override
    public String getColumnName(int i) {
        //return super.getColumnName(i); //To change body of generated methods, choose Tools | Templates.
      return this.columnas[i];
    }
    
}
