/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula10;

/**
 *
 * @author jander
 */
public class Aula10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//      Pessoa p1 = new Pessoa();
        Aluno v1 = new Aluno();
        v1.setNome("Jander");
        v1.setIdade(28);
//        v1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Luiz");
        b1.setIdade(32);
        b1.pagarMensalidade();
        
        System.out.println(b1.toString());
    }
    
}
