package view;

import modelDominio.Usuario;

public class FormLogin extends javax.swing.JFrame {

    /**
     * Creates new form FormLogin
     */
    public FormLogin() {
        initComponents();
        jlAviso.setVisible(false);
        jlAvisoLogin.setVisible(false);
        jlAvisoSenha.setVisible(false);
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlImagem = new javax.swing.JLabel();
        jbEntrar = new javax.swing.JButton();
        jbCadastro = new javax.swing.JButton();
        jtfLogin = new javax.swing.JTextField();
        jlLogin = new javax.swing.JLabel();
        jlSenha = new javax.swing.JLabel();
        jpfSenha = new javax.swing.JPasswordField();
        jlAvisoLogin = new javax.swing.JLabel();
        jlAvisoSenha = new javax.swing.JLabel();
        jlAviso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlImagem.setText("Imagem LOGO");

        jbEntrar.setText("Entrar");
        jbEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEntrarActionPerformed(evt);
            }
        });

        jbCadastro.setText("Cadastro");
        jbCadastro.setToolTipText("");
        jbCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastroActionPerformed(evt);
            }
        });

        jlLogin.setText("Login");

        jlSenha.setText("Senha");

        jlAvisoLogin.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jlAvisoLogin.setForeground(new java.awt.Color(255, 0, 0));
        jlAvisoLogin.setText("Informe o login!");

        jlAvisoSenha.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jlAvisoSenha.setForeground(new java.awt.Color(255, 0, 0));
        jlAvisoSenha.setText("Informe uma senha!");

        jlAviso.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jlAviso.setForeground(new java.awt.Color(255, 0, 0));
        jlAviso.setText("Login ou senha incorretos.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlSenha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlAvisoSenha))
                            .addComponent(jpfSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(jtfLogin)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlAvisoLogin))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jlImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(jbCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jlAviso)))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jlImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlLogin)
                    .addComponent(jlAvisoLogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSenha)
                    .addComponent(jlAvisoSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlAviso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jbEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEntrarActionPerformed
        // TODO add your handling code here:
        if (jtfLogin.getText().equals("")) {
            jlAvisoLogin.setVisible(true);
            jtfLogin.requestFocus();
            return;
        }
        
        if (jpfSenha.getPassword().equals("")) {
           jlAvisoSenha.setVisible(true);
           jpfSenha.requestFocus();
           return;
        }
        
        jlAvisoLogin.setVisible(false);
        jlAvisoSenha.setVisible(false);
        
        
        String senha = jpfSenha.getText();
        Usuario usuario = new Usuario(jtfLogin.getText(), senha);
        Usuario usuarioLogado = DominusAppCliente.conexaoController.efetuarLogin(usuario);
        
        if (usuarioLogado != null) {
            jlAviso.setVisible(false);
            DominusAppCliente.conexaoController.setUsuario(usuarioLogado);
            FormPrincipal formPrincipal = new FormPrincipal();
            formPrincipal.setVisible(true);
        } else {
            jlAviso.setVisible(true);
        }
        
    }//GEN-LAST:event_jbEntrarActionPerformed

    private void jbCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbCadastroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbCadastro;
    private javax.swing.JButton jbEntrar;
    private javax.swing.JLabel jlAviso;
    private javax.swing.JLabel jlAvisoLogin;
    private javax.swing.JLabel jlAvisoSenha;
    private javax.swing.JLabel jlImagem;
    private javax.swing.JLabel jlLogin;
    private javax.swing.JLabel jlSenha;
    private javax.swing.JPasswordField jpfSenha;
    private javax.swing.JTextField jtfLogin;
    // End of variables declaration//GEN-END:variables
}
