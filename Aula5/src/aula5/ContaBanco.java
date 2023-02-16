package aula5;

public class ContaBanco {
    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    // Métodos Personalizados
    public void extrato(){
        System.out.println("-------------------------------------");
        System.out.println("Numero da conta: " + this.getNumConta());
        System.out.println("Tipo de conta: " + this.getTipo());
        System.out.println("Titular da conta: " + this.getDono());
        System.out.println("Saldo: R$"+this.getSaldo());
        System.out.println("Status da conta: " + this.isStatus());
    }
    
    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if("CC".equals(tipo)){
            this.setSaldo(50);
        }else if("CP".equals(tipo)){
            this.setSaldo(150);
        }
    }
    
    public String fecharConta(){
        if(0 == this.getSaldo()){
            this.setTipo(null);
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso."); 
        }else if (this.saldo > 0){
            System.out.println("A conta precisa estar vazia para ser encerrada.");
        }else{
            System.out.println("A conta está em débito. Não foi possível fechá-la.");
        }
        return null;
        
    }
    
    public void depositar(float valor){
        if(this.isStatus()){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Deposito realizado com sucesso! \nFavorecido: " + this.getDono());
        }else{
            System.out.println("Erro ao depositar..");
        }
        
    }
    
    public void sacar(float valor){
        if(this.isStatus() && this.getSaldo() >= valor){
            this.setSaldo(this.getSaldo() - valor);
        }
        else{
            System.out.println("Saldo insuficiente, ou conta inativa.");
        }
    }
    
    public void pagarMensal(){
        int v;
        if("CC".equals(this.getTipo())){
            v = 12;
        }else{
            v = 20;
        }
        if(this.isStatus() && this.saldo >= v){
            this.sacar(v);
        }else{
            System.out.println("Não foi possível pagar a mensalidade.");
        }
    }
     
    // Métodos Especiais

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }
    
        
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
}   


    