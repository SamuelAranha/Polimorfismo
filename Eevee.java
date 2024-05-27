public class Eevee {
    private String tipo ;
    private int altura ;
    private int saude ;
    private double peso ;  
    
    public Eevee(String tipo, int altura, int saude, double peso) {
        this.tipo = "Normal";
        this.altura = 40;
        this.saude = 55;
        this.peso = 6.5;
    }
    
    
    public String getTipo() {
        return tipo;
    }
    public int getAltura() {
        return altura;
    }
    public int getsaude() {
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
    public void setsaude(int hP) {
        saude = hP;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String ataque(){
        return "Ataque rápido";
    }
    public String defesa (){
        return "Desvio";
    }
    public String especial(){
        return "Tri-ataque";
    }
    
    public void imprimireve(){
        
        System.out.println("Olá, eu sou Eevee");
        System.out.println("Tipo: "+ tipo);
        System.out.println("altura: "+ altura);
        System.out.println("Saúde: "+ saude);
        System.out.println("Peso: "+ peso);
        System.out.println("Ataque: " + ataque());
        System.out.println("Defesa: " + defesa());
        System.out.println("Especial: " + especial());

    }
}