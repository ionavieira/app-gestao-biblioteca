package poo;

public class Adminstrador extends Empregado{
    private double ajudaCusto;

    public Adminstrador(double ajudaCusto, String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaCusto = ajudaCusto;
    }

    public double getAjudaCusto() {
        return ajudaCusto;
    }

    public void setAjudaCusto(double ajudaCusto) {
        this.ajudaCusto = ajudaCusto;
    }
    
    public double calcularS(){
        return calcularSalario() + this.ajudaCusto;
    }    
  
    @Override
    public double obterSaldo(){
        return salarioBase * (1 - imposto/100) + ajudaCusto;
    }
}
