public class Flareon extends Eevee{


    private String tipo = "Fogo";
    private int altura = 95;
    private int saude = 75 ;
    private double peso = 24;

    public Flareon(String tipo, int altura, int saude, double peso) {
        super(tipo, altura, saude, peso);
        this.tipo = "Fogo";
        this.altura = 95;
        this.saude = 75;
        this.peso = 24;
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
        return "Fire Blitz";
    }

    @Override
    public String defesa(){
        return "Protect";
    }

    @Override
    public String especial(){
        return "Flamethrower";
    }

    public void imprimirFlareon(){
       
        System.out.println("Olá, eu sou Flareon");
        System.out.println("Tipo: "+ tipo);
        System.out.println("altura: "+ altura);
        System.out.println("Saúde: "+ saude);
        System.out.println("Peso: "+ peso);
        System.out.println("Ataque: " + ataque());
        System.out.println("Defesa: " + defesa());
        System.out.println("Especial: " + especial());

    }
    

   
    
}
