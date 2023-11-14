package view;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import modelDominio.ItensVenda;
import modelDominio.Venda;
import view.util.ItensVendaTableModel;
import view.util.VendaTableModel;

public class FormPrincipal extends javax.swing.JFrame {
    Timer timerAtualizaTabela;
    VendaTableModel vendaModel;
    ItensVendaTableModel itensVendaModel;

    public void atualizaTabelaVendas () {
        ArrayList<Venda> listaVendas = DominusAppCliente.conexaoController.listaVendas();
        
        if (listaVendas.get(0) != null) {
            vendaModel = new VendaTableModel(listaVendas);
            jtVendas.setModel(vendaModel);
        } 
    }
    
    public void atualizaTabelaItensVenda(Venda vendaSelecionada) {
        ArrayList<ItensVenda> listaItensVenda = vendaSelecionada.getItens();
        
        if (listaItensVenda.get(0) != null) {
            itensVendaModel = new ItensVendaTableModel(listaItensVenda);
            jtItensVenda.setModel(itensVendaModel);
        }
    }
    
    public void designTabelas() {
        jtVendas.getTableHeader().setOpaque(false);
        jtVendas.getTableHeader().setBackground(new Color(230,142,132));
        jtVendas.getTableHeader().setForeground(new Color(25,30,33));
        jtVendas.getTableHeader().setBorder(BorderFactory.createLineBorder(new Color(40,45,51)));
        jScrollPane1.getViewport().setBackground(new Color(25,30,33));
        jScrollPane1.setBorder(BorderFactory.createEmptyBorder());
        
        jtItensVenda.getTableHeader().setOpaque(false);
        jtItensVenda.getTableHeader().setBackground(new Color(230,142,132));
        jtItensVenda.getTableHeader().setForeground(new Color(25,30,33));
        jtItensVenda.getTableHeader().setBorder(BorderFactory.createLineBorder(new Color(40,45,51)));
        jScrollPane2.getViewport().setBackground(new Color(25,30,33));
        jScrollPane2.setBorder(BorderFactory.createEmptyBorder());    
    }
            
