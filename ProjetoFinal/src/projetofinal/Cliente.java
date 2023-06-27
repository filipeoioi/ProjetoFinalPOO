package projetofinal;

import java.util.ArrayList;

public class Cliente implements IUsuario {
    
    private static Cliente cliente;
    private String nome;
    private ArrayList<Imovel> imoveis = new ArrayList<>();
    private Login login;
    private String email;
    private int telefoneResidencial;
    private int telefoneCelular;
    private ContaBancaria contaBancaria = new ContaBancaria();
    
    public static Cliente iniciar(){
        if (cliente == null)
            cliente = new Cliente();
        return cliente;
    }
    public static void fechar(){
        cliente = null;
    }
    public static void setCliente(Cliente user){
        cliente = user;
    }
    public static Cliente getCliente(){
        return cliente;
    }
    private Cliente(){
    }
    
    public void setContaBancaria(ContaBancaria contaBancaria){
        this.contaBancaria = contaBancaria;
    }
    public ContaBancaria getContaBancaria(){
        return this.contaBancaria;
    }
    public int getTelResidencial(){
        return this.telefoneResidencial;
    }
    public void setTelResidencial(int num){
        this.telefoneResidencial = num;
    }
    public int getTelCelular(){
        return this.telefoneCelular;
    }
    public void setTelCelular(int num){
        this.telefoneCelular = num;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void addImovel(Imovel imovel){
        this.imoveis.add(imovel);
    }
    public ArrayList<Imovel> getImoveis(){
        return this.imoveis;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    @Override
    public Login getLogin() {
        return this.login;
    }

    @Override
    public void setLogin(Login login) {
        this.login = login;
    }

    
    @Override
    public String getTipo() {
        return this.getClass().getSimpleName();
    }
}
