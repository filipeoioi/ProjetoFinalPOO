package projetofinal;

public class Solicitacao {
    private int idSolicitacao;
    private String descricao;
    private String nomeCliente;
    
    public Solicitacao(String descricao,String nomeCliente, int idSolicitação){
        this.descricao = descricao;
        this.idSolicitacao = idSolicitacao;
        this.nomeCliente = nomeCliente;
    }

    public int getIdSolicitacao() {
        return idSolicitacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }
        
}
