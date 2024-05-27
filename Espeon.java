public class Espeon extends Eevee {
   
    private String tipo = "Psíquico";
    private int altura ;
    private int saude ;
    private double peso ;
 
    
    

    public Espeon(String tipo, int altura, int saude, double peso) {
        super(tipo, altura, saude, peso);
       this.tipo = "Psíquico";
        this.altura = 95;
        this.saude = 85;
        this.peso = 27.5;
    }
    public String getTipo() {
        return tipo;
    }
    public int getAltura() {
        return altura;
    }
    public int getSaude() {
        return saude;
    }
    public double getPeso() {
        return peso;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public void setSaude(int saude) {
        this.saude = saude;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }  
    
    @Override
    public String ataque(){
        return "Zen Headbutt";
    }
    @Override
    public String defesa(){
      return "Morning Sun ";
    }
    @Override
    public String especial(){
        return "Dazzling Gleam";
    }
   
    public void imprimirEspeon(){
       
        System.out.println("Olá, eu sou Espeon");
        System.out.println("Tipo: "+ tipo);
        System.out.println("altura: "+ altura);
        System.out.println("Saúde: "+ saude);
        System.out.println("Peso: "+ peso);
        System.out.println("Ataque: " + ataque());
        System.out.println("Defesa: " + defesa());
        System.out.println("Especial: " + especial());
    }



}