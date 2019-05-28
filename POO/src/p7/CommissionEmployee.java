package p7;

public class CommissionEmployee extends Employee {
    private double vendasBrutas;
    private double comissao; 

    public CommissionEmployee(String firstname, String lastaname, String cpf, String id, double salario, double vendasBrutas, double comissao) {
        super(firstname, lastaname, cpf, id, salario);
        this.vendasBrutas = vendasBrutas;
        this.comissao = comissao;
    }
    
    public double getVendasBrutas() {
        return vendasBrutas;
    }

    public void setVendasBrutas(double vendasBrutas) {
        this.vendasBrutas = vendasBrutas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
        
    @Override
    public double calcularPagamento(){
         setSalario(vendasBrutas * (1 + comissao));
         return getSalario();
    }
}
