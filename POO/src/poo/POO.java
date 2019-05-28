/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author IonaVieiraFranco
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Empregado: ");
        Empregado emp1 = new Empregado("Iona","Rua Principal", "31-939219293", 12, 15000, 10);
        System.out.println(emp1.obterSaldo());
        
        System.out.println("\nFornecedor: ");
        Fornecedor forn1 = new Fornecedor("Consultoria", "Rua 2","31-312234223", 180000, 12000 );
        System.out.println(forn1.obterSaldo());
        
        System.out.println("\nAdministrador: ");
        Adminstrador admin1 = new Adminstrador(300,"Consultoria", "Rua 2","31-312234223", 12, 15000, 10);
        System.out.println(admin1.obterSaldo());
        
        System.out.println("\nOperario: ");
        Operario op1 = new Operario(200, 15, "Consultoria", "Rua 2","31-312234223", 12, 15000, 10);
        System.out.println(op1.obterSaldo());
        
        System.out.println("\nOperario: ");
        Vendedor vend1 = new Vendedor("Consultoria", "Rua 2","31-312234223", 12, 15000, 10, 200, 15);
        System.out.println(vend1.obterSaldo());
    }
    
}
