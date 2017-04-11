package lutas;

public class Lutador {
    
    //ATRIBUTOS   
    private String nome;
    private String nacionalidade;
    private int    idade;
    private float  altura;
    private float  peso;
    private String categoria;
    private int    vitoria;
    private int    derrotas;
    private int    empates;
    
    
    //METODOS 
    
    public void apresentar(){
        
        System.out.println("------------------------------------------");
        System.out.println("CHEGOU A HORA !! Apresentamos o lutador "+ this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("com " + this.getIdade() + " anos e " + this.getAltura() + "m" );
        System.out.println("pesando " + this.getPeso() + " Kg");
        System.out.println(this.getVitoria() + " vitorias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
    }
    
    public void status(){
        
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitoria() + " vezes");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes");
        System.out.println("Empatou " + this.getEmpates() + " vezes");
    }
    
    public void ganharLuta(){
         
        this.setVitoria(this.getVitoria() + 1);
        
    }
    
    public void perderLuta(){
        
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public void empatarLuta(){
        
        this.setEmpates(this.getEmpates() + 1);
    }
    
    //METODOS ESPECIAIS
    
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitoria, int derrotas, int empates){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitoria = vitoria;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String no){
        
        this.nome = no;
    }
    
    public String getNacionalidade(){
        
        return nacionalidade;
    }
    
    public void setNacionalidade(String na){
        
        this.nacionalidade = na;
    }
    
    public int getIdade(){
        
        return this.idade;
    }
    
    public void setIdade(int id){
        
        this.idade = id;
    }
    
    public float getAltura(){
        
        return this.altura;
    }
    
    public void setAltura(float al){
        
        this.altura = al;
    }
    
    public float getPeso(){
        
        return this.peso;
    }
    
    public void setPeso(float pe){
        
        this.peso = pe;
        
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        
        if(this.getPeso() < 52.2f){
            
            this.categoria = "Inválido";
        }else if(this.getPeso() <= 70.3f ){
            
            this.categoria = "Leve";
        }else if (this.getPeso() <= 83.9f){
            
            this.categoria = "Médio";
        }else if (this.getPeso() <= 120.2){
            
            this.categoria = "Pesado";
        }else{
            
            this.categoria = "Inválido";
        }
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
}
