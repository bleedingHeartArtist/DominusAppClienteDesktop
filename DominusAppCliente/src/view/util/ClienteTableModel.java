package view.util;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import modelDominio.Cliente;

public class ClienteTableModel extends AbstractTableModel {
    private ArrayList<Cliente> listaClientes;

    public ClienteTableModel(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    @Override
    public int getRowCount() {
        return listaClientes.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente clienteSelecionado = listaClientes.get(rowIndex);
        
        switch (columnIndex) {
            case 0: return clienteSelecionado.getNome();
            case 1: return clienteSelecionado.getEndereco();
            case 2: return clienteSelecionado.getCpf();
            default: return "";         
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Nome";
            case 1: return "Endereço";
            case 2: return "CPF";
            default: return "NoName";
        }
    }
    
    public Cliente getCliente(int row) {
        return listaClientes.get(row);
    }
    
}
