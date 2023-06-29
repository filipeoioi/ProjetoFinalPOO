package CodFelipe;

import java.util.ArrayList;

public class Controller {
    private Model model;
    private Solicitacao solicitacao;
    private static Controller controller;
    
    public static Controller iniciar(){
        if (controller == null)
            controller = new Controller();
        return controller;
    }
    
    private Controller(){
        IUsuario funcionario = new Funcionario("Administrador");
        Login loginFuncionario = new Login("admin", "admin");
        funcionario.setLogin(loginFuncionario);
        this.model = new Model();
        this.model.addUsuario(funcionario);
    }
    public int validaNumeros(String numero){
        int num;
        try{
            num = Integer.parseInt(numero);
        }catch(NumberFormatException e){
            num = -999;
        }
        return num;
    }
    public void validaCadastro(Cliente user){
        this.model.addUsuario(user);
    }
    public boolean validaLogin(Login login){
        return this.model.confirmarlogin(login);
    }
    public boolean verificaLogin(String idUser){
        return this.model.buscaId(idUser);
    }
    public IUsuario getUsuario(int indice){
        return this.model.getUsuario(indice);
    }
    public int buscarUser(Login login){
        return this.model.buscaUser(login);
    }
    public boolean verificarImovel(ArrayList<Imovel> imoveis, Imovel imovel){
        boolean existe = false;
        for (Imovel i : imoveis){
            if (i.getRua().equals(imovel.getRua()) && 
                    i.getCEP() == imovel.getCEP() &&
                    i.getNumero() == imovel.getNumero() &&
                    i.getComplemento().equals(imovel.getComplemento())){
                existe = true;
            }
        }
        return existe;
    }
    public void validaUpdateUser(int indice, IUsuario user){
        this.model.atualizarUsuario(indice, user);
    }
    public void criarSolicitacao(String descricao, String idCliente, int numSolicitacao){
        this.solicitacao = new Solicitacao(descricao, idCliente, numSolicitacao);
        this.model.addSolicitacao(solicitacao);
    }
    public ArrayList<Solicitacao> validaViewSolicitacoes(){
        return this.model.getSolicitacoes();
    }
    public int validaBusca(int id){
        return this.model.buscaSolicitacao(id);
    }
    public Solicitacao validaViewSolicitacao(int indice){
        return this.model.getSolicitacao(indice);
    }
}
