
package aula9;

public class Aula9 {

    public static void main(String[] args) {
        
        Pessoa n1 = new Pessoa();
        Aluno a1 = new Aluno();
        
        n1.setNome("Jander");
        n1.setIdade(28);
        n1.setSexo("Masculino");
        System.out.println(n1.status());
        
        a1.setNome("Almir");
        a1.setIdade(32);
        
        System.out.println(a1.status());
        
      
    }
    
}
