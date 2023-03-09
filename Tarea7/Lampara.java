package Tarea7;

public class Lampara {
    private int consumo;
    private String Marca;
    private String color;

    public Lampara() {
    }

    public Lampara(int consumo, String marca, String color) {
        this.consumo = consumo;
        Marca = marca;
        this.color = color;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Lampara{" +
                "consumo=" + consumo +
                ", Marca='" + Marca + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public boolean apagar() {
        System.out.println("La lámpara se ha apagado.");
        return false;
    }
    public String consumoEnergetico() {
        if (this.consumo <= 15) {
            return "La lámpara consume poca energía.";
        } else {
            return "La lámpara consume bastante energía.";
        }
    }

}
