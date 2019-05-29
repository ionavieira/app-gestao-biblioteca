package d2;

import java.util.Date;

public class Emprestimo{
   private int codigo;
   private Date dataEmprestimo;
   private Date dataPrevDevolucao;
   private double valorMulta;

    public Emprestimo(int codigo, Date dataEmprestimo, Date dataPrevDevolucao, double valorMulta) {
        this.codigo = codigo;
        this.dataEmprestimo = dataEmprestimo;
        this.dataPrevDevolucao = dataPrevDevolucao;
        this.valorMulta = valorMulta;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataPrevDevolucao() {
        return dataPrevDevolucao;
    }

    public void setDataPrevDevolucao(Date dataPrevDevolucao) {
        this.dataPrevDevolucao = dataPrevDevolucao;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    } 
    
    public void adicionarItem() {
        
    }
    public void devolverItem(){
        
    }  
    
    public void devolverTodos(){
        
    }
    
    public void calcularValorMulta(){
        
    }
    
    public void adicionarUsuario(){
        
    }
    
    public void verificarDatas(){
        
    }
}
