
package projetofinal;

import java.util.ArrayList;


public class Cliente implements iUsuario {
    
    private ArrayList<Imovel> Imoveis;
    private Login login;
    private String email;
    private String telefoneResidencial;
    private String telefoneCelular;
    private int tipo;

    public Cliente(int Login, String email, String telefoneResidencial, String telefoneCelular,String senha) {
        this.login = new Login(Login,senha);
        this.email = email;
        this.telefoneResidencial = telefoneResidencial;
        this.telefoneCelular = telefoneCelular;
    }

  
    

    @Override
    public Login setLogin() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getTipo() {
   
    return tipo;
    }

    public ArrayList<Imovel> getImoveis() {
        return Imoveis;
    }

    public void setImoveis(ArrayList<Imovel> Imoveis) {
        this.Imoveis = Imoveis;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefoneResidencial() {
        return telefoneResidencial;
    }

    public void setTelefoneResidencial(String telefoneResidencial) {
        this.telefoneResidencial = telefoneResidencial;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }


    @Override
    public Login getLogin() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setTipo(int tipo) {
        this.tipo=tipo;
    }

   
    
    
    
    
}
