package view;

import javax.swing.JOptionPane;
import modelDominio.Usuario;

public class FormAlterarSenhaRecup extends javax.swing.JFrame {

    public FormAlterarSenhaRecup() {
        initComponents();
        jlAvisoEmail.setVisible(false);
        jlAvisoSenha.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtfEmailUsuario = new javax.swing.JTextField();
        jlEmail = new javax.swing.JLabel();
        jlAvisoEmail = new javax.swing.JLabel();
        jlNovaSenha = new javax.swing.JLabel();
        jlAvisoSenha = new javax.swing.JLabel();
        jbConfirmar = new javax.swing.JButton();
        jpfNovaSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jlEmail.setText("Informe o seu email cadastrado no app");

        jlAvisoEmail.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jlAvisoEmail.setForeground(new java.awt.Color(255, 0, 0));
        jlAvisoEmail.setText("Informe o email!");

        jlNovaSenha.setText("Informe uma nova senha");

        jlAvisoSenha.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jlAvisoSenha.setForeground(new java.awt.Color(255, 0, 0));
        jlAvisoSenha.setText("Informe a senha!");

        jbConfirmar.setText("Confirmar");
        jbConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jbConfirmar)
                .addContainerGap(133, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpfNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlAvisoSenha)
                        .addComponent(jlNovaSenha)
                        .addComponent(jlAvisoEmail)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfEmailUsuario))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jlEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlAvisoEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfEmailUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jlNovaSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlAvisoSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpfNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbConfirmar)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarActionPerformed
        if (jtfEmailUsuario.getText().equals("")) {
            jlAvisoEmail.setVisible(true);
            jtfEmailUsuario.requestFocus();
            return;
        } else if (jpfNovaSenha.getText().equals("")) {
            jlAvisoSenha.setVisible(true);
            jpfNovaSenha.requestFocus();
            return;
        }
        jlAvisoEmail.setVisible(false);
        jlAvisoSenha.setVisible(false);
        
        String email = jtfEmailUsuario.getText();
        String senha = jpfNovaSenha.getText();
        
        Usuario usr = new Usuario(email, senha);
        
        if (DominusAppCliente.conexaoController.alterarSenhaRecup(usr)) {
            JOptionPane.showMessageDialog(rootPane, "Senha alterada com sucesso!", "Recuperação de senha", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Erro ao alterar senha.", "Recuperação de senha", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbConfirmarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbConfirmar;
    private javax.swing.JLabel jlAvisoEmail;
    private javax.swing.JLabel jlAvisoSenha;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlNovaSenha;
    private javax.swing.JPasswordField jpfNovaSenha;
    private javax.swing.JTextField jtfEmailUsuario;
    // End of variables declaration//GEN-END:variables
}
