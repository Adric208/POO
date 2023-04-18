package Tarea9;

public class Automovil extends Vehiculo{
    private String color;
    private String tipoDeMot;
    private int año;
    private Vehiculo Vehiculo;

    public Automovil() {
    }

    public Automovil(String color, String tipoDeMot, int año, Tarea9.Vehiculo vehiculo) {
        color = color;
        tipoDeMot = tipoDeMot;
        this.año = año;
        Vehiculo = vehiculo;
    }

    public String getcolor() {
        return color;
    }

    public void setcolor(String color) {
        color = color;
    }

    public String gettipoDeMot() {
        return tipoDeMot;
    }

    public void settipoDeMot(String tipoDeMot) {
        tipoDeMot = tipoDeMot;
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
                "color='" + color + '\'' +
                ", tipoDeMot='" + tipoDeMot + '\'' +
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
