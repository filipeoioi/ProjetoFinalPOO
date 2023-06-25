
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
        return this.usuarios.indexOf(usuario);
       
    }
    
    public boolean confirmarlogin(Login login){
        boolean existelogin=false;
        boolean existesenha=false;
        boolean existe=false;
        
        for (iUsuario i : this.getUsuarios()) {
            if (i.getLogin().getIdUser()==login.getIdUser()) {
                existelogin=true;
            }
            if (i.getLogin().getSenha().equals(login.getSenha())) {
                existesenha=true;
            }
            
            if (existelogin && existesenha) {
                existe=true;
            }
            
        }
        
        return existe;
    }
    
}
