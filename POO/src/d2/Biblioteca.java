package d2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Biblioteca implements Ibliblioteca {
    private String nome;
    private String endereco;
    public int n;
    
    ArrayList<Usuario> users = new ArrayList<>();
    ArrayList<Publicacao> publicacao = new ArrayList<>(); 
    ArrayList<Emprestimo> emprestimo = new ArrayList<>(); 
    private Object formatter;

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
           
         String cpf; 
         if(users.isEmpty()){
             cpf = JOptionPane.showInputDialog("Informe o CPF");
             try {
                 insereDadosUsuario(cpf);
             } catch (ParseException ex) {
                 Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
             }
         }else{
             cpf = JOptionPane.showInputDialog("Informe o CPF");
             if(users.contains(cpf)){
                 JOptionPane.showMessageDialog(null, "Esse usuário já foi cadastrado!");
             }else{
                 try {
                     insereDadosUsuario(cpf);
                 } catch (ParseException ex) {
                     Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
                 }
             }           
         }          
    }
    
public void insereDadosUsuario(String cpf) throws ParseException{
       // int codigo = Integer.parseInt(JOptionPane.showInputDialog("Insira os dados a seguir:\nCódigo"));
        String nome_user = JOptionPane.showInputDialog("Nome: ");
        String end_user  = JOptionPane.showInputDialog("Endereço: ");
        String telefone = JOptionPane.showInputDialog("Telefone: ");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");       
        Date dataNasc = null;
        try{
             String dataAux = JOptionPane.showInputDialog("Data de Nascimento: ");
             dataNasc = formatter.parse(dataAux);
        }catch(ParseException pe){
        }
        
        Usuario user = new Usuario(users.size()+1, nome_user, cpf, end_user, telefone, dataNasc);
        users.add(user);     
        System.out.println(users.get(0));
    }

    @Override
    public void cadastrarPublicacao() { 
       int opc = Integer.parseInt(JOptionPane.showInputDialog("Qual o tipo da publicação? \n1 - Livro\n2 - Periodico"));
       String titulo = JOptionPane.showInputDialog("Titulo: ");
       String editora  = JOptionPane.showInputDialog("Editora: ");
       int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano: "));
            
       if(opc == 1){
            String autores  = JOptionPane.showInputDialog("Autores: ");
            int quantExemplar = Integer.parseInt(JOptionPane.showInputDialog("Qtde Exemplar: "));
            int quantDisponivel = Integer.parseInt(JOptionPane.showInputDialog("Qtde Disponivel: "));
            Livro livro = new Livro(publicacao.size()+1, titulo, editora, ano, autores, quantExemplar, quantDisponivel);
            publicacao.add(livro);  
       }else if(opc == 2){
            int numeroEdicao = Integer.parseInt(JOptionPane.showInputDialog("Edição: "));
            int mes = Integer.parseInt(JOptionPane.showInputDialog("Mês: "));
            Periodico periodico = new Periodico(publicacao.size()+1, titulo, editora, ano, numeroEdicao, mes);
            publicacao.add(periodico);  
       }
      
    }

    @Override
    public void cadastrarEmprestimo() {
       
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
        users.stream().forEach((Usuario _item) -> {
           JOptionPane.showMessageDialog(null, users);
        });
    }

    @Override
    public void listarPublicacao() {
         publicacao.stream().forEach((Publicacao _item) -> {
           JOptionPane.showMessageDialog(null, publicacao);
        });
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
        
    }



    
}
