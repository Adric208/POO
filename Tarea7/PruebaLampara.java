package Tarea7;

public class PruebaLampara {
    public static void main(String[] args) {
        Lampara lampara = new Lampara(14, "Philips", "Blanco");
        Lampara lampara2 = new Lampara(42,"Philips","Morado");
        System.out.println(lampara.apagar());
        System.out.println(lampara2.consumoEnergetico());
}}
