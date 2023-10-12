
package view.util;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import modelDominio.ItensVenda;
import modelDominio.Venda;

public class VendaTableModel extends AbstractTableModel{
    private ArrayList<Venda> listaVendas;

    public VendaTableModel(ArrayList<Venda> listaVendas) {
        this.listaVendas = listaVendas;
    }

    @Override
    public int getRowCount() {
        return listaVendas.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Venda vendaSelecionada = listaVendas.get(rowIndex);
        
        switch (columnIndex) {
            case 0: return vendaSelecionada.getCodVenda();
            case 1: return vendaSelecionada.getCliente().getNome();
            case 2: return vendaSelecionada.getDataVendaString();
            case 3: return vendaSelecionada.getItensLiteral();
            case 4: return vendaSelecionada.getValorString();
            default: return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Código venda";
            case 1: return "Cliente";
            case 2: return "Data";
            case 3: return "Itens";
            case 4: return "Valor";
            default: return "NoName";
        }
    }
    
    public Venda getVenda(int row) {
        return listaVendas.get(row);
    }
    
}
