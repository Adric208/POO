package Tarea7;

public class PruebaLibro {
    public static void main(String[] args) {
        Libro lib1 = new Libro("El retrato de Dorian Grat","Ficción",452);
        Libro lib2 = new Libro("Los 3 cochinitos","Fábula",30);
        System.out.println("¿De que genero es el libro 1? = "+ lib1.tipoDeLibro());
        System.out.println("¿Como se categoriza el libro 2? = "+lib2.cantidadDeHojas());



    }
}
