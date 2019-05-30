package d2;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Biblioteca implements Ibliblioteca {

    private String nome;
    private String endereco;

    Usuario usuario = new Usuario();
    Publicacao publicacao = new Publicacao();
    Emprestimo emprestimo = new Emprestimo();

    @Override
    public void cadastrarUsuario() {
        usuario.cadastrarUsuario();
    }

    @Override
    public void cadastrarPublicacao() {
        publicacao.cadastraPublicacao();
    }

    @Override
    public void cadastrarEmprestimo() {

        try {
            emprestimo.adicionarItem();
        } catch (ParseException ex) {
            Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void cadastrarDevolucao() {
        try {
            emprestimo.adicionarItem();
        } catch (ParseException ex) {
            Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void gerarCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String listarUsuario() {
        return usuario.listarUsuario();
    }

    @Override
    public String listarPublicacao() {
        return publicacao.listarPublicacao();
    }

    @Override
    public String listarEmprestimo() {
        return emprestimo.listarEmprestimo();
    }

    @Override
    public String listarDevolucao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pesquisarPublicacao() {
        String _nome = JOptionPane.showInputDialog("Digite o código da Publicação: ");
        String _nomeAutor = JOptionPane.showInputDialog("Digite o código da Publicação: ");

        publicacao.pesquisarPublicacao(_nome, _nomeAutor);
    }
}
