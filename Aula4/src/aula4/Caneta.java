package aula4;
public class Caneta {
    
    private String modelo;
    
    private float ponta;
    
    private boolean tampada;
    
    public String cor;
    
    public Caneta(String m, String c, float p){
        this.tampar();
        this.cor = c;
        this.setModelo(m);
        this.setPonta(p);
    }
    
    public void status(){
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    
}
