package p7;

import poo.Adminstrador;
import poo.Empregado;
import poo.Fornecedor;
import poo.Operario;
import poo.Vendedor;

public class Principal {
     public static void main(String[] args) {
        System.out.println("Empregado: Comissionado ");
        CommissionEmployee emp1 = new CommissionEmployee("Iona","Vieira", "111.111.111.-00","0002", 0, 15000, 10);
        System.out.println(emp1.calcularPagamento());
        
     
    }
}
