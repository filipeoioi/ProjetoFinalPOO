
package projetofinal;


public class ContaBancaria extends Cliente{
    
    private int numConta;
    private String nomeTitular;
    private int codBanco;

    public ContaBancaria(int login, String senha, String email, String telefoneResidencial, String telefoneCelular) {
        super(login, senha, email, telefoneResidencial, telefoneCelular);
    }
    
    
}
