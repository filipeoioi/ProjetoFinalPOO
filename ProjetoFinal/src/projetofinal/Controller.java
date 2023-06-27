package projetofinal;

public class Controller {
    private Model model;
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
            System.out.println(e.getMessage());
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
}
