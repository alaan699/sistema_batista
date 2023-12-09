/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.AcsProduto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Marcos
 */
public class ProdutoControle extends AbstractTableModel {
    private List lista;
    
    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }
    
    public AcsProduto getBean(int linha) {
        return (AcsProduto) lista.get(linha);
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
        AcsProduto produto = (AcsProduto) lista.get(rowIndex);
        if (columnIndex == 0) {
            return produto.getAcsIdproduto();
        }
        if (columnIndex == 1) {
            return produto.getAcsNome();
        }
        if (columnIndex == 2) {
            return produto.getAcsPeso();
        }
        if (columnIndex == 3) {
            return produto.getAcsPreco();
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
            return "Peso";
        }
        if (columnIndex == 3) {
            return "Preço";
        }
        return "";
    }
}
