package Tarea7;

public class PruebaPais {
    public static void main(String[] args) {
        Pais pais1= new Pais("México","Español Latino","Peso");
        Pais pais2= new Pais("Estados Unidos","Ingles","Dolar");
        System.out.println("¿Qué idioma habla México?");
        pais1.idiomaBuscado();
        System.out.println("¿Qué moneda usa E.U?");
        pais2.economia();
    }
    }


