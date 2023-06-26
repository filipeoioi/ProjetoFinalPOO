package projetofinal;

public class ContaBancaria{
    
    private int numConta;
    private String nomeTitular;
    private int codBanco;
    
    public ContaBancaria(){
        this.numConta = 0;
        this.nomeTitular = "";
        this.codBanco = 0;
    }
    public ContaBancaria(String nomeTitular, int numConta, int codBanco){
        this.numConta = numConta;
        this.nomeTitular = nomeTitular;
        this.codBanco = codBanco;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getCodBanco() {
        return codBanco;
    }

    public void setCodBanco(int codBanco) {
        this.codBanco = codBanco;
    }
    
}
