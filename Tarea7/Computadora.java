package Tarea7;

public class Computadora {
    private String marca;
    private double precio;
    private String gamma;

    public Computadora() {
    }

    public Computadora(String marca, double precio, String gamma) {
        this.marca = marca;
        this.precio = precio;
        this.gamma = gamma;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getGamma() {
        return gamma;
    }

    public void setGamma(String gamma) {
        this.gamma = gamma;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", gamma='" + gamma + '\'' +
                '}';
    }
    public boolean esBarata() {
        return precio <= 12000;
    }
    public boolean esDeGammaMedia() {
        return gamma.equals("Media");
    }
    }

