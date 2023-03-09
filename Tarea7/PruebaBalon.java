package Tarea7;

public class PruebaBalon {
    public static void main(String[] args) {
        Balon futbol= new Balon("Nike","Futbol","Vinipiel");
        Balon basquet= new Balon("Spalding","Basquetball","Cuero");
        System.out.println(futbol);
        futbol.rebotando();
        System.out.println(basquet);
        basquet.lanzando();

    }

}
