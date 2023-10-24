package view.util;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import modelDominio.ItensVenda;

public class ItensVendaTableModel extends AbstractTableModel {
    ArrayList<ItensVenda> listaItensVenda;

    public ItensVendaTableModel(ArrayList<ItensVenda> listaItensVenda) {
        this.listaItensVenda = listaItensVenda;
    }

    @Override
    public int getRowCount() {
        return listaItensVenda.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ItensVenda itemVendaSelecionado = listaItensVenda.get(rowIndex);
        
        switch (columnIndex) {
            case 0: return itemVendaSelecionado.getProduto().getNome();
            case 1: return itemVendaSelecionado.getValorTotal();
            default: return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Produto";
            case 1: return "Preço";
            default: return "";
        }
    }
    
    public ItensVenda getItemVenda (int row) {
        return listaItensVenda.get(row);
    }
}
