package projetofinal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JanelaCadastro extends javax.swing.JFrame {
    
    public static JanelaCadastro janelaCadastro = null;
    
    public static JanelaCadastro iniciar(){
        if(janelaCadastro == null){
            janelaCadastro = new JanelaCadastro();
        }
        return janelaCadastro;
    }
    public static JanelaCadastro fechar(){
        janelaCadastro = null;
        return janelaCadastro;
    }
    
    private JanelaCadastro() {
        initComponents();
        this.setVisible(true);
        this.pnlDebito.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        campoCelular = new javax.swing.JTextField();
        campoResidencial = new javax.swing.JTextField();
        campoLogin = new javax.swing.JTextField();
        opEmail = new javax.swing.JCheckBox();
        opDebito = new javax.swing.JCheckBox();
        campoSenha = new javax.swing.JPasswordField();
        pnlDebito = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        campoNumConta = new javax.swing.JTextField();
        campoCodBanco = new javax.swing.JTextField();
        btnImovel = new javax.swing.JButton();
        btnConcluir = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro");
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Noto Sans Mono", 0, 36)); // NOI18N
        jLabel2.setText("Cadastro");

        jLabel3.setFont(new java.awt.Font("Noto Mono", 0, 15)); // NOI18N
        jLabel3.setText("E-mail");

        jLabel4.setFont(new java.awt.Font("Noto Mono", 0, 15)); // NOI18N
        jLabel4.setText("Tel. Celular");

        jLabel5.setFont(new java.awt.Font("Noto Mono", 0, 15)); // NOI18N
        jLabel5.setText("Tel. Residencial");

        jLabel6.setFont(new java.awt.Font("Noto Mono", 0, 15)); // NOI18N
        jLabel6.setText("Login");

        jLabel7.setFont(new java.awt.Font("Noto Mono", 0, 15)); // NOI18N
        jLabel7.setText("Senha");

        campoEmail.setFont(new java.awt.Font("Noto Sans Mono", 0, 14)); // NOI18N
        campoEmail.setMinimumSize(new java.awt.Dimension(50, 30));
        campoEmail.setPreferredSize(new java.awt.Dimension(50, 30));

        campoCelular.setFont(new java.awt.Font("Noto Sans Mono", 0, 14)); // NOI18N
        campoCelular.setMinimumSize(new java.awt.Dimension(50, 30));
        campoCelular.setPreferredSize(new java.awt.Dimension(50, 30));

        campoResidencial.setFont(new java.awt.Font("Noto Sans Mono", 0, 14)); // NOI18N
        campoResidencial.setMinimumSize(new java.awt.Dimension(50, 30));
        campoResidencial.setPreferredSize(new java.awt.Dimension(50, 30));

        campoLogin.setFont(new java.awt.Font("Noto Sans Mono", 0, 14)); // NOI18N
        campoLogin.setMinimumSize(new java.awt.Dimension(50, 30));
        campoLogin.setPreferredSize(new java.awt.Dimension(50, 30));

        opEmail.setFont(new java.awt.Font("Noto Sans Mono", 0, 14)); // NOI18N
        opEmail.setText("Receber fatura por e-mail");

        opDebito.setFont(new java.awt.Font("Noto Sans Mono", 0, 14)); // NOI18N
        opDebito.setText("Solicitar débito automatico");
        opDebito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opDebitoActionPerformed(evt);
            }
        });

        campoSenha.setFont(new java.awt.Font("Noto Sans Mono", 0, 14)); // NOI18N
        campoSenha.setMinimumSize(new java.awt.Dimension(50, 30));
        campoSenha.setPreferredSize(new java.awt.Dimension(50, 30));

        jLabel8.setFont(new java.awt.Font("Noto Mono", 0, 14)); // NOI18N
        jLabel8.setText("Nº Conta");

        jLabel9.setFont(new java.awt.Font("Noto Mono", 0, 14)); // NOI18N
        jLabel9.setText("Cód. Banco ");

        campoNumConta.setFont(new java.awt.Font("Noto Sans Mono", 0, 12)); // NOI18N
        campoNumConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNumContaActionPerformed(evt);
            }
        });

        campoCodBanco.setFont(new java.awt.Font("Noto Sans Mono", 0, 12)); // NOI18N

        javax.swing.GroupLayout pnlDebitoLayout = new javax.swing.GroupLayout(pnlDebito);
        pnlDebito.setLayout(pnlDebitoLayout);
        pnlDebitoLayout.setHorizontalGroup(
            pnlDebitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDebitoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNumConta, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCodBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDebitoLayout.setVerticalGroup(
            pnlDebitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDebitoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDebitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(campoNumConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCodBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        btnImovel.setFont(new java.awt.Font("Noto Sans Mono", 0, 15)); // NOI18N
        btnImovel.setText("Cadastrar Imóvel");
        btnImovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImovelActionPerformed(evt);
            }
        });

        btnConcluir.setFont(new java.awt.Font("Noto Sans Mono", 0, 15)); // NOI18N
        btnConcluir.setText("Concluir");

        jLabel10.setFont(new java.awt.Font("Noto Sans Mono", 0, 15)); // NOI18N
        jLabel10.setText("Nome");

        campoNome.setFont(new java.awt.Font("Noto Sans Mono", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(btnImovel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnConcluir)
                .addGap(101, 101, 101))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoResidencial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(campoCelular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(campoEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(campoSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(campoLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(campoNome, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)))
                            .addComponent(opEmail)
                            .addComponent(opDebito)
                            .addComponent(pnlDebito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(opEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opDebito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDebito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImovel)
                    .addComponent(btnConcluir))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoNumContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNumContaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNumContaActionPerformed

    private void opDebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opDebitoActionPerformed
        if (this.opDebito.isSelected()){
            this.pnlDebito.setVisible(true);
        } else{
            this.pnlDebito.setVisible(false);
        }
    }//GEN-LAST:event_opDebitoActionPerformed

    private void btnImovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImovelActionPerformed
        this.btnImovel.addActionListener(new JanelaListener());
    }//GEN-LAST:event_btnImovelActionPerformed
    
    private void limparCampos(){
        this.campoCelular.setText("");
        this.campoCodBanco.setText("");
        this.campoEmail.setText("");
        this.campoNome.setText("");
        this.campoNumConta.setText("");
        this.campoResidencial.setText("");
        this.campoSenha.setText("");
    }
    
    private class JanelaListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            JanelaCadastrarImovel janelaCadastro = JanelaCadastrarImovel.iniciar();
            janelaCadastro.addWindowListener(new WindowAdapter(){
                @Override
                public void windowClosing(WindowEvent e){
                    JanelaCadastro.fechar();
                }
            });
        }
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConcluir;
    private javax.swing.JButton btnImovel;
    private javax.swing.JTextField campoCelular;
    private javax.swing.JTextField campoCodBanco;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoLogin;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoNumConta;
    private javax.swing.JTextField campoResidencial;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox opDebito;
    private javax.swing.JCheckBox opEmail;
    private javax.swing.JPanel pnlDebito;
    // End of variables declaration//GEN-END:variables
}
