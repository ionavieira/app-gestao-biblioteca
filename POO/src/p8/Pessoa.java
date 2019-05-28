package p8;

public abstract class Pessoa implements InterfaceConsultorio {
    private String nome;
    private int id;
    String cpf;
    private int telefone;
    private String endereco;

    public Pessoa(String nome, int id, String cpf, int telefone, String endereco) {
        this.nome = nome;
        this.id = id;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf.matches("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}") || cpf.matches("[0-9]{11}")){
            this.cpf = cpf;
            System.out.println("Nao é um documento valido");
        }
    }

public int getTelefone() {
    return telefone;
}

public void setTelefone(int telefone) {
    this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }   
    
    public abstract void verificarDocumento();
}
