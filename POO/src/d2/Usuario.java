package d2;

import java.util.Date;

public class Usuario{
    private int codigo;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private Date dataNasc;

    public Usuario(int codigo, String nome, String cpf, String endereco, String telefone, Date dataNasc) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
    }

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
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
    
    @Override
    public String toString(){
        return "Codigo: "+getCodigo()+ "\tNome: "+getNome()+"\nCPF: "+ getCpf()+"\tData Nascimento"+getDataNasc()+ "\nEndereço: "+getEndereco()+"\tTelefone: "+getTelefone();
    }    
}
