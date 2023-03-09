package Tarea7;

public class Balon {
    private String marca;
    private String tipo;
    private String material;

    public Balon() {
    }

    public Balon(String marca, String tipo, String material) {
        this.marca = marca;
        this.tipo = tipo;
        this.material = material;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Balon{" +
                "marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
    public void rebotando() {
        System.out.println("El balón está rebotando.");
    }

    public void lanzando() {
        System.out.println("El balón está siendo lanzado.");
}}
