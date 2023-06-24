package projetofinal;

import java.awt.CardLayout;
     
public class TelaServicos extends javax.swing.JPanel {
    
    private CardLayout cardLayout;
    
    public TelaServicos(CardLayout layout) {
        initComponents();
        cardLayout = layout;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnImovel = new javax.swing.JButton();
        btnVisualizarInfos = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnVazamento = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Noto Sans Mono", 0, 36)); // NOI18N
        jLabel1.setText("Serviços");

        jButton1.setFont(new java.awt.Font("Noto Sans Mono", 0, 15)); // NOI18N
        jButton1.setText("Segunda via de conta");

        btnImovel.setFont(new java.awt.Font("Noto Sans Mono", 0, 15)); // NOI18N
        btnImovel.setText("Cadastrar Imóvel");
        btnImovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImovelActionPerformed(evt);
            }
        });

        btnVisualizarInfos.setFont(new java.awt.Font("Noto Sans Mono", 0, 15)); // NOI18N
        btnVisualizarInfos.setText("Vizualizar Perfil");
        btnVisualizarInfos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarInfosActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Noto Sans Mono", 0, 15)); // NOI18N
        jButton4.setText("Solicitar Religamento");

        btnVazamento.setFont(new java.awt.Font("Noto Sans Mono", 0, 15)); // NOI18N
        btnVazamento.setText("Informar Vazamento");
        btnVazamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVazamentoActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Noto Sans Mono", 0, 15)); // NOI18N
        jButton6.setText("Solicitar Atendimento");

        btnSair.setFont(new java.awt.Font("Noto Mono", 0, 15)); // NOI18N
        btnSair.setText("Sair");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnImovel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVazamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVisualizarInfos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(77, 77, 77))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(btnSair)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVisualizarInfos, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnImovel, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVazamento, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(btnSair)
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVisualizarInfosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarInfosActionPerformed
        cardLayout.show(this.getParent(), "telaInfos");
    }//GEN-LAST:event_btnVisualizarInfosActionPerformed

    private void btnImovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImovelActionPerformed
        cardLayout.show(this.getParent(), "telaCadastroImovel");
    }//GEN-LAST:event_btnImovelActionPerformed

    private void btnVazamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVazamentoActionPerformed
        cardLayout.show(this.getParent(), "telaVazamento");
    }//GEN-LAST:event_btnVazamentoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImovel;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVazamento;
    private javax.swing.JButton btnVisualizarInfos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
