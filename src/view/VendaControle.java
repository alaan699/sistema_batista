/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;



import bean.AcsVendas;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author halom
 */
public class VendaControle extends AbstractTableModel {

     private List lista;
    
    public void setList(List lista) {
        this.lista = lista;
    }
    
    public AcsVendas getBean(int linha) {
        return (AcsVendas) lista.get(linha);
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
        AcsVendas vendas = (AcsVendas) lista.get(rowIndex);
        if (columnIndex == 0) {
            return vendas.getAcsIdvendas();
        }
        if (columnIndex == 1) {
            return vendas.getAcsCliente();
        }
        if (columnIndex == 2) {
            return vendas.getAcsValor();
        }
        if (columnIndex == 3) {
            return vendas.getAcsFuncionario();
        }
        if (columnIndex == 4) {
            return vendas.getAcsHorapedido();
        }
        return "";
    }
    
     @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "ID";
        }
        if (columnIndex == 1) {
            return "Cliente";
        }
        if (columnIndex == 2) {
            return "Valor";
        }
        if (columnIndex == 3) {
            return "Funcionario";
        }
        if (columnIndex == 4) {
            return "Hora Pedido";
        }
        return "";
    }
}

    

