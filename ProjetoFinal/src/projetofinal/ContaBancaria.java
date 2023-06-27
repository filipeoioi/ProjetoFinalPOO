package projetofinal;

public class ContaBancaria{
    
    private int numConta;
    private int codBanco;
    
    public ContaBancaria(){
        this.numConta = 0;
        this.codBanco = 0;
    }
    public ContaBancaria(int numConta, int codBanco){
        this.numConta = numConta;
        this.codBanco = codBanco;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getCodBanco() {
        return codBanco;
    }

    public void setCodBanco(int codBanco) {
        this.codBanco = codBanco;
    }
    
}
