package aula5;

public class Aula5 {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(19442);
        p1.setDono("Jander");
        p1.abrirConta("CC");
        
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(19443);
        p2.setDono("Alysson");
        p2.abrirConta("CP");
        
        p1.depositar(100);
        p2.depositar(500);
        p1.sacar(150);
        
        p1.fecharConta();
        
        p1.extrato();
        p2.extrato();
    }
    
}
