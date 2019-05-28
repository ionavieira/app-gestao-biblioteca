package d2;

public class Periodico extends Publicacao {
    private int numeroEdicao;
    private int mes;

    public Periodico(int codigo, String titulo, String editora, int ano, int numeroEdicao, int mes) {
        super(codigo, titulo, editora, ano);
        this.numeroEdicao = numeroEdicao;
        this.mes = mes;
    }

    public int getNumeroEdicao() {
        return numeroEdicao;
    }

    public void setNumeroEdicao(int numeroEdicao) {
        this.numeroEdicao = numeroEdicao;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    
    
    
}
