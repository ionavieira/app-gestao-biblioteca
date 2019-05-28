package p8;

import java.util.*;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        String nome, endereco, cpf, crm, especialidade, convenio;
        int telefone, id;

        try {
            
            int qtdMedico = Integer.parseInt(JOptionPane.showInputDialog("Quantos medicos deseja criar? "));
            Medico med[] = new Medico[qtdMedico];

           
                for (int i = 0; i < qtdMedico; i++) {
                    JOptionPane.showMessageDialog(null, "Medico " + i+1);
                    nome = JOptionPane.showInputDialog("Informe o nome do médico: ");
                    id = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID "));
                    cpf = JOptionPane.showInputDialog("Informe CPF: ");
                    crm = JOptionPane.showInputDialog("Informe o CRM do médico: ");
                    especialidade = JOptionPane.showInputDialog("Informe a especialidade: ");
                    endereco = JOptionPane.showInputDialog("Qual o endereço: ");
                    telefone = Integer.parseInt(JOptionPane.showInputDialog("Qual é o telefone? "));
                    med[i] = new Medico(nome, id, cpf, telefone, endereco, crm, especialidade);
                    med[i].verificarDocumento();

                }
            

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Informe somente numeros");
        }

    }
}
