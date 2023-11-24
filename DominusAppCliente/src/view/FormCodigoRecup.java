package view;

public class FormCodigoRecup extends javax.swing.JFrame {
    private int codigoRecuperacao;
    
    public FormCodigoRecup(int codRecuperacao) {
        initComponents();
        this.codigoRecuperacao = codRecuperacao;
        jlAvisoCodigo.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtfCodigoRecuperacao = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jbConfirmar = new javax.swing.JButton();
        jlAvisoCodigo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Digite o código de 4 digitos enviado para o seu email");

        jbConfirmar.setText("Confirmar");
        jbConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarActionPerformed(evt);
            }
        });

        jlAvisoCodigo.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jlAvisoCodigo.setForeground(new java.awt.Color(255, 0, 0));
        jlAvisoCodigo.setText("Informe o código!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jtfCodigoRecuperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlAvisoCodigo)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbConfirmar)
                        .addGap(120, 120, 120))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jlAvisoCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfCodigoRecuperacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jbConfirmar)
                .addGap(33, 33, 33))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarActionPerformed
        if (jtfCodigoRecuperacao.getText().equals("")) {
            jlAvisoCodigo.setVisible(true);
            return;
        }
        jlAvisoCodigo.setVisible(false);
        if (Integer.parseInt(jtfCodigoRecuperacao.getText()) == this.codigoRecuperacao) {
            FormAlterarSenhaRecup formAlterarSenha = new FormAlterarSenhaRecup();
            formAlterarSenha.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jbConfirmarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbConfirmar;
    private javax.swing.JLabel jlAvisoCodigo;
    private javax.swing.JTextField jtfCodigoRecuperacao;
    // End of variables declaration//GEN-END:variables
}
