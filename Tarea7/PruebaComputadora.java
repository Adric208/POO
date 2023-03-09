package Tarea7;

public class PruebaComputadora {
    public static void main(String[] args) {
        Computadora pc1 = new Computadora("Lenovo",10000,"Media");
        Computadora pc2 = new Computadora("ASUS",35000,"Alta");
        System.out.println("¿La computadora Lenovo es barata?" + pc1.esBarata());
        System.out.println("¿La computadora Asus es de gama Media?" + pc2.esDeGammaMedia());

    }

}
