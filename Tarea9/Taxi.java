package Tarea9;

public class Taxi extends Automovil{
    private String Compañia;
    private String Marca;
    private String Placa;
    private Automovil Automovil;

    public Taxi() {
    }

    public Taxi(String compañia, String marca, String placa, Tarea9.Automovil automovil) {
        Compañia = compañia;
        Marca = marca;
        Placa = placa;
        Automovil = automovil;
    }

    public String getCompañia() {
        return Compañia;
    }

    public void setCompañia(String compañia) {
        Compañia = compañia;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    public Tarea9.Automovil getAutomovil() {
        return Automovil;
    }

    public void setAutomovil(Tarea9.Automovil automovil) {
        Automovil = automovil;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "Compañia='" + Compañia + '\'' +
                ", Marca='" + Marca + '\'' +
                ", Placa='" + Placa + '\'' +
                ", Automovil=" + Automovil +
                '}';
    }

    public void trabajando(){
    System.out.printf("El taxi esta trabajando");
}
public void pasaje(){
    System.out.printf("El taxi recoge un pasajero");
}
    @Override
    public void encender() {
        super.encender();
    }

    @Override
    public void apagar() {
        super.apagar();
    }

    @Override
    public void moverse() {
        super.moverse();
    }

    @Override
    public void com() {
        super.com();
    }
}
