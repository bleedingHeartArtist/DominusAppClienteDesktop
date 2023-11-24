package view;

import controller.ConexaoController;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class FormRecuperarSenha extends javax.swing.JFrame {
          
    public FormRecuperarSenha() {
        initComponents();
        jlAvisoEmail.setVisible(false);
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtfEmailDestinatario = new javax.swing.JTextField();
        jlInstrucaoRecup = new javax.swing.JLabel();
        jbEnviar = new javax.swing.JButton();
        jbRecebi = new javax.swing.JButton();
        jlAvisoEmail = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Recuperar senha");

        jlInstrucaoRecup.setText("Digite seu email para que lhe enviemos uma nova senha.");
        jlInstrucaoRecup.setToolTipText("");

        jbEnviar.setText("Enviar");
        jbEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEnviarActionPerformed(evt);
            }
        });

        jbRecebi.setText("Recebi!");
        jbRecebi.setEnabled(false);
        jbRecebi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRecebiActionPerformed(evt);
            }
        });

        jlAvisoEmail.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jlAvisoEmail.setForeground(new java.awt.Color(255, 51, 51));
        jlAvisoEmail.setText("Informe um email!");

        jLabel1.setText("Email");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jbEnviar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jbRecebi)
                        .addGap(39, 39, 39))
                    .addComponent(jtfEmailDestinatario)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlAvisoEmail)))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlInstrucaoRecup)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jlInstrucaoRecup)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAvisoEmail)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfEmailDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEnviar)
                    .addComponent(jbRecebi))
                .addGap(19, 19, 19))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbRecebiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRecebiActionPerformed
        dispose();
    }//GEN-LAST:event_jbRecebiActionPerformed

    private void jbEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEnviarActionPerformed
        if (jtfEmailDestinatario.getText().equals("")) {
            jlAvisoEmail.setVisible(true);
            jtfEmailDestinatario.requestFocus();
            return;
        } 
        jlAvisoEmail.setVisible(false);
        
        String emailDestinatario = jtfEmailDestinatario.getText();
        
        int codigoRecup = DominusAppCliente.conexaoController.recuperarSenha(emailDestinatario);
        
        if (codigoRecup != -1) {
            FormCodigoRecup formRecup = new FormCodigoRecup(codigoRecup); 
            formRecup.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Erro ao enviar email.", "Recuperação de senha",
                    JOptionPane.ERROR_MESSAGE);
        }    
    }//GEN-LAST:event_jbEnviarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbEnviar;
    private javax.swing.JButton jbRecebi;
    private javax.swing.JLabel jlAvisoEmail;
    private javax.swing.JLabel jlInstrucaoRecup;
    private javax.swing.JTextField jtfEmailDestinatario;
    // End of variables declaration//GEN-END:variables
}
