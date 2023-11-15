package view;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import modelDominio.Cliente;
import view.util.ClienteTableModel;

public class FormClientes extends javax.swing.JFrame {
    ClienteTableModel clienteModel;
   
    public void atualizaTabela () {
        ArrayList<Cliente> listaClientes = DominusAppCliente.conexaoController.listaClientes();
        
        if (listaClientes != null) {
            clienteModel = new ClienteTableModel(listaClientes);
            jtClientes.setModel(clienteModel);
        }
    }
    
    public void designTabela() {
        jtClientes.getTableHeader().setOpaque(false);
        jtClientes.getTableHeader().setBackground(new Color(230,142,132));
        jtClientes.getTableHeader().setForeground(new Color(25,30,33));
        jtClientes.getTableHeader().setBorder(BorderFactory.createLineBorder(new Color(40,45,51)));
        jtClientes.setRowSelectionInterval(0, 0);
        jScrollPane1.getViewport().setBackground(new Color(25,30,33));
        jScrollPane1.setBorder(BorderFactory.createEmptyBorder());
    }
    
    public FormClientes() {
        initComponents();
        getContentPane().setBackground(new Color(40,45,51));
        designTabela();
        atualizaTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Clientes");

        jScrollPane1.setBackground(new Color(40,45,51));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new Color(40,45,51));
        jScrollPane1.setColumnHeaderView(null);
        jScrollPane1.setRowHeaderView(null);

        jtClientes.setBackground(new Color(25,30,33));
        jtClientes.setForeground(new Color(221,221,221));
        jtClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jtClientes.setGridColor(new Color(40,45,51));
        jtClientes.setOpaque(false);
        jtClientes.setSelectionBackground(new Color(40,45,51));
        jtClientes.setSelectionForeground(new Color(221,221,221));
        jtClientes.setShowGrid(false);
        jtClientes.setShowHorizontalLines(false);
        jtClientes.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jtClientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtClientes;
    // End of variables declaration//GEN-END:variables
}
