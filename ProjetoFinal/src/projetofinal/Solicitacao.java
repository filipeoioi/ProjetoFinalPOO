package projetofinal;

public class Solicitacao {
    private int id;
    private String descricao;
    private String idCliente;
    
    public Solicitacao(String descricao,String nomeCliente, int idSolicitacao){
        this.descricao = descricao;
        this.id = idSolicitacao;
        this.idCliente = nomeCliente;
    }

    public int getId() {
        return id;
    }

    
    public String getDescricao() {
        return descricao;
    }

    public String getIdCliente() {
        return idCliente;
    }
        
}
