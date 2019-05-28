package p7;

public class SalariedEmploye extends Employee {
    private double salarioTotal;

    public SalariedEmploye(String firstname, String lastaname, String cpf, String id, double salario, double salarioTotal) {
        super(firstname, lastaname, cpf, id, salario);
        this.salarioTotal = salarioTotal;
    }

    public double getSalarioTotal() {
        return salarioTotal;
    }

    public void setSalarioTotal(double salarioTotal) {
        this.salarioTotal = salarioTotal;
    }


    
    @Override
    public double calcularPagamento(){
        return salarioTotal;
    }   
    
}
