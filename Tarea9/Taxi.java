package Tarea9;

public class Taxi extends Automovil{
    private String compañia;
    private String Marca;
    private String Placa;
    private Automovil Automovil;

    public Taxi() {
    }

    public Taxi(String compañia, String marca, String placa, Tarea9.Automovil automovil) {
        compañia = compañia;
        marca = marca;
        placa = placa;
        Automovil = automovil;
    }

    public String getcompañia() {
        return compañia;
    }

    public void setcompañia(String compañia) {
        compañia = compañia;
    }

    public String getmarca() {
        return marca;
    }

    public void setmarca(String marca) {
        marca = marca;
    }

    public String getplaca() {
        return placa;
    }

    public void setplaca(String placa) {
        placa = placa;
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
                "compañia='" + compañia + '\'' +
                ", marca='" + marca + '\'' +
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
