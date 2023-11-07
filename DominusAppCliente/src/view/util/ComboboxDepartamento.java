package view.util;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import modelDominio.Departamento;
import modelDominio.Marca;

public class ComboboxDepartamento {
    private String valor;
    private int key;
    
    public ComboboxDepartamento(String valor, int key) {
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
            resultado = ((ComboboxDepartamento) objeto).getKey();
        
        return resultado; 
    } 
    
    public static void preencheComboBoxDepartamento(int codigoSel, JComboBox combo, ArrayList<Departamento> listaDepartamentos, Boolean addTodos) {
        Vector vLista = new Vector();
        int x = 1;
        int selecionarCodigo = -1;
        
        if (addTodos) 
            vLista.add(new ComboboxDepartamento("<<Selecionar>>", 0));
        
        for (Departamento dpto: listaDepartamentos) {
            ComboboxDepartamento comboDpto = new ComboboxDepartamento(dpto.getNomeDpto(), dpto.getCodDpto());
            vLista.add(comboDpto);
            
            if (comboDpto.getKey() == codigoSel)
                selecionarCodigo = x;
              
            x++;  
        }
        
        DefaultComboBoxModel comboModel = new DefaultComboBoxModel(vLista);
        combo.setModel(comboModel);
        
        if (selecionarCodigo >= 0) 
            combo.setSelectedIndex(selecionarCodigo);     
    }     
}
