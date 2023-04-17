package Tarea9;

public class Vehiculo {
    private String Tipo;
    private String TipoDeCom;
    private String Medio;

    public Vehiculo() {
    }

    public Vehiculo(String tipo, String tipoDeCom, String medio) {
        Tipo = tipo;
        TipoDeCom = tipoDeCom;
        Medio = medio;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getTipoDeCom() {
        return TipoDeCom;
    }

    public void setTipoDeCom(String tipoDeCom) {
        TipoDeCom = tipoDeCom;
    }

    public String getMedio() {
        return Medio;
    }

    public void setMedio(String medio) {
        Medio = medio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "Tipo='" + Tipo + '\'' +
                ", TipoDeCom='" + TipoDeCom + '\'' +
                ", Medio='" + Medio + '\'' +
                '}';
    }
    public void moverse(){
        System.out.println("El vehículo se esta moviendo");
    }
    public void com(){
        System.out.println("El vehículo esta recargando combustible");
    }

}
