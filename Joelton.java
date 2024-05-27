public class Joelton extends Eevee {

    private String tipo;
    private int altura;
    private int saude;
    private double peso; 

  

   

    public Joelton(String tipo, int altura, int saude, double peso) {
        super(tipo, altura, saude, peso);
        this.tipo = "Eletrecidade";
        this.altura = 120;
        this.saude = 80 ;
        this.peso = 25.00 ;
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
    public String ataque() {
        return "Trovoada - Thunder-Shock";
    }

    @Override
    public String defesa() { 
        return "Carga - Wild Charge";
    }

    @Override
    public String especial() { 
        return "Raio - Thunder";
    } 

    public void imprimirJoelton(){
       
      
        System.out.println("Olá, eu sou Joelton");
        System.out.println("Tipo: "+ tipo);
        System.out.println("altura: "+ altura);
        System.out.println("Saúde: "+ saude);
        System.out.println("Peso: "+ peso);
        System.out.println("Ataque: " + ataque());
        System.out.println("Defesa: " + defesa());
        System.out.println("Especial: " + especial());
    }
}
