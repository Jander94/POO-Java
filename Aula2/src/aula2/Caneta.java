
package aula2;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Modelo: " + this.modelo);  
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga + "%");
        System.out.println("Esta tampada: " + this.tampada);
    };
    
    void rabiscar(){
        if(this.tampada){
            System.out.println("Destampe a caneta primeiro...");
        }else{
            System.out.println("Rabiscando...");
        }
    };
    
    void tampar(){
        this.tampada = true;
    };
    
    void destampar(){
        this.tampada = false;
    }
}
