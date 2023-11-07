package view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelDominio.Departamento;
import modelDominio.Marca;
import modelDominio.Produto;
import modelDominio.Vendedor;
import view.util.ComboboxDepartamento;
import view.util.ComboboxMarca;

public class FormNovoProduto extends javax.swing.JFrame {

    public void preencheComboBox() {
        ArrayList<Marca> listaMarcas = DominusAppCliente.conexaoController.listaMarcas();
        ArrayList<Departamento> listaDepartamentos = DominusAppCliente.conexaoController.listaDepartamentos();
        
        if (listaMarcas != null) 
            ComboboxMarca.preencheComboBoxMarca(0, jcbMarca, listaMarcas, true);
        
        if (listaDepartamentos != null) 
            ComboboxDepartamento.preencheComboBoxDepartamento(0, jcbDepartamento, listaDepartamentos, true);    
    }
    
    public FormNovoProduto() {
        initComponents();
        limpaAvisos();
        preencheComboBox();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlNome = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jlMarca = new javax.swing.JLabel();
        jcbMarca = new javax.swing.JComboBox<>();
        jlDepartamento = new javax.swing.JLabel();
        jcbDepartamento = new javax.swing.JComboBox<>();
        jspDescricao = new javax.swing.JScrollPane();
        jtaDescricao = new javax.swing.JTextArea();
        jlDescricao = new javax.swing.JLabel();
        jlPreco = new javax.swing.JLabel();
        jbCadastrar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jlAvisoNome = new javax.swing.JLabel();
        jlAvisoMarca = new javax.swing.JLabel();
        jlAvisoDepartamento = new javax.swing.JLabel();
        jlAvisoPreco = new javax.swing.JLabel();
        jftfPreco = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Novo Produto");

        jlNome.setText("Nome");

        jlMarca.setText("Marca");

        jcbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jlDepartamento.setText("Departamento");

        jcbDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jspDescricao.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jtaDescricao.setColumns(20);
        jtaDescricao.setLineWrap(true);
        jtaDescricao.setRows(5);
        jtaDescricao.setWrapStyleWord(true);
        jspDescricao.setViewportView(jtaDescricao);

        jlDescricao.setText("Descrição");

        jlPreco.setText("Preço");

        jbCadastrar.setText("Cadastrar");
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jlAvisoNome.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jlAvisoNome.setForeground(new java.awt.Color(255, 0, 0));
        jlAvisoNome.setText("Informe o nome!");

        jlAvisoMarca.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jlAvisoMarca.setForeground(new java.awt.Color(255, 0, 0));
        jlAvisoMarca.setText("Informe a marca!");

        jlAvisoDepartamento.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jlAvisoDepartamento.setForeground(new java.awt.Color(255, 0, 0));
        jlAvisoDepartamento.setText("Informe o departamento!");

        jlAvisoPreco.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jlAvisoPreco.setForeground(new java.awt.Color(255, 0, 0));
        jlAvisoPreco.setText("Informe o preco!");

        jftfPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlMarca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlAvisoMarca))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlAvisoNome))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlDepartamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlAvisoDepartamento))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jtfNome, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jcbMarca, javax.swing.GroupLayout.Alignment.LEADING, 0, 187, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jspDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlDescricao)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jftfPreco, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jlPreco)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jlAvisoPreco))))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome)
                    .addComponent(jlDescricao)
                    .addComponent(jlAvisoNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlMarca)
                            .addComponent(jlAvisoMarca))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jspDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDepartamento)
                    .addComponent(jlPreco)
                    .addComponent(jlAvisoDepartamento)
                    .addComponent(jlAvisoPreco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jftfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        limpaCampos();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        if (jtfNome.getText().equals("")) {
            jlAvisoNome.setVisible(true);
            jtfNome.requestFocus();
            return;
        }
        if (jcbMarca.getSelectedIndex() == 0) {
            jlAvisoMarca.setVisible(true);
            jcbMarca.requestFocus();
            return;
        }
        if (jcbDepartamento.getSelectedIndex() == 0) {
            jlAvisoDepartamento.setVisible(true);
            jcbDepartamento.requestFocus();
            return;
        }
        if (jftfPreco.getText().equals("")) {
            jlAvisoPreco.setVisible(true);
            jlAvisoPreco.requestFocus();
            return;
        }
        
        limpaAvisos();
        
        String nome = jtfNome.getText();
        String descricao = jtaDescricao.getText();
        float preco = ((Number)jftfPreco.getValue()).floatValue();
        Marca marcaProduto = new Marca(ComboboxMarca.getSelectedIndex(jcbMarca));
        Departamento dptoProduto = new Departamento(ComboboxDepartamento.getSelectedIndex(jcbDepartamento));
        Vendedor vendedorProduto = (Vendedor)DominusAppCliente.conexaoController.getUsuario();
        
        Produto novoProduto = new Produto(nome, descricao, preco, marcaProduto, dptoProduto, vendedorProduto);
        
        if (DominusAppCliente.conexaoController.produtoInserir(novoProduto)) {
            JOptionPane.showMessageDialog(rootPane, "Produto cadastrado com sucesso!", "Cadastro de produto", 
                    JOptionPane.INFORMATION_MESSAGE);
            limpaCampos();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Erro ao cadastrar produto.", "Cadastro de produto",
                    JOptionPane.INFORMATION_MESSAGE);
        }
  
    }//GEN-LAST:event_jbCadastrarActionPerformed

    public void limpaAvisos() {
        jlAvisoDepartamento.setVisible(false);
        jlAvisoMarca.setVisible(false);
        jlAvisoNome.setVisible(false);
        jlAvisoPreco.setVisible(false);
    }
    
    public void limpaCampos() {
        jtaDescricao.setText("");
        jtfNome.setText("");
        jftfPreco.setText("");
        jcbMarca.setSelectedIndex(0);
        jcbDepartamento.setSelectedIndex(0);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JComboBox<String> jcbDepartamento;
    private javax.swing.JComboBox<String> jcbMarca;
    private javax.swing.JFormattedTextField jftfPreco;
    private javax.swing.JLabel jlAvisoDepartamento;
    private javax.swing.JLabel jlAvisoMarca;
    private javax.swing.JLabel jlAvisoNome;
    private javax.swing.JLabel jlAvisoPreco;
    private javax.swing.JLabel jlDepartamento;
    private javax.swing.JLabel jlDescricao;
    private javax.swing.JLabel jlMarca;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlPreco;
    private javax.swing.JScrollPane jspDescricao;
    private javax.swing.JTextArea jtaDescricao;
    private javax.swing.JTextField jtfNome;
    // End of variables declaration//GEN-END:variables
}
