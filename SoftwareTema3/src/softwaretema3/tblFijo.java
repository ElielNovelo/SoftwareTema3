/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaretema3;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author 
 */
public class tblFijo extends AbstractTableModel{

    private String[] columnas = {"i","xi","g(x)", "Error"};
    private ArrayList <csFijo> lista = null;

    public tblFijo(ArrayList <csFijo> resultados) {
        this.lista = resultados;
    }
    
    @Override
    public int getRowCount() {
        return this.lista.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnas.length;
    }

    @Override
    public Object getValueAt(int i, int columna) {
        csFijo fila = this.lista.get(i);
        switch(columna)
        {
            case 0: return fila.getIteracion();
            
            case 1: return fila.getXi();
            
            case 2: return fila.getGx();
            
            case 3: return fila.getError();
        }
        return null;
    }
    
    @Override
    public boolean isCellEditable(int i, int i1) {
        return true;
    }

    @Override
    public String getColumnName(int i) {
        return this.columnas[i];
    }
}
