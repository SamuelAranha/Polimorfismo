public class Vaporeon extends Eevee{
   
    private String tipo = "Água";
    private int altura = 130;
    private int saude = 130 ;
    private double peso = 30.00; 
   
    public Vaporeon(String tipo, int altura, int saude, double peso) {
        super(tipo, altura, saude, peso);
        tipo = "Água";
        altura = 130;
        saude = 130;
        peso = 30.00;
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
        return "WaterFall";
    }
    
    @Override
    public String defesa(){
      return "Aqua Ring ";
    }
    
    @Override
    public String especial(){
        return "Hydro Pump";
    } 

    public void imprimirVaporeon(){
       

        System.out.println("Olá, eu sou Vaporeon");
        System.out.println("Tipo: "+ tipo);
        System.out.println("altura: "+ altura);
        System.out.println("Saúde: "+ saude);
        System.out.println("Peso: "+ peso);
        System.out.println("Ataque: " + ataque());
        System.out.println("Defesa: " + defesa());
        System.out.println("Especial: " + especial());


        }
    }
