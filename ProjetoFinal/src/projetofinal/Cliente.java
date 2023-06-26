package projetofinal;

import java.util.ArrayList;

public class Cliente implements IUsuario {
    
    private String nome;
    private ArrayList<Imovel> imoveis;
    private Login login;
    private String email;
    private int telefoneResidencial;
    private int telefoneCelular;
    private ContaBancaria contaBancaria;
    
    public Cliente(String nome, String email, int telResidencial, int telCelular){
        this.nome = nome;
        this.email = email;
        this.telefoneResidencial = telResidencial;
        this.telefoneCelular = telCelular;
        this.imoveis = new ArrayList<>();
        this.contaBancaria = new ContaBancaria();
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
    public int getTelCelular(){
        return this.telefoneCelular;
    }
    public String getEmail(){
        return this.email;
    }
    public void addImovel(Imovel imovel){
        this.imoveis.add(imovel);
    }
    public ArrayList<Imovel> getImoveis(){
        return this.imoveis;
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
