package projetofinal;

public class Funcionario implements iUsuario{
    
    private String nome;
    private Login login;

    public Funcionario(String nome) {
        this.nome = nome;
    }
    
    @Override
    public Login getLogin() {
        return this.login;
    }

    @Override
    public void setLogin(Login login) {
        this.login = login;
    }

    @Override
    public String getTipo() {
        return this.getClass().getSimpleName();
    }  
}
