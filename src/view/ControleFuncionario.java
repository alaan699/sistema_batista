/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.AcsFuncionario;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Marcos
 */
public class ControleFuncionario extends AbstractTableModel {
    private List lista;
    
    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }
    
    public AcsFuncionario getBean(int linha) {
        return (AcsFuncionario) lista.get(linha);
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
    public Object getValueAt(int rowIndex, int columnIndex) {
        AcsFuncionario funcionario = (AcsFuncionario) lista.get(rowIndex);
        if (columnIndex == 0) {
            return funcionario.getAcsIdfuncionario();
        }
        if (columnIndex == 1) {
            return funcionario.getAcsNome();
        }
        if (columnIndex == 2) {
            return funcionario.getAcsFuncao();
        }
        if (columnIndex == 3) {
            return funcionario.getAcsCpf();
        }
        return "";
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "ID";
        }
        if (columnIndex == 1) {
            return "Nome";
        }
        if (columnIndex == 2) {
            return "Função";
        }
        if (columnIndex == 3) {
            return "Cpf";
        }
        return "";
    }
}
