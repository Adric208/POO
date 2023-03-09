package Tarea7;

public class PruebaGiroscopio {
    public static void main(String[] args) {
        Giroscopio g1 = new Giroscopio("MaxQ 2000", 8563, "Aluminio");
        System.out.println(g1);
        g1.girar();
        g1.inicio();

    }
}
