package p7;


public abstract class Employee {
    private String firstname;
    private String lastaname;
    private String cpf;
    private String id;
    private double salario;

    public Employee(String firstname, String lastaname, String cpf, String id, double salario) {
        this.firstname = firstname;
        this.lastaname = lastaname;
        this.cpf = cpf;
        this.id = id;
        this.salario = 0;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }    
    
    public abstract double calcularPagamento();
}
