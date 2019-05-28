package d2;

public abstract class Publicacao {
    private int codigo;
    private String titulo;
    private String editora;
    private int ano;

    public Publicacao(int codigo, String titulo, String editora, int ano) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.editora = editora;
        this.ano = ano;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
