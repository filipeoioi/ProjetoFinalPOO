package projetofinal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

public class JanelaCadastro extends javax.swing.JFrame {
    
    public static JanelaCadastro janelaCadastro = null;
    private Controller controller;
    
    public static JanelaCadastro iniciar(Controller controller){
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
        this.lblExiste.setText("");
        
        this.controller = Controller.iniciar(); 
        
        this.opDebito.addItemListener(new PainelListener());
        this.opEmail.addItemListener(new PainelListener());
        this.grupoOp.add(this.opDebito);
        this.grupoOp.add(this.opEmail); 
        
        this.campoLogin.addKeyListener(new KeyAdapter(){
            @Override
            public void keyReleased(KeyEvent ke) {
                if (controller.verificaLogin(campoLogin.getText().trim())){
                    lblExiste.setText("Já existe");
                }else{
                    lblExiste.setText("");
                }
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoOp = new javax.swing.ButtonGroup();
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
        lblExiste = new javax.swing.JLabel();
        opEmail = new javax.swing.JRadioButton();
        opDebito = new javax.swing.JRadioButton();

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
        btnConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluirActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Noto Sans Mono", 0, 15)); // NOI18N
        jLabel10.setText("Nome");

        campoNome.setFont(new java.awt.Font("Noto Sans Mono", 0, 14)); // NOI18N

        lblExiste.setFont(new java.awt.Font("Noto Sans Mono", 0, 10)); // NOI18N
        lblExiste.setText("Já existe");

        opEmail.setFont(new java.awt.Font("Noto Sans Mono", 0, 12)); // NOI18N
        opEmail.setText("Receber fatura por e-mail");

        opDebito.setFont(new java.awt.Font("Noto Sans Mono", 0, 12)); // NOI18N
        opDebito.setText("Solicitar débito automatico");
        opDebito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opDebitoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(btnImovel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConcluir)
                .addGap(101, 101, 101))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(lblExiste)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoResidencial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(campoCelular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(campoEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(campoSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(campoLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(campoNome, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)))
                            .addComponent(pnlDebito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(opEmail))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(opDebito)))
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
                    .addComponent(campoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblExiste))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opDebito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDebito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImovel)
                    .addComponent(btnConcluir))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    private class PainelListener implements ItemListener{
        @Override
        public void itemStateChanged(ItemEvent ie) {
            if (opDebito.isSelected()){
                pnlDebito.setVisible(true);
            } else if (opEmail.isSelected()){
                pnlDebito.setVisible(false);
            }
        }
    }
    
    private void campoNumContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNumContaActionPerformed
        
    }//GEN-LAST:event_campoNumContaActionPerformed

    private void btnImovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImovelActionPerformed
        Cliente user = Cliente.iniciar();
        this.btnImovel.addActionListener(new JanelaListener());
    }//GEN-LAST:event_btnImovelActionPerformed

    private void btnConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluirActionPerformed
        this.realizaCadastro();
    }//GEN-LAST:event_btnConcluirActionPerformed
    
    private void opDebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opDebitoActionPerformed
        
    }//GEN-LAST:event_opDebitoActionPerformed
    
    
    private void realizaCadastro(){
        boolean rodou = true;
        String nome = this.campoNome.getText();
        String senha = this.campoSenha.getText();
        String email = this.campoEmail.getText();
        String login = this.campoLogin.getText();
        String telResidencialtxt = this.campoResidencial.getText();
        String telCelulartxt = this.campoCelular.getText();
        String codBancotxt = this.campoCodBanco.getText();
        String numContatxt = this.campoNumConta.getText();       
                
        int telResidencial = this.controller.validaNumeros(telResidencialtxt);
        if (telResidencial == -999){
            this.exibeMensagemErro("Erro!! Caractere inválido no telefone residencial.");
            this.limparCampo("telResidencial");
            rodou = false;
        }
        int telCelular = this.controller.validaNumeros(telCelulartxt);
        if (telCelular == -999){
            this.exibeMensagemErro("Erro!! Caractere inválido no telefone celular.");
            this.limparCampo("telCelular");
            rodou = false;
        }
        ContaBancaria cb = new ContaBancaria();
        if (this.opDebito.isSelected()){
            int codBanco = this.controller.validaNumeros(codBancotxt);
            if (codBanco == -999){
                this.exibeMensagemErro("Erro!! Caractere inválido no código do banco.");
                this.limparCampo("codBanco");
                rodou = false;
            }
            int numConta = this.controller.validaNumeros(numContatxt);
            if (numConta == -999){
                this.exibeMensagemErro("Erro!! Caractere inválido no número da conta.");
                this.limparCampo("numConta");
                rodou = false;
            }
            cb.setCodBanco(codBanco);
            cb.setNumConta(numConta);
        }            
        
        if (this.controller.verificaLogin(login)){
            this.exibeMensagem("Erro!! O login inserido já existe.");
            rodou = false;
            this.limparCampo("login");
        }
        
        Cliente user = Cliente.iniciar();
        user.setNome(nome);
        user.setTelCelular(telCelular);
        user.setTelResidencial(telResidencial);
        user.setEmail(email);
        user.setLogin(new Login(login, senha));
        user.setContaBancaria(cb);
        
        if (this.opEmail.isSelected() && rodou){
            this.exibeMensagem("Segunda via será enviada por E-mail");
        }
        
        if (rodou){
            this.controller.validaCadastro(user);
            Cliente.fechar();
            this.exibeMensagem("Cadastro realizado com sucesso");
            this.dispose();
        }
    }
    private void exibeMensagem(String mensagem){
        JOptionPane.showMessageDialog(this, mensagem, "Notificação", JOptionPane.INFORMATION_MESSAGE);
    }
    private void exibeMensagemErro(String mensagem){
        JOptionPane.showMessageDialog(this, mensagem, "Erro",JOptionPane.ERROR_MESSAGE);
    }
    private void limparCampo(String campo){
        if(campo.equals("numConta")){
            this.campoNumConta.setText("");
        }
        if(campo.equals("codBanco")){
            this.campoCodBanco.setText("");
        }
        if(campo.equals("telCelular")){
            this.campoCelular.setText("");
        }
        if(campo.equals("telResidencial")){
            this.campoResidencial.setText("");
        }
        if(campo.equals("login")){
            this.campoLogin.setText("");
        }
    }
    
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
                    JanelaCadastrarImovel.fechar();
                }
            });
        }
    }
    
    public static void main(String args[]) {
        
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
    private javax.swing.ButtonGroup grupoOp;
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
    private javax.swing.JLabel lblExiste;
    private javax.swing.JRadioButton opDebito;
    private javax.swing.JRadioButton opEmail;
    private javax.swing.JPanel pnlDebito;
    // End of variables declaration//GEN-END:variables
}
