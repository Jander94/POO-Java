package aula8;


public class Aula8 {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Jander", 28, "Masculino");
        p[1] = new Pessoa("Alysson", 32, "Masculino");
        
        l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
        l[1] = new Livro("Algoritmos", "Pedro Paulo", 250, p[1]);
        l[2] = new Livro("POO", "Guanabara", 190,p[0]);
        
        l[1].detalhes();
    }
    
}
