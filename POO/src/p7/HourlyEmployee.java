package p7;

public class HourlyEmployee extends Employee{
    private double salarioHora;
    private double horasTrabalhadas;

    public HourlyEmployee(String firstname, String lastaname, String cpf, String id, double salario, double salarioHora, double horasTrabalhadas) {
        super(firstname, lastaname, cpf, id, salario);
        this.salarioHora = salarioHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        if(horasTrabalhadas <= 168)
            this.horasTrabalhadas = horasTrabalhadas;
        else
            this.horasTrabalhadas = 168;
    }


    @Override
     public double calcularPagamento(){
         if(horasTrabalhadas < 40)
             setSalario(horasTrabalhadas * salarioHora);
         else {
            setSalario(((horasTrabalhadas - 40) *1.5) * salarioHora); 
         }         
         return getSalario();
     }
    
}
