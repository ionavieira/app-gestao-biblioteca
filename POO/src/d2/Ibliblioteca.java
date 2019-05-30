package d2;

public interface Ibliblioteca {

    public void cadastrarUsuario();

    public void cadastrarPublicacao();

    public void cadastrarEmprestimo();

    public void cadastrarDevolucao();

    public void gerarCodigo();

    public String listarUsuario();

    public String listarPublicacao();

    public String listarEmprestimo();

    public String listarDevolucao();

    public void pesquisarPublicacao();

}
