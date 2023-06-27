package projetofinal;

import java.util.ArrayList;

public interface Integracao {
    public abstract ArrayList<String> getNomeIntegrante();
    public abstract void iniciar();
    public abstract String getDescricaoProjeto();
    public abstract String getHoraSistema();
    public abstract ArrayList<String> getClasses();
}
