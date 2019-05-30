package d2;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Biblioteca implements Ibliblioteca {

    private String nome;
    private String endereco;

    public static void main(String[] args) {
        //Usuario usuario = new Usuario();
        Publicacao publicacao = new Publicacao();
        //usuario.cadastrarUsuario();
        //System.out.println(usuario.listarUsuario());
        publicacao.cadastraPublicacao();
        System.out.println(publicacao.listarPublicacao());
        
    }

    @Override
    public void cadastrarUsuario() {
        Usuario usuario = new Usuario();
        usuario.cadastrarUsuario();
    }

    @Override
    public void cadastrarPublicacao() {
        Publicacao publicacao = new Publicacao();
        publicacao.cadastraPublicacao();
    }

    @Override
    public void cadastrarEmprestimo() {
        Emprestimo emprestimo = new Emprestimo();
        try {
            emprestimo.adicionarItem();
        } catch (ParseException ex) {
            Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void cadastrarDevolucao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void gerarCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void listarUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void listarPublicacao() {
        Publicacao publicacao = new Publicacao();
        publicacao.listarPublicacao();
    }

    @Override
    public void listarEmprestimo() {
       
    }

    @Override
    public void listarDevolucao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pesquisarPublicacao() {
//        String nomeLivro = JOptionPane.showInputDialog("Digite o titulo da publicação: ");
//        String nomeAutor = nomeLivro;
//       Publicacao publicacao = new Publicacao();
//       publicacao.pesquisarPublicacao(String nomeLivro, String... nomeAutor);
    }
}
