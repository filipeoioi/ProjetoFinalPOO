
package projetofinal;


public class Funcionario implements iUsuario{
    
    private String nome;
    private Login login;
    private int tipo;

    public Funcionario(String nome, int login,String senha) {
        this.nome = nome;
        this.login = new Login(login,senha);
    }
    
    

    @Override
    public Login getLogin() {
        return this.login;
    }

    @Override
    public Login setLogin() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
     public int getTipo() {
   
    return tipo;
    }
    
      @Override
    public void setTipo(int tipo) {
        this.tipo=tipo;
    }
}
