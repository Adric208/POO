package Tarea7;

public class Giroscopio {
    private String modelo;
    private int numeroDeSerie;
    private String materiales;

    public Giroscopio(String modelo, int numeroDeSerie, String materiales) {
        this.modelo = modelo;
        this.numeroDeSerie = numeroDeSerie;
        this.materiales = materiales;
    }

    public Giroscopio() {

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(int numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public String getMateriales() {
        return materiales;
    }

    public void setMateriales(String materiales) {
        this.materiales = materiales;
    }

    @Override
    public String toString() {
        return "Giroscopio{" +
                "modelo='" + modelo + '\'' +
                ", numeroDeSerie=" + numeroDeSerie +
                ", materiales='" + materiales + '\'' +
                '}';
    }
    public void girar() {
        System.out.println("Enredando giroscopio para jugar.");
    }

    public void inicio() {
        System.out.println("Giroscopio girando");
    }
}
