package CodFelipe;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Main implements Integracao{

    @Override
    public ArrayList<String> getNomeIntegrante() {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Filipe Augusto Parreira Almeida");
        nomes.add("João Pedro Cavani Meireles");
        return nomes;
    }

    @Override
    public void iniciar() {
        JanelaPrincipal janelaPrincipal = new JanelaPrincipal();
        janelaPrincipal.setVisible(true);
    }

    @Override
    public String getDescricaoProjeto() {
        return "Software tem como intuito tornar a vida do cliente mais simples, "
                + "fornecendo serviços de autoantendimento sem que tenha a necessidade de que "
                + "o cliente se desloque para uma agêencia local.";
    }

    @Override
    public String getHoraSistema() {
        LocalTime hora = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String horaFormatada = hora.format(formatter);
        return horaFormatada;
    }

    @Override
    public ArrayList<String> getClasses() {
        ArrayList<String> classes = new ArrayList<>();
        classes.add("Cliente");
        classes.add("ContaBancaria");
        classes.add("Controller");
        classes.add("Funcionario");
        classes.add("IUsuario");
        classes.add("Imovel");
        classes.add("Login");
        classes.add("Solicitação");
        return classes;
    }
}
