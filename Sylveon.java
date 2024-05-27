public class Sylveon extends Eevee{

    private String tipo = "Fada";
    private int altura = 100;
    private int saude = 95;
    private double peso = 23.5 ;
    
    

    public Sylveon(String tipo, int altura, int saude, double peso) {
        super(tipo, altura, saude, peso);
        tipo = "Fada";
        altura = 100;
        saude = 95;
        peso = 23.5;
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
        return "Round";
    }

    @Override
    public String defesa(){
        return "Reflect";
       
    }

    @Override
    public String especial(){
        return "Hyper Beam";
    }

   public void imprimirSylveon(){

  
    System.out.println("Olá, eu sou Sylveon");
    System.out.println("Tipo: "+ tipo);
        System.out.println("altura: "+ altura);
        System.out.println("Saúde: "+ saude);
        System.out.println("Peso: "+ peso);
    System.out.println("Ataque: " + ataque());
    System.out.println("Defesa: " + defesa());
    System.out.println("Especial: " + especial());

   }

    
}

