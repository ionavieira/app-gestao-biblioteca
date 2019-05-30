package biblioteca;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Usuario {

    private int codigo;
    private String nome;
    private long cpf;
    private String endereco;
    private String telefone;
    private Date dataNasc;

    private ArrayList<Usuario> usuarioAux = new ArrayList<>();

    //Construtor para Instância Inicial
    public Usuario() {
    }

    public Usuario(int codigo, String nome, long cpf, String endereco, String telefone, Date dataNasc) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
    }

    // <editor-fold defaultstate="collapsed" desc="Métodos Getters e Setters">
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }
// </editor-fold>

    //Método para Cadastro de Usuário
    public void cadastrarUsuario() {
        int indicadorCadastro = 0; // Se 1 - Já cadastrado

        if (usuarioAux.isEmpty()) {
            this.cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite o CPF do usuário: "));
            try {
                insereDadosUsuario(getCpf());
            } catch (ParseException ex) {
                Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            this.cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite o CPF do usuário: "));
            for (int i = 0; i <= usuarioAux.size(); i++) {
                if (usuarioAux.get(i).getCpf() == this.cpf) {
                    indicadorCadastro = 1;
                }
            }
            if (indicadorCadastro == 1) {
                JOptionPane.showMessageDialog(null, "Esse usuário já foi cadastrado!");
            } else {
                try {
                    insereDadosUsuario(this.cpf);
                } catch (ParseException ex) {
                    Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    //Método para Listar os Usuários
    public String listarUsuario() {
        String _listUser = "Não existem usuários cadastrados";
        if (!usuarioAux.isEmpty()) {
            try {
                for (int i = 0; i < usuarioAux.size(); i++) {
                    _listUser = "Usuario [" + i + "]: " + usuarioAux.get(i).toString();
                }
            } catch (Exception ex) {
                return "Opa, algo deu errado !";
            }
        }
        return _listUser;
    }

    //Método auxiliar para cadastro de usuários 
    public void insereDadosUsuario(long pCpf) throws ParseException {
        String _nome = JOptionPane.showInputDialog("Nome: ");
        String _endereco = JOptionPane.showInputDialog("Endereço: ");
        String _telefone = JOptionPane.showInputDialog("Telefone: ");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        formatter.setLenient(false);
        Date _dataNasc = formatter.parse(JOptionPane.showInputDialog("Data de Nascimento: "));

        Usuario newUser = new Usuario(gerarCodigo(), _nome, pCpf, _endereco, _telefone, _dataNasc);
        usuarioAux.add(newUser);
    }

    public int gerarCodigo() {
        int random = 1 + (int) (Math.random() * 100);
        return random;
    }

    @Override
    public String toString() {
        return "\n ------------ Usuario ------------" + "\nCodigo: " + getCodigo()
                + "\nNome: " + getNome()
                + "\nCpf: " + getCpf()
                + "\nEndereco: " + getEndereco()
                + "\nTelefone: " + getTelefone()
                + "\nData Nascimento: " + getDataNasc() + '\n';
    }
}
