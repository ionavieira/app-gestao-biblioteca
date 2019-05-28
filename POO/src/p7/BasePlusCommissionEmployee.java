package p7;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double salarioBase;

    public BasePlusCommissionEmployee(String firstname, String lastaname, String cpf, String id, double salario, double vendasBrutas, double comissao, double salarioBase) {
        super(firstname, lastaname, cpf, id, salario, vendasBrutas, comissao);
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }


    @Override
    public double calcularPagamento(){
        setSalario(getSalario() + salarioBase);
        return getSalario();
    }   
    
}
