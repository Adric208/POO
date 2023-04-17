package Tarea9;

public class Automovil extends Vehiculo{
    private String Color;
    private String TipoDeMot;
    private int año;
    private Vehiculo Vehiculo;

    public Automovil() {
    }

    public Automovil(String color, String tipoDeMot, int año, Tarea9.Vehiculo vehiculo) {
        Color = color;
        TipoDeMot = tipoDeMot;
        this.año = año;
        Vehiculo = vehiculo;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getTipoDeMot() {
        return TipoDeMot;
    }

    public void setTipoDeMot(String tipoDeMot) {
        TipoDeMot = tipoDeMot;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Tarea9.Vehiculo getVehiculo() {
        return Vehiculo;
    }

    public void setVehiculo(Tarea9.Vehiculo vehiculo) {
        Vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "Color='" + Color + '\'' +
                ", TipoDeMot='" + TipoDeMot + '\'' +
                ", año=" + año +
                ", Vehiculo=" + Vehiculo +
                '}';
    }

    public void encender(){
        System.out.println("El auto se esta encendiendo");
    }
    public void apagar(){
        System.out.println("El auto se esta apagando");
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
