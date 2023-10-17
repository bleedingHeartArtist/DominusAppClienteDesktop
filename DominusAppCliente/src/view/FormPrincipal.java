package view;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import modelDominio.Venda;
import view.util.VendaTableModel;

public class FormPrincipal extends javax.swing.JFrame {
    Timer timerAtualizaTabela;

    public void atualizaTabelaVendas () {
        ArrayList<Venda> listaVendas = DominusAppCliente.conexaoController.listaVendas();
        
        if (listaVendas.get(0) != null) {
            VendaTableModel vendaModel = new VendaTableModel(listaVendas);
            jtVendas.setModel(vendaModel);
        } 
    }
            
    public FormPrincipal() {
        initComponents();
        atualizaTabelaVendas();
        
        timerAtualizaTabela = new Timer();
        timerAtualizaTabela.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                atualizaTabelaVendas();    
            }
        }, 5000, 10000);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpVendas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtVendas = new javax.swing.JTable();
        jpDetalhes = new javax.swing.JPanel();
        jlCodigoVenda = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtfCliente = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtItensVenda = new javax.swing.JTable();
        jtfCodigoVenda = new javax.swing.JTextField();
        jlItensVenda = new javax.swing.JLabel();
        jtfValorTotal = new javax.swing.JTextField();
        jlValorTotal = new javax.swing.JLabel();
        jbProdutos = new javax.swing.JButton();
        jbMinhaLoja = new javax.swing.JButton();
        jbClientes = new javax.swing.JButton();
        jlCabecalhoVendas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jtVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(jtVendas);

        javax.swing.GroupLayout jpVendasLayout = new javax.swing.GroupLayout(jpVendas);
        jpVendas.setLayout(jpVendasLayout);
        jpVendasLayout.setHorizontalGroup(
            jpVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVendasLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        jpVendasLayout.setVerticalGroup(
            jpVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpVendasLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                .addContainerGap())
        );

        jlCodigoVenda.setText("Código");

        jLabel1.setText("Cliente");

        jtfCliente.setEnabled(false);

        jtItensVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane2.setViewportView(jtItensVenda);

        jtfCodigoVenda.setEnabled(false);

        jlItensVenda.setText("Itens");

        jtfValorTotal.setEnabled(false);

        jlValorTotal.setText("Valor total");

        javax.swing.GroupLayout jpDetalhesLayout = new javax.swing.GroupLayout(jpDetalhes);
        jpDetalhes.setLayout(jpDetalhesLayout);
        jpDetalhesLayout.setHorizontalGroup(
            jpDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDetalhesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jlCodigoVenda)
                        .addComponent(jLabel1)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jtfCodigoVenda)
                        .addComponent(jtfCliente)
                        .addComponent(jlItensVenda)
                        .addComponent(jtfValorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                    .addComponent(jlValorTotal))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jpDetalhesLayout.setVerticalGroup(
            jpDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDetalhesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlCodigoVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfCodigoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlItensVenda)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlValorTotal)
                .addGap(4, 4, 4)
                .addComponent(jtfValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbProdutos.setText("Produtos");

        jbMinhaLoja.setText("Minha loja");

        jbClientes.setText("Clientes");

        jlCabecalhoVendas.setText("Detalhamento de vendas:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbProdutos)
                        .addGap(33, 33, 33)
                        .addComponent(jbMinhaLoja)
                        .addGap(28, 28, 28)
                        .addComponent(jbClientes)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCabecalhoVendas)
                    .addComponent(jpDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbProdutos)
                            .addComponent(jbMinhaLoja)
                            .addComponent(jbClientes)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlCabecalhoVendas)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpDetalhes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        DominusAppCliente.conexaoController.fim();
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbClientes;
    private javax.swing.JButton jbMinhaLoja;
    private javax.swing.JButton jbProdutos;
    private javax.swing.JLabel jlCabecalhoVendas;
    private javax.swing.JLabel jlCodigoVenda;
    private javax.swing.JLabel jlItensVenda;
    private javax.swing.JLabel jlValorTotal;
    private javax.swing.JPanel jpDetalhes;
    private javax.swing.JPanel jpVendas;
    private javax.swing.JTable jtItensVenda;
    private javax.swing.JTable jtVendas;
    private javax.swing.JTextField jtfCliente;
    private javax.swing.JTextField jtfCodigoVenda;
    private javax.swing.JTextField jtfValorTotal;
    // End of variables declaration//GEN-END:variables
}
