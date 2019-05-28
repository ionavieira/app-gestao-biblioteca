package p8;
import java.util.*;
import javax.swing.JOptionPane;


public class Medico extends Pessoa {
    private String crm;
    private String especialidade;
    private double valorReceber;

    public Medico(String nome, int id, String cpf, int telefone, String endereco, String crm, String especialidade) {
        super(nome, id, cpf, telefone, endereco);
        this.crm = crm;
        this.especialidade = especialidade;
    }
    
    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
       this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    @Override
    public void verificarDocumento(){
        if(this.crm.matches("([0-9]{3}[0-9]+/[A-z]{2})")){
           JOptionPane.showMessageDialog(null,"O documento é valido"+ crm);            
        }
        else {
            JOptionPane.showMessageDialog(null,"O documento é invalido"+crm);
        }
    }

 

    @Override
    public double calcularValores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void consulta(int cpf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insere() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void altera() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
}
