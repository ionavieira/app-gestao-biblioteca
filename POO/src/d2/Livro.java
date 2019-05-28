package d2;

public class Livro extends Publicacao {
    private String autores;
    private int quantExemplar;
    private int quantDisponivel;

    /**
     *
     * @param codigo
     * @param titulo
     * @param editora
     * @param ano
     * @param autores
     * @param quantExemplar
     * @param quantDisponivel
     */
    public Livro(int codigo, String titulo, String editora, int ano, String autores, int quantExemplar, int quantDisponivel) {
        super(codigo, titulo, editora, ano);
        this.autores = autores;
        this.quantExemplar = quantExemplar;
        this.quantDisponivel = quantDisponivel;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public int getQuantExemplar() {
        return quantExemplar;
    }

    public void setQuantExemplar(int quantExemplar) {
        this.quantExemplar = quantExemplar;
    }

    public int getQuantDisponivel() {
        return quantDisponivel;
    }

    public void setQuantDisponivel(int quantDisponivel) {
        this.quantDisponivel = quantDisponivel;
    }
    
    
}
