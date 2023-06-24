package projetofinal;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JanelaPrincipal extends javax.swing.JFrame {
    private CardLayout paginas;
    
    public JanelaPrincipal() {
        initComponents();
        paginas = (CardLayout) this.painelPrincipal.getLayout();
        this.painelPrincipal.add(new TelaServicos(paginas), "telaServicos");
        this.painelPrincipal.add(new TelaInfos(paginas), "telaInfos");
        this.painelPrincipal.add(new TelaCadastroImovel(), "telaCadastroImovel");
        this.painelPrincipal.add(new TelaVazamento(), "telaVazamento");
        this.painelPrincipal.add(new TelaServicosFuncionario(paginas), "telaServFuncionario");
        this.painelPrincipal.add(new TelaSolicitacoes(), "telaSolicitacoes");
    }
    
    public void limparCampos(){
        this.campoID.setText("");
        this.campoSenha.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        painelLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoID = new javax.swing.JTextField();
        campoSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Seneamento Água");
        setResizable(false);

        painelPrincipal.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Noto Sans Mono", 0, 48)); // NOI18N
        jLabel1.setText("Bem-Vindo!!!");

        jLabel2.setFont(new java.awt.Font("Noto Sans Mono", 0, 18)); // NOI18N
        jLabel2.setText("Login");

        jLabel3.setFont(new java.awt.Font("Noto Sans Mono", 0, 18)); // NOI18N
        jLabel3.setText("Senha");

        campoID.setFont(new java.awt.Font("Noto Sans Mono", 0, 14)); // NOI18N

        campoSenha.setFont(new java.awt.Font("Noto Sans Mono", 0, 14)); // NOI18N

        btnEntrar.setFont(new java.awt.Font("Noto Sans Mono", 0, 18)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        btnCadastrar.setFont(new java.awt.Font("Noto Sans Mono", 0, 18)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelLoginLayout = new javax.swing.GroupLayout(painelLogin);
        painelLogin.setLayout(painelLoginLayout);
        painelLoginLayout.setHorizontalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLoginLayout.createSequentialGroup()
                .addContainerGap(186, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(166, 166, 166))
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelLoginLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(campoSenha))
                    .addGroup(painelLoginLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLoginLayout.createSequentialGroup()
                        .addComponent(btnCadastrar)
                        .addGap(64, 64, 64)
                        .addComponent(btnEntrar)
                        .addGap(34, 34, 34)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelLoginLayout.setVerticalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntrar)
                    .addComponent(btnCadastrar))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        painelPrincipal.add(painelLogin, "janelaLogin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        this.btnCadastrar.addActionListener(new JanelaListener());
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        paginas.show(this.painelPrincipal, "telaServicos");
    }//GEN-LAST:event_btnEntrarActionPerformed

    private class JanelaListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            JanelaCadastro janelaCadastro = JanelaCadastro.iniciar();
            janelaCadastro.addWindowListener(new WindowAdapter(){
                @Override
                public void windowClosing(WindowEvent e){
                    JanelaCadastro.fechar();
                }
            });
        }
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
  
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JanelaPrincipal principal = new JanelaPrincipal();
                principal.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JTextField campoID;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel painelLogin;
    public javax.swing.JPanel painelPrincipal;
    // End of variables declaration//GEN-END:variables
}
