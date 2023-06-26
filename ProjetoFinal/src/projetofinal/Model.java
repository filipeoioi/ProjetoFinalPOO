
package projetofinal;

import java.util.ArrayList;

public class Model {
    
    private ArrayList<iUsuario> usuarios;
    private ArrayList<Solicitacao> solicitacoes;
    
    public Model(){
        this.usuarios=new ArrayList<>();
        this.solicitacoes=new ArrayList<>();
    }
    
    public void addUsuario(iUsuario usuario){
        if (usuario instanceof Cliente) {
            System.out.println("Adicionando Cliente");
            usuario.setTipo(1);
            
        }else if(usuario instanceof Funcionario){
            System.out.println("Adicionando Funcionario");
            usuario.setTipo(2);
        }
        
        this.usuarios.add(usuario);
    }
    public void addSolicitacao(Solicitacao solicitacao){
        this.solicitacoes.add(solicitacao);
    }

    public ArrayList<iUsuario> getUsuarios() {
        return usuarios;
    }

    public ArrayList<Solicitacao> getSolicitacoes() {
        return solicitacoes;
    }
    
    public int buscar(iUsuario usuario){
        if (usuario.getTipo() ==1) {
            System.out.println("Cliente nº "+ this.usuarios.indexOf(usuario));
            return this.usuarios.indexOf(usuario);
            
        }else{
            System.out.println("Funcionario nº:"+this.usuarios.indexOf(usuario) );
            return this.usuarios.indexOf(usuario);
        }
        
        
       
    }
    
    public int confirmarlogin(Login login){
        
        int existe=-100;
        int h=0;
        for (iUsuario i : this.getUsuarios()) {
            
            if (i.getLogin().getIdUser()==login.getIdUser() && i.getLogin().getSenha().equals(login.getSenha())) {
                existe=h;
            }
           
            h++;
        }
        
        return existe;
    }
 
    
  
    
    
    
}
