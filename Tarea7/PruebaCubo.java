package Tarea7;

public class PruebaCubo {
    public static void main(String[] args) {
        CuboRubik cubo1= new CuboRubik("Piramidal","Magnetico",5);
        CuboRubik cubo2=new CuboRubik("Rectangulo","Normal",6);
        System.out.println("El cubo 1 es de tipo " + cubo1.getTipo());
        System.out.println("Girando el cubo 2...");
        cubo2.mezclar();
        if (cubo1.esCuboNormal()) {
            System.out.println("El cubo 1 es un cubo piramidal.");
        } else {
            System.out.println("El cubo 1 no es un cubo piramidal.");
        }

    }
}
