package ClasesYpruebas;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona(22, "Carlos", 1.85, 77, 'H');
        Persona p2 = new Persona(22,"Jose",1.74);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        p1.dormir();
        p2.comer();
        p2.ban();
    }
}
