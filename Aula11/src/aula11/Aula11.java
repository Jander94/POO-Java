/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula11;

/**
 *
 * @author jander
 */
public class Aula11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Mamifero m = new Mamifero();
       Reptil r = new Reptil();
       
       m.setPeso(35f);
       m.setCorPelo("Amarelo");
       m.locomover();
       
       r.setMembros(4);
       r.setCorEscama("Azul");       
       r.locomover();
       
       
        System.out.println(m.toString());
        System.out.println(r.toString());
    }
    
}
