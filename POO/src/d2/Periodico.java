package biblioteca;

import java.util.ArrayList;

public class Periodico {

    private int numEdicao;
    private String mes;
    private ArrayList<Periodico> periodicoAux = new ArrayList<>();

    // <editor-fold defaultstate="collapsed" desc="Métodos Getters e Setters">
    public int getNumEdicao() {
        return numEdicao;
    }

    public void setNumEdicao(int numEdicao) {
        this.numEdicao = numEdicao;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
    // </editor-fold>

    public Periodico() {
    }

    public Periodico(int numEdicao, String mes) {
        this.numEdicao = numEdicao;
        this.mes = mes;
    }

    public void cadastraPeriodico(Periodico periodico) {
        periodicoAux.add(periodico);
    }

    @Override
    public String toString() {
        return "\n ------------ Periodico ------------"
                + "\nNumero Edição: " + numEdicao
                + "\nMes: " + mes;
    }
}
