package d2;

import java.util.Date;

public class ItemEmprestimo {
    private Date dataDevolucao;

    public ItemEmprestimo(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    } 
    
    
}
