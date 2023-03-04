package ClasesYpruebas;

public class PruebaMonitor {
    public static void main(String[] args) {
        Monitor m1 = new Monitor(27.5,"GIGABYTE","XF4TGGV","IPS",6852.58);
        Monitor m2 = new Monitor(20,"Lenovo");
        System.out.println(m1.toString());
        m1.roto();
        System.out.println(m2.toString());
        m2.encendido();
    }
}
