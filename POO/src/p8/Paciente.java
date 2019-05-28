package p8;

public class Paciente extends Pessoa{
    private String convenio; 
    private double valorPagar;

    public Paciente(String nome, int id, String cpf, int telefone, String endereco, String convenio, double valorPagar) {
        super(nome, id, cpf, telefone, endereco);
        this.convenio = convenio;
        this.valorPagar = valorPagar;
    }    

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }

    @Override
    public void verificarDocumento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void consulta(int cpf) {
        
    }

    @Override
    public void insere() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void altera() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calcularValores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    }

   