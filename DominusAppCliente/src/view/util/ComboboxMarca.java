package view.util;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import modelDominio.Marca;

public class ComboboxMarca {
    private String valor;
    private int key;

    public ComboboxMarca(String valor, int key) {
        this.valor = valor;
        this.key = key;
    }

    @Override
    public String toString() {
        return valor; 
    }

    public int getKey() {
        return key;
    }
    
    public static int getSelectedIndex(JComboBox combo) {
        int resultado;
        Object objeto = combo.getSelectedItem();
        
        if (objeto == null) 
            resultado = -1;
        else 
            resultado = ((ComboboxMarca) objeto).getKey();
        
        return resultado;
    }
    
    public static void preencheComboBoxMarca(int codigoSel, JComboBox combo, ArrayList<Marca> listaMarcas, Boolean addTodos) {
        Vector vLista = new Vector();
        int x = 1;
        int selecionarCodigo = -1;
        
        if (addTodos) 
            vLista.add(new ComboboxMarca("<<Selecionar>>", 0));
        
        for (Marca marca: listaMarcas) {
            ComboboxMarca comboBoxMarca = new ComboboxMarca(marca.getNomeMarca(), marca.getCodMarca());
            vLista.add(comboBoxMarca);
            
            if (comboBoxMarca.getKey() == codigoSel)
                selecionarCodigo = x;

            x++;
        }
        
        DefaultComboBoxModel comboModel = new DefaultComboBoxModel(vLista);
        combo.setModel(comboModel);
        
        if (selecionarCodigo >= 0) 
            combo.setSelectedIndex(selecionarCodigo);       
    }
    
}
