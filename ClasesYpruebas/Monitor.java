package ClasesYpruebas;

public class Monitor {
    private double pulgadas;
    private String marca;
    private String modelo;
    private String Tipo;
    private double precio;

    public Monitor(double pulgadas, String marca) {
        this.pulgadas = pulgadas;
        this.marca = marca;
    }

    public Monitor(double pulgadas, String marca, String modelo, String tipo, double precio) {
        this.pulgadas = pulgadas;
        this.marca = marca;
        this.modelo = modelo;
        Tipo = tipo;
        this.precio = precio;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "pulgadas=" + pulgadas +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", Tipo='" + Tipo + '\'' +
                ", precio=" + precio +
                '}';
    }

    public void roto() {
        System.out.println("El monitor se encuentra roto");
    }

    public void encendido() {
        System.out.printf("Monitor prendido");
    }
}
