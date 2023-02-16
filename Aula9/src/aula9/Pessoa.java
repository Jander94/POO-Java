/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula9;

/**
 *
 * @author jander
 */
public class Pessoa {
    
//    Atributos
    private String nome;
    private int idade;
    private String sexo;
    
//    Métodos
    public void fazerAniversario(){
        this.setIdade(this.getIdade() + 1);
    }
    

    public String status() {
        return "nome: " + nome + ", \n"
                + "idade: " + idade + ", \n"
                + "sexo: " + sexo;
    }
    
//    Métodos especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
}
