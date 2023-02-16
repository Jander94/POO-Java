package aula8;

public class Livro implements Publicacao{
    
//    Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
//    Métodos
    public void detalhes(){
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Aberto: " + this.isAberto());
        System.out.println("Leitor: " + this.getLeitor().getNome());
        if(isAberto()){
            System.out.println("Página " + this.getPagAtual() + " de " + 
                    this.getTotPaginas());
        }
    }
    
    /**
     *
     */
    @Override
    public void abrir() {
        this.setAberto(true);
    }
    
    @Override
    public void fechar(){
        this.setAberto(false);
    }
    
    @Override
    public void folhear(int p){
        this.setPagAtual(p);
    }
    
    @Override
    public void avancarPag() {
        this.setPagAtual(this.getPagAtual() + 1);
    }
    
    @Override
    public void voltarPag(){
        this.setPagAtual(this.getPagAtual() - 1);
    }
    
//    Construtor
    
    
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor){
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    
    
//    Métodos especiais

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
}
