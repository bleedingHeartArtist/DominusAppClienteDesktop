package view;

import java.awt.Color;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelDominio.Usuario;
import view.util.Hash;

public class FormLogin extends javax.swing.JFrame {

    public void limpaAvisos() {
        jlAvisoLogin.setVisible(false);
        jlAvisoSenha.setVisible(false);
        jlAviso.setVisible(false);
    }
    public FormLogin() {
        initComponents();
        getContentPane().setBackground(new Color(40,45,51));
        limpaAvisos();
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
        jlEsqueceuSenha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jlImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/logoDominusApp.png"))); // NOI18N

        jbEntrar.setBackground(new java.awt.Color(230, 142, 132));
        jbEntrar.setText("Entrar");
        jbEntrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jbEntrar.setContentAreaFilled(false);
        jbEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbEntrar.setOpaque(true);
        jbEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEntrarActionPerformed(evt);
            }
        });

        jbCadastro.setBackground(new java.awt.Color(40, 45, 51));
        jbCadastro.setForeground(new Color(221,221,221));
        jbCadastro.setText("Cadastro");
        jbCadastro.setToolTipText("");
        jbCadastro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 142, 132), 2, true));
        jbCadastro.setContentAreaFilled(false);
        jbCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbCadastro.setOpaque(true);
        jbCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastroActionPerformed(evt);
            }
        });

        jtfLogin.setBackground(new java.awt.Color(25, 30, 33));
        jtfLogin.setForeground(new Color(221,221,221));
        jtfLogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 8, 4, 8));
        jtfLogin.setCaretColor(new Color(221,221,221));

        jlLogin.setBackground(new java.awt.Color(221, 221, 221));
        jlLogin.setForeground(new Color(221,221,221));
        jlLogin.setText("Login");

        jlSenha.setBackground(new java.awt.Color(221, 221, 221));
        jlSenha.setForeground(new Color(221,221,221));
        jlSenha.setText("Senha");

        jpfSenha.setBackground(new java.awt.Color(25, 30, 33));
        jpfSenha.setForeground(new Color(221,221,221));
        jpfSenha.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 8, 4, 8));
        jpfSenha.setCaretColor(new Color(221,221,221));
        jpfSenha.setDisabledTextColor(new Color(221,221,221));

        jlAvisoLogin.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jlAvisoLogin.setForeground(new java.awt.Color(255, 0, 0));
        jlAvisoLogin.setText("Informe o login!");

        jlAvisoSenha.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jlAvisoSenha.setForeground(new java.awt.Color(255, 0, 0));
        jlAvisoSenha.setText("Informe uma senha!");

        jlAviso.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jlAviso.setForeground(new java.awt.Color(255, 0, 0));
        jlAviso.setText("Login ou senha incorretos.");

        jlEsqueceuSenha.setForeground(new java.awt.Color(255, 204, 0));
        jlEsqueceuSenha.setText("Esqueceu sua senha?");
        jlEsqueceuSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlEsqueceuSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlEsqueceuSenhaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jpfSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(jtfLogin)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlSenha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlAvisoSenha))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlAvisoLogin)
                                    .addComponent(jlImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(jbCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jlAviso)))
                .addContainerGap(143, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlEsqueceuSenha)
                .addGap(185, 185, 185))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jlImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlEsqueceuSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            limpaAvisos();
            jlAvisoLogin.setVisible(true);
            jtfLogin.requestFocus();
            return;
        } else if (jpfSenha.getText().equals("")) {
           limpaAvisos();
           jlAvisoSenha.setVisible(true);
           jpfSenha.requestFocus();
           return;
        }
        
        limpaAvisos();
        String senha;
        
        try {
            senha = Hash.encriptar(jpfSenha.getText(), "SHA-256");
        } catch (NoSuchAlgorithmException nsae) {
            nsae.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Erro ao efetuar login.",
                    "Login",JOptionPane.ERROR_MESSAGE);
            return;
        } catch (UnsupportedEncodingException unse) {
            unse.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Erro ao efetuar login.",
                    "Login",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Usuario usuario = new Usuario(jtfLogin.getText(), senha);
        Usuario usuarioLogado = DominusAppCliente.conexaoController.efetuarLogin(usuario);
        
        if (usuarioLogado != null) {
            jlAviso.setVisible(false);
            DominusAppCliente.conexaoController.setUsuario(usuarioLogado);
            FormPrincipal formPrincipal = new FormPrincipal();
            formPrincipal.setVisible(true);
            dispose();
        } else {
            jlAviso.setVisible(true);
        }  
    }//GEN-LAST:event_jbEntrarActionPerformed

    private void jbCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastroActionPerformed
        FormCadastroUsuario formCadastroUsuario = new FormCadastroUsuario();
        formCadastroUsuario.setVisible(true);
    }//GEN-LAST:event_jbCadastroActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        DominusAppCliente.conexaoController.fim();
    }//GEN-LAST:event_formWindowClosing

    private void jlEsqueceuSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlEsqueceuSenhaMouseClicked
        FormRecuperarSenha formRecuperarSenha = new FormRecuperarSenha();
        formRecuperarSenha.setVisible(true);
    }//GEN-LAST:event_jlEsqueceuSenhaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbCadastro;
    private javax.swing.JButton jbEntrar;
    private javax.swing.JLabel jlAviso;
    private javax.swing.JLabel jlAvisoLogin;
    private javax.swing.JLabel jlAvisoSenha;
    private javax.swing.JLabel jlEsqueceuSenha;
    private javax.swing.JLabel jlImagem;
    private javax.swing.JLabel jlLogin;
    private javax.swing.JLabel jlSenha;
    private javax.swing.JPasswordField jpfSenha;
    private javax.swing.JTextField jtfLogin;
    // End of variables declaration//GEN-END:variables
}
