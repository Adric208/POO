package Tarea9;

public class Vehiculo {
    private String tipo;
    private String tipoDeCom;
    private String medio;

    public Vehiculo() {
    }

    public Vehiculo(String tipo, String tipoDeCom, String medio) {
        tipo = tipo;
        tipoDeCom = tipoDeCom;
        medio = medio;
    }

    public String gettipo() {
        return tipo;
    }

    public void settipo(String tipo) {
        tipo = tipo;
    }

    public String gettipoDeCom() {
        return tipoDeCom;
    }

    public void settipoDeCom(String tipoDeCom) {
        tipoDeCom = tipoDeCom;
    }

    public String getmedio() {
        return medio;
    }

    public void setmedio(String medio) {
        medio = medio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "tipo='" + tipo + '\'' +
                ", tipoDeCom='" + tipoDeCom + '\'' +
                ", medio='" + medio + '\'' +
                '}';
    }
    public void moverse(){
        System.out.println("El vehículo se esta moviendo");
    }
    public void com(){
        System.out.println("El vehículo esta recargando combustible");
    }

}
