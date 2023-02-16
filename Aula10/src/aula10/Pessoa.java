/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10;

/**
 *
 * @author jander
 */
public abstract class Pessoa {
//    Atributos
    private String nome;
    private int idade;
    private String sexo;
    
//    Métodos
    
    public void fazerAniversario(){
     this.idade ++;
    }

    @Override
    public String toString() {
        return "nome: " + nome + 
                "\nidade: " + idade + 
                "\nsexo:" + sexo ;
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
