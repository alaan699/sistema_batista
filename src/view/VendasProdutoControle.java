/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.AcsVendasProduto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author halom
 */
public class VendasProdutoControle extends AbstractTableModel {

  
    List lista;


     public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }

   
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

     public AcsVendasProduto getBean(int linha) {
        return (AcsVendasProduto) lista.get(linha);
    }
    
    public void addBean(AcsVendasProduto mmsVendasProduto) {
            lista.add(mmsVendasProduto);
            this.fireTableDataChanged();
    }
    
    public void removeBean(int index) {
            lista.remove(index);
            this.fireTableDataChanged();
    }
    
    public void updateBean(int index, AcsVendasProduto mmsVendasProduto){
        lista.set(index, mmsVendasProduto);
        this.fireTableDataChanged();
    }
    
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       AcsVendasProduto vendasProduto = (AcsVendasProduto) lista.get(rowIndex);
        if (columnIndex == 0) {
            return vendasProduto.getAcsIdvendasProduto();
        }
        if (columnIndex == 1) {
            return vendasProduto.getAcsProduto();
        }
        if (columnIndex == 2) {
            return vendasProduto.getAcsQuantidade();
        }
        if (columnIndex == 3) {
            return vendasProduto.getAcsValorUnitario();
        }
        
        return "";
    }
    
    
    
    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "ID Venda Produto";
        }
        if (columnIndex == 1) {
            return "Produto";
        }
        if (columnIndex == 2) {
            return "Quantidade";
        }
        if (columnIndex == 3) {
            return "Valor Unitário";
        }
        
        return null;
    }
    
}
