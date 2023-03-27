package Tarea8;

public class PruebaCafetera {
    public static void main(String[] args) {
        Cafetera cafetera = new Cafetera();
        cafetera.deposito();
        cafetera.cantvasos();
        cafetera.prepararExpreso();
        cafetera.prepararAmericano();
        cafetera.prepararCapuchino();
        cafetera.prepararExpreso();
        cafetera.prepararAmericano();
        cafetera.prepararCapuchino();
        cafetera.prepararExpreso();
        cafetera.prepararAmericano();
        cafetera.prepararCapuchino();
        cafetera.prepararExpreso();
        cafetera.prepararAmericano();
        cafetera.prepararCapuchino();
        cafetera.prepararExpreso();
        cafetera.prepararAmericano();
        cafetera.prepararCapuchino();
        cafetera.prepararExpreso();
        cafetera.prepararAmericano();
        cafetera.prepararCapuchino();
        cafetera.prepararExpreso();
        cafetera.prepararAmericano();
        cafetera.prepararCapuchino();
        cafetera.prepararExpreso();
        cafetera.prepararAmericano();
        cafetera.prepararCapuchino();
        cafetera.prepararExpreso();
        cafetera.prepararAmericano();
        cafetera.prepararCapuchino();



        if (cafetera.getVasos() > 0 && cafetera.getAgua() > 100 && cafetera.getCafe() > 14 && cafetera.getCrema() > 70 ) {
            System.out.println("La maquina ya no tiene vasos dispinibles pero si recursos para seguir sirviendo");
            cafetera.deposito();
            cafetera.cantvasos();
        } else {
            System.out.println("La maquina todavia tiene vasos para seguir sirviendo pero no recursos:");
            cafetera.deposito();
            cafetera.cantvasos();
        }
        cafetera.deposito();
        cafetera.cantvasos();
    }
}
