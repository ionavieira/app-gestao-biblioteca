package d2;

public class Principal {
    public static void main(String[] args){
        int opc = 0; 
        Biblioteca b = new Biblioteca("aaa", "nbbb"); 
        
        b.cadastrarUsuario();
        b.listarUsuario();
        
    }
}
