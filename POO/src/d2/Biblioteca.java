package d2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class Biblioteca implements Ibliblioteca {
    private String nome;
    private String endereco;

    public Biblioteca(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }  
    

    @Override
    public void cadastrarUsuario() {
         ArrayList<Usuario> users = new ArrayList<Usuario>();   
         String cpf; 
         if(users.isEmpty()){
             cpf = JOptionPane.showInputDialog("Informe o CPF");
             insereDadosUsuario(users, cpf);
         }else{
             cpf = JOptionPane.showInputDialog("Informe o CPF");
             if(users.contains(cpf)){
                 JOptionPane.showMessageDialog(null, "Esse usuário já foi cadastrado!");
             }else{
                 insereDadosUsuario(users,cpf);
             }           
         }          
    }
    
    private void insereDadosUsuario(ArrayList<Usuario> users, String cpf){
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Insira os dados a seguir:\nCódigo"));
        String nome = JOptionPane.showInputDialog("Nome: ");
        String endereco  = JOptionPane.showInputDialog("Endereço: ");
        String telefone = JOptionPane.showInputDialog("Telefone: ");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");       
        Date dataNasc = null;
        try{
             String dataAux = JOptionPane.showInputDialog("Data de Nascimento: ");
             dataNasc = formatter.parse(dataAux);
        }catch(ParseException pe){
            pe.printStackTrace();
        }    
        Usuario user = new Usuario(codigo, nome, cpf, endereco, telefone, dataNasc);
        users.add(user);           
    }

    @Override
    public void cadastrarPublicacao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cadastrarEmprestico() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void listarEmprestimo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void listarDevolucao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pesquisarPublicacao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
