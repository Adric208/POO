package Tarea9;

public class PruebTaxi {
    public static void main(String[] args) {
        Taxi taxi= new Taxi("Los Inges","Tsuru","ICOA24E",
                new Automovil("Blanco con rosa","Motor en V",
                2023,new Vehiculo("De motor","Gasolina","Terrestre")));
        System.out.println(taxi);
        taxi.encender();
        taxi.pasaje();

        taxi.moverse();
    }
}
