package view;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import modelDominio.Vendedor;

public class FormCadastroUsuario extends javax.swing.JFrame {

    public FormCadastroUsuario() {
        initComponents();
        limpaAvisos();
        //this.getContentPane().setBackground(new java.awt.Color(1,12,35));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlNome = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jlLogin = new javax.swing.JLabel();
        jtfLogin = new javax.swing.JTextField();
        jlEndereco = new javax.swing.JLabel();
        jtfEndereco = new javax.swing.JTextField();
        jlCnpj = new javax.swing.JLabel();
        jtfCnpj = new javax.swing.JTextField();
        jpfSenha = new javax.swing.JPasswordField();
        jlSenha = new javax.swing.JLabel();
        jbCadastrar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jlAvisoNome = new javax.swing.JLabel();
        jlAvisoLogin = new javax.swing.JLabel();
        jlAvisoEndereco = new javax.swing.JLabel();
        jlAvisoCnpj = new javax.swing.JLabel();
        jlAvisoSenha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro");
        setBackground(new java.awt.Color(1, 0, 77));

        jlNome.setText("Nome");

        jlLogin.setText("Login");

        jlEndereco.setText("Endereço");

        jlCnpj.setText("CNPJ");

        jlSenha.setText("Senha");

        jbCadastrar.setBackground(new java.awt.Color(134, 0, 201));
        jbCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbCadastrar.setText("Cadastrar");
        jbCadastrar.setBorder(null);
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

        jlAvisoLogin.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jlAvisoLogin.setForeground(new java.awt.Color(255, 0, 0));
        jlAvisoLogin.setText("Informe o login!");

        jlAvisoEndereco.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jlAvisoEndereco.setForeground(new java.awt.Color(255, 0, 0));
        jlAvisoEndereco.setText("Informe o endereço!");

        jlAvisoCnpj.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jlAvisoCnpj.setForeground(new java.awt.Color(255, 0, 0));
        jlAvisoCnpj.setText("Informe o CNPJ!");

        jlAvisoSenha.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jlAvisoSenha.setForeground(new java.awt.Color(255, 0, 0));
        jlAvisoSenha.setText("Informe a senha!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlAvisoEndereco))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlAvisoLogin))
                    .addComponent(jtfNome, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlAvisoNome))
                    .addComponent(jtfLogin)
                    .addComponent(jtfEndereco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlCnpj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlAvisoCnpj))
                    .addComponent(jtfCnpj, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlAvisoSenha))
                    .addComponent(jpfSenha))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(152, 152, 152))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlNome)
                            .addComponent(jlAvisoNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlCnpj)
                            .addComponent(jlAvisoCnpj))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlLogin)
                            .addComponent(jlAvisoLogin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlSenha)
                            .addComponent(jlAvisoSenha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEndereco)
                    .addComponent(jlAvisoEndereco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        limpaAvisos();
        
        if (jtfNome.getText().equals("")) {
            jlAvisoNome.setVisible(true);
            return;
        } else if (jtfLogin.getText().equals("")) {
            jlAvisoLogin.setVisible(true);
            return;
        } else if (jtfEndereco.getText().equals("")) {
            jlAvisoEndereco.setVisible(true);
            return;
        } else if (jtfCnpj.getText().equals("")) {
            jlAvisoCnpj.setVisible(true);
            return;
        } else if (jpfSenha.getText().equals("")) {
            jlAvisoSenha.setVisible(true);
            return;
        }
        
        limpaAvisos();
        
        String nome = jtfNome.getText();
        String login = jtfLogin.getText();
        String senha = jpfSenha.getText();
        String endereco = jtfEndereco.getText();
        String cnpj = jtfCnpj.getText();
        
        Vendedor novoVendedor = new Vendedor (cnpj, nome, login, senha, endereco);
        
        if (DominusAppCliente.conexaoController.vendedorInserir(novoVendedor)) {
            JOptionPane.showMessageDialog(rootPane, "Cadastro realizado com sucesso!",
                    "Cadastro",JOptionPane.INFORMATION_MESSAGE);
            limpaCampos();
            dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Erro ao efetuar cadastro.",
                    "Cadastro",JOptionPane.ERROR_MESSAGE);
        }   
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        limpaCampos();
    }//GEN-LAST:event_jbLimparActionPerformed

    public void limpaAvisos() {
        jlAvisoNome.setVisible(false);
        jlAvisoLogin.setVisible(false);
        jlAvisoEndereco.setVisible(false);
        jlAvisoCnpj.setVisible(false);
        jlAvisoSenha.setVisible(false);
    }
    public void limpaCampos(){
        jtfNome.setText("");
        jtfLogin.setText("");
        jtfEndereco.setText("");
        jtfCnpj.setText("");
        jpfSenha.setText("");
    }   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JLabel jlAvisoCnpj;
    private javax.swing.JLabel jlAvisoEndereco;
    private javax.swing.JLabel jlAvisoLogin;
    private javax.swing.JLabel jlAvisoNome;
    private javax.swing.JLabel jlAvisoSenha;
    private javax.swing.JLabel jlCnpj;
    private javax.swing.JLabel jlEndereco;
    private javax.swing.JLabel jlLogin;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlSenha;
    private javax.swing.JPasswordField jpfSenha;
    private javax.swing.JTextField jtfCnpj;
    private javax.swing.JTextField jtfEndereco;
    private javax.swing.JTextField jtfLogin;
    private javax.swing.JTextField jtfNome;
    // End of variables declaration//GEN-END:variables
}
