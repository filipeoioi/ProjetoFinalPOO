
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
    
}
