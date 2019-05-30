package biblioteca;

import java.util.Date;

public class ItemEmprestimo {

    private Date dataDevolucao;

    public ItemEmprestimo(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    // <editor-fold defaultstate="collapsed" desc="Métodos Getters e Setters">
    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    // </editor-fold>

    public void atualizarDevolucao() {

    }
}
