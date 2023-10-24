package view.util;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import modelDominio.Produto;

public class ProdutoTableModel extends AbstractTableModel {
    private ArrayList<Produto> listaProdutos;
    
    public ProdutoTableModel(ArrayList<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    @Override
    public int getRowCount() {
        return listaProdutos.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Produto produtoSelecionado = listaProdutos.get(rowIndex);
        
        switch (columnIndex) {
            case 0: return produtoSelecionado.getNome();
            case 1: return produtoSelecionado.getMarca().getNomeMarca();
            case 2: return produtoSelecionado.getDepartamento().getNomeDpto();
            case 3: return produtoSelecionado.getPrecoString();
            default: return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Nome";
            case 1: return "Marca";
            case 2: return "Departamento";
            case 3: return "Preço";
            default: return "NoName";
        }
    }
    
    public Produto getProduto(int row) {
        return listaProdutos.get(row);
    }
    
}
