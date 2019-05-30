package biblioteca;

public interface IBiblioteca {

    public void cadastrarUsuario(); // OK

    public void cadastrarPublicacao(); // OK

    public void cadastrarEmprestimo(); // OK

    public void cadastrarDevolucao();

    public void gerarCodigo(); // OK

    public void listarUsuario(); // OK

    public void listarPublicacao(); // OK

    public void listarEmprestimo();

    public void listarDevolucao();

    public void pesquisarPublicacao(); // OK
}
