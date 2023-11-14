package view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelDominio.Produto;
import view.util.ProdutoTableModel;

public class FormProdutos extends javax.swing.JFrame {
    ProdutoTableModel produtoTableModel;
    
    public void atualizaTabelaProdutos() {
        ArrayList<Produto> listaProdutos = DominusAppCliente.conexaoController.listaProdutos();
        
        if (listaProdutos != null) {
            produtoTableModel = new ProdutoTableModel(listaProdutos);
            jtMeusProdutos.setModel(produtoTableModel);
        }
        
        if (jtMeusProdutos.getSelectedRow() != -1) 
            btnRemoverProduto.setEnabled(true);  
    }
    
    public FormProdutos() {
        initComponents();
        
        atualizaTabelaProdutos();  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMeusProdutos = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jtfNome = new javax.swing.JTextField();
        jlblCodigo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfPreco = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtfCodProduto = new javax.swing.JTextField();
        jtfMarca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtfDpto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jbNovoProduto = new javax.swing.JButton();
        btnRemoverProduto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaDescricao = new javax.swing.JTextArea();

        jLabel2.setText("jLabel1");

        jLabel7.setText("Departamento:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produtos");

        jtMeusProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtMeusProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtMeusProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtMeusProdutos);

        jtfNome.setEditable(false);

        jlblCodigo.setText("Código");

        jLabel3.setText("Nome:");

        jtfPreco.setEditable(false);

        jLabel9.setText("Preço");

        jtfCodProduto.setEditable(false);

        jtfMarca.setEditable(false);

        jLabel6.setText("Marca");

        jLabel10.setText("Descrição");

        jtfDpto.setEditable(false);

        jLabel5.setText("Departamento");

        jbNovoProduto.setText("Novo");
        jbNovoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoProdutoActionPerformed(evt);
            }
        });

        btnRemoverProduto.setText("Remover");
        btnRemoverProduto.setEnabled(false);
        btnRemoverProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverProdutoActionPerformed(evt);
            }
        });

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jtaDescricao.setEditable(false);
        jtaDescricao.setColumns(20);
        jtaDescricao.setLineWrap(true);
        jtaDescricao.setRows(5);
        jtaDescricao.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jtaDescricao);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnRemoverProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbNovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jtfCodProduto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                        .addComponent(jtfPreco, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtfNome, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jlblCodigo)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel6)
                                        .addComponent(jtfMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                        .addComponent(jtfDpto))))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE))
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblCodigo)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDpto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoverProduto)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtMeusProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMeusProdutosMouseClicked
        if (jtMeusProdutos.getSelectedRow() == -1) 
            return;
        
        btnRemoverProduto.setEnabled(true);
        Produto produtoSelecionado = produtoTableModel.getProduto(jtMeusProdutos.getSelectedRow());
        
        jtfCodProduto.setText(String.valueOf(produtoSelecionado.getCodProduto()));
        jtfNome.setText(produtoSelecionado.getNome());
        jtaDescricao.setText(produtoSelecionado.getDescricao());
        jtfDpto.setText(produtoSelecionado.getDepartamento().getNomeDpto());
        jtfMarca.setText(produtoSelecionado.getMarca().getNomeMarca());
        jtfPreco.setText(produtoSelecionado.getPrecoString());
    }//GEN-LAST:event_jtMeusProdutosMouseClicked

    private void jbNovoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoProdutoActionPerformed
        FormNovoProduto formNovoProduto = new FormNovoProduto();
        formNovoProduto.setVisible(true);
        atualizaTabelaProdutos();        
    }//GEN-LAST:event_jbNovoProdutoActionPerformed

    private void btnRemoverProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverProdutoActionPerformed
        if (jtMeusProdutos.getSelectedRow() == -1) {
            return;
        }
        
        if (JOptionPane.showConfirmDialog(this, "Tem certeza de que deseja excluir o produto: "+
               "?", this.getTitle(), JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE)
                == JOptionPane.YES_OPTION) {
            
           Produto produtoSel = produtoTableModel.getProduto(jtMeusProdutos.getSelectedRow());
           boolean resultado = DominusAppCliente.conexaoController.produtoExcluir(produtoSel);
           
            if (resultado) {
                JOptionPane.showMessageDialog(this, "Produto excluído com sucesso.", 
                        this.getTitle(), JOptionPane.INFORMATION_MESSAGE);
                atualizaTabelaProdutos();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao excluir produto.", 
                        this.getTitle(), JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnRemoverProdutoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRemoverProduto;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbNovoProduto;
    private javax.swing.JLabel jlblCodigo;
    private javax.swing.JTable jtMeusProdutos;
    private javax.swing.JTextArea jtaDescricao;
    private javax.swing.JTextField jtfCodProduto;
    private javax.swing.JTextField jtfDpto;
    private javax.swing.JTextField jtfMarca;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfPreco;
    // End of variables declaration//GEN-END:variables
}