    public FormPrincipal() {
        initComponents();
        getContentPane().setBackground(new Color(40,45,51));
        
        designTabelas();
        atualizaTabelaVendas();
        
        timerAtualizaTabela = new Timer();
        timerAtualizaTabela.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                atualizaTabelaVendas();    
            }
        }, 15000, 15000); 
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
        jlCabecalhoVendas = new javax.swing.JLabel();
        jbProdutos = new javax.swing.JButton();
        jbMarcas = new javax.swing.JButton();
        jbClientes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Início");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jpVendas.setBackground(new Color(40,45,51));
        jpVendas.setForeground(new Color(40,45,51));
        jpVendas.setOpaque(false);

        jScrollPane1.setBackground(new Color(40,45,51));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new Color(40,45,51));
        jScrollPane1.setColumnHeaderView(null);
        jScrollPane1.setRowHeaderView(null);

        jtVendas.setBackground(new Color(25,30,33));
        jtVendas.setForeground(new Color(221,221,221));
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
        jtVendas.setGridColor(new Color(40,45,51));
        jtVendas.setOpaque(false);
        jtVendas.setSelectionBackground(new Color(40,45,51));
        jtVendas.setSelectionForeground(new Color(221,221,221));
        jtVendas.setShowGrid(false);
        jtVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtVendasMouseClicked(evt);
            }
        });
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

        jpDetalhes.setBackground(new java.awt.Color(40, 45, 51));
        jpDetalhes.setForeground(new java.awt.Color(40, 45, 51));

        jlCodigoVenda.setBackground(new java.awt.Color(221, 221, 221));
        jlCodigoVenda.setForeground(new Color(221,221,221));
        jlCodigoVenda.setText("Código");

        jLabel1.setBackground(new java.awt.Color(221, 221, 221));
        jLabel1.setForeground(new Color(221,221,221));
        jLabel1.setText("Cliente");

        jtfCliente.setEditable(false);
        jtfCliente.setBackground(new java.awt.Color(25, 30, 33));
        jtfCliente.setForeground(new Color(221,221,221));
        jtfCliente.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 8, 4, 8));

        jScrollPane2.setBackground(new Color(40,45,51));
        jScrollPane2.setBorder(null);
        jScrollPane2.setForeground(new Color(40,45,51));
        jScrollPane2.setRowHeaderView(null);

        jtItensVenda.setBackground(new Color(25,30,33));
        jtItensVenda.setForeground(new Color(221,221,221));
        jtItensVenda.setModel(new javax.swing.table.DefaultTableModel(
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
        jtItensVenda.setGridColor(new Color(40,45,51));
        jtItensVenda.setOpaque(false);
        jtItensVenda.setSelectionBackground(new Color(40,45,51));
        jtItensVenda.setSelectionForeground(new Color(221,221,221));
        jtItensVenda.setShowGrid(false);
        jScrollPane2.setViewportView(jtItensVenda);

        jtfCodigoVenda.setEditable(false);
        jtfCodigoVenda.setBackground(new java.awt.Color(25, 30, 33));
        jtfCodigoVenda.setForeground(new Color(221,221,221));
        jtfCodigoVenda.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 8, 4, 8));

        jlItensVenda.setBackground(new java.awt.Color(221, 221, 221));
        jlItensVenda.setForeground(new Color(221,221,221));
        jlItensVenda.setText("Itens");

        jtfValorTotal.setEditable(false);
        jtfValorTotal.setBackground(new java.awt.Color(25, 30, 33));
        jtfValorTotal.setForeground(new Color(221,221,221));
        jtfValorTotal.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 8, 4, 8));

        jlValorTotal.setBackground(new java.awt.Color(221, 221, 221));
        jlValorTotal.setForeground(new Color(221,221,221));
        jlValorTotal.setText("Valor total");

        jlCabecalhoVendas.setBackground(new java.awt.Color(221, 221, 221));
        jlCabecalhoVendas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlCabecalhoVendas.setForeground(new Color(221,221,221));
        jlCabecalhoVendas.setText("Detalhamento de vendas:");

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
                    .addComponent(jlValorTotal)
                    .addComponent(jlCabecalhoVendas))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jpDetalhesLayout.setVerticalGroup(
            jpDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDetalhesLayout.createSequentialGroup()
                .addComponent(jlCabecalhoVendas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jlCodigoVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfCodigoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlItensVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlValorTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jbProdutos.setBackground(new java.awt.Color(230, 142, 132));
        jbProdutos.setText("Produtos");
        jbProdutos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jbProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProdutosActionPerformed(evt);
            }
        });

        jbMarcas.setBackground(new java.awt.Color(230, 142, 132));
        jbMarcas.setText("Marcas");
        jbMarcas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jbMarcas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jbClientes.setBackground(new java.awt.Color(230, 142, 132));
        jbClientes.setText("Clientes");
        jbClientes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jbClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        DominusAppCliente.conexaoController.fim();
    }//GEN-LAST:event_formWindowClosing

    private void jtVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtVendasMouseClicked
        //TODO
        Venda vendaSelecionada = vendaModel.getVenda(jtVendas.getSelectedRow());
        jtfCodigoVenda.setText(String.valueOf(vendaSelecionada.getCodVenda()));
        jtfCliente.setText(vendaSelecionada.getCliente().getNome());
        atualizaTabelaItensVenda(vendaSelecionada);
        jtfValorTotal.setText(vendaSelecionada.getValorString());
        
    }//GEN-LAST:event_jtVendasMouseClicked

    private void jbProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProdutosActionPerformed
        // TODO add your handling code here:
        FormProdutos formProdutos = new FormProdutos();
        formProdutos.setVisible(true);
    }//GEN-LAST:event_jbProdutosActionPerformed

    private void jbClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbClientesActionPerformed
        FormClientes formCli = new FormClientes();
        formCli.setVisible(true);
    }//GEN-LAST:event_jbClientesActionPerformed

    public void limpaCampos() {
        jtfCodigoVenda.setText("");
        jtfCliente.setText("");
        jtfValorTotal.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbClientes;
    private javax.swing.JButton jbMarcas;
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
