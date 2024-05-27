public class Glaceon extends Eevee {

    private String tipo ;
    private int altura ;
    private int saude  ;
    private double peso ;

    public Glaceon(String tipo, int altura, int saude, double peso) {
        super(tipo, altura, saude, peso);
        this.tipo = "Gelo";
        this.altura = 87;
        this.saude = 90;
        this.peso = 26;
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
    
  public void imprimirGlaceon (){
    
    System.out.println("Olá, eu sou Glaceon");
    System.out.println("Tipo: "+ tipo);
    System.out.println("altura: "+ altura);
    System.out.println("Saúde: "+ saude);
    System.out.println("Peso: "+ peso);
    System.out.println("Ataque: " + ataque());
    System.out.println("Defesa: " + defesa());
    System.out.println("Especial: " + especial());
  }
   
}