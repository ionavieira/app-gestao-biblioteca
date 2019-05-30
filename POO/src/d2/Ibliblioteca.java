
package d2;

public interface Ibliblioteca {

    /**
     *
     */
    void cadastrarUsuario();
    void cadastrarPublicacao();
    void cadastrarEmprestimo();
    void cadastrarDevolucao();
    void gerarCodigo();
    String listarUsuario();
    String listarPublicacao();
    String listarEmprestimo();
    String listarDevolucao();
    void pesquisarPublicacao();
    
}
