/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.AcsUsuario;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Alan
 */
public class UsuarioControle extends AbstractTableModel {
    private List lista;
    
    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }

    
    public AcsUsuario getBean(int row) {
        return (AcsUsuario) lista.get(row);
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int column) {
        AcsUsuario usuarios = (AcsUsuario) lista.get(rowIndex);
        if (column == 0) {
            return usuarios.getAcsIdusuario();
        }
        if (column == 1) {
            return usuarios.getAcsNome();
        }
        if (column == 2) {
            return usuarios.getAcsApelido();
        }
        if (column == 3) {
            return usuarios.getAcsCpf();
        }
        return "";
    }
    
    @Override
    public String getColumnName(int column) {
        if (column == 0) {
            return "ID";
        }
        if (column == 1) {
            return "Nome";
        }
        if (column == 2) {
            return "Apelido";
        }
        if (column == 3) {
            return "CPF";
        }
        return "";
    }
}
