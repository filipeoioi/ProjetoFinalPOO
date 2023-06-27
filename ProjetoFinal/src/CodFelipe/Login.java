package CodFelipe;

public class Login {
    private String idUser;
    private String senha;

    public Login(String idUser, String senha) {
        this.idUser = idUser;
        this.senha = senha;
    }    

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
