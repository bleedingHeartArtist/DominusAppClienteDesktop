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
        jlAvisoEmail = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Recuperar senha");

        jlInstrucaoRecup.setText("Digite seu email para que lhe enviemos um código de recuperação");
        jlInstrucaoRecup.setToolTipText("");

        jbEnviar.setText("Enviar");
        jbEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEnviarActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlInstrucaoRecup))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfEmailDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jlAvisoEmail))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(jbEnviar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jlInstrucaoRecup)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAvisoEmail)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfEmailDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jbEnviar)
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JLabel jlAvisoEmail;
    private javax.swing.JLabel jlInstrucaoRecup;
    private javax.swing.JTextField jtfEmailDestinatario;
    // End of variables declaration//GEN-END:variables
}
