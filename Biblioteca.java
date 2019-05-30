package biblioteca;

public class Biblioteca {

    private String nome;
    private String endereco;

    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        Publicacao publicacao = new Publicacao();
        
        //usuario.cadastrarUsuario();
        //System.out.println(usuario.listarUsuario());
        publicacao.cadastraPublicacao();
        System.out.println(publicacao.listarPublicacao());
        
    }
}
