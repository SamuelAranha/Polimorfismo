public class Pokedex {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Eevee e = new Eevee(null, 0, 0, 0);
        Joelton j = new Joelton(null, 0, 0, 0);
        Espeon es = new Espeon(null, 0, 0, 0);
        Flareon f = new Flareon(null, 0, 0, 0);
        Glaceon g = new Glaceon(null, 0, 0, 0);
        Leafon l = new Leafon(null, 0, 0, 0);
        Sylveon s = new Sylveon(null, 0, 0, 0);
        Vaporeon v = new Vaporeon(null, 0, 0, 0);
        Umbreon u = new Umbreon(null, 0, 0, 0);


      System.out.println("Dados sobre Eevee e suas evoluções: ");
      System.out.println(".....");
      e.imprimireve();
      System.out.println(".....");
      j.imprimirJoelton();
      System.out.println(".....");
      es.imprimirEspeon();
      System.out.println(".....");
      f.imprimirFlareon();
      System.out.println(".....");
      g.imprimirGlaceon();
      System.out.println(".....");
      l.imprimirLeafon();
      System.out.println(".....");
      s.imprimirSylveon();
      System.out.println(".....");
      v.imprimirVaporeon();
      System.out.println(".....");
      u.imprimirUmbreon();
      System.out.println(".....");



    }
}

