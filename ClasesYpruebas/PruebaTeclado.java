package ClasesYpruebas;

public class PruebaTeclado {
        public static void main(String[] args) {
            Teclado t1 = new Teclado("Logitech", "Mecánico", 100.0, "Español", "Negro");
            Teclado t2 = new Teclado("Corsair","Membrana",75);
            System.out.println(t1.toString());
            t1.escribir();
            System.out.println(t2.toString());
            t2.desconectar();
            t2.ajustarTamano(80.0);
        }
    }

