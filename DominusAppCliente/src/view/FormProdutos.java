package view;

import java.util.ArrayList;
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
    }
    
    public FormProdutos() {
        initComponents();
        
        atualizaTabelaProdutos();
        /*jtfCodProduto.setText(String.valueOf(bk.getCodProduto()));
        jtfDescricao.setText(bk.getDescricao());
        jtfDptoCadastro.setText(bk.getDepartamentoNome());
        jtfMarca.setText(bk.getMarcaNome());
        jtfNome.setText(bk.getNome());
        jtfPreco.setText(bk.getPrecoString());*/
        
    }
    
   // private void preencheComboboxDpto(){
       
        
        
//}
        
    //}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMeusProdutos = new javax.swing.JTable();
        jLabel84 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        JLDpto1 = new javax.swing.JLabel();
        jcbDptoCadastro = new javax.swing.JComboBox<>();
        jlblCodigoCadastro = new javax.swing.JLabel();
        jtfMarcaCadastro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtfCodProdutoCadastro = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jtfDptoCadastro = new javax.swing.JTextField();
        jtfNomeCadastro = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jtfPrecoCadastro = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jtfDescricaoCadastro = new javax.swing.JTextField();
        jlLogoProdutoCadastro = new javax.swing.JLabel();
        btnCarregarImgProduto = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
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

        jLabel84.setText("Cadastro de Novos Produtos:");

        JLDpto1.setText("Departamento");

        jcbDptoCadastro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jlblCodigoCadastro.setText("Código:");

        jLabel11.setText("Nome:");

        jLabel12.setText("Departamento:");

        jLabel13.setText("Marca:");

        jLabel15.setText("Preço:");

        jLabel16.setText("Descrição:");

        jlLogoProdutoCadastro.setText("LOGO PRODUTO");

        btnCarregarImgProduto.setText("Carregar Imagem");

        btnAdicionar.setText("Adicionar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jcbDptoCadastro, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JLDpto1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                            .addComponent(jlLogoProdutoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblCodigoCadastro, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnCarregarImgProduto)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtfCodProdutoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtfNomeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(31, 31, 31)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addGap(18, 18, 18)
                                    .addComponent(jtfDptoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel13))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtfMarcaCadastro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtfPrecoCadastro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addComponent(jtfDescricaoCadastro))
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(JLDpto1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbDptoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlLogoProdutoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblCodigoCadastro)
                            .addComponent(jLabel12)
                            .addComponent(jtfDptoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtfCodProdutoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfMarcaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jLabel13)
                        .addComponent(jtfNomeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPrecoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfDescricaoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnCarregarImgProduto))
                .addGap(0, 13, Short.MAX_VALUE))
        );

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(jLabel84)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel84)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtMeusProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMeusProdutosMouseClicked
        // TODO add your handling code here:
        Produto produtoSelecionado = produtoTableModel.getProduto(jtMeusProdutos.getSelectedRow());
        
        jtfCodProduto.setText(String.valueOf(produtoSelecionado.getCodProduto()));
        jtfNome.setText(produtoSelecionado.getNome());
        jtaDescricao.setText(produtoSelecionado.getDescricao());
        jtfDpto.setText(produtoSelecionado.getDepartamento().getNomeDpto());
        jtfMarca.setText(produtoSelecionado.getMarca().getNomeMarca());
        jtfPreco.setText(produtoSelecionado.getPrecoString());
    }//GEN-LAST:event_jtMeusProdutosMouseClicked

    private void jbNovoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoProdutoActionPerformed
        // TODO add your handling code here:
        FormNovoProduto formNovoProduto = new FormNovoProduto();
        formNovoProduto.setVisible(true);
    }//GEN-LAST:event_jbNovoProdutoActionPerformed

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLDpto1;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnCarregarImgProduto;
    private javax.swing.JButton btnRemoverProduto;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbNovoProduto;
    private javax.swing.JComboBox<String> jcbDptoCadastro;
    private javax.swing.JLabel jlLogoProdutoCadastro;
    private javax.swing.JLabel jlblCodigo;
    private javax.swing.JLabel jlblCodigoCadastro;
    private javax.swing.JTable jtMeusProdutos;
    private javax.swing.JTextArea jtaDescricao;
    private javax.swing.JTextField jtfCodProduto;
    private javax.swing.JTextField jtfCodProdutoCadastro;
    private javax.swing.JTextField jtfDescricaoCadastro;
    private javax.swing.JTextField jtfDpto;
    private javax.swing.JTextField jtfDptoCadastro;
    private javax.swing.JTextField jtfMarca;
    private javax.swing.JTextField jtfMarcaCadastro;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfNomeCadastro;
    private javax.swing.JTextField jtfPreco;
    private javax.swing.JTextField jtfPrecoCadastro;
    // End of variables declaration//GEN-END:variables
}
