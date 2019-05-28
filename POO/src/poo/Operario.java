package poo;

public class Operario extends Empregado{
    private double valorProducao;
    private double comissao;

    public Operario(double valorProducao, double comissao, String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    public double calcularS(){
        return calcularSalario() * (1 + this.comissao/100);
    }
    
    @Override
    public double obterSaldo(){
        return this.salarioBase * (1 - this.imposto/100) + valorProducao + comissao;
    }
}
