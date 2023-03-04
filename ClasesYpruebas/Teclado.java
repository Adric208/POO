package ClasesYpruebas;

public class Teclado {
    private String marca;
    private String tipo;
    private double tamano;
    private String idioma;
    private String color;

    public Teclado(String marca, String tipo, double tamano, String idioma, String color) {
        this.marca = marca;
        this.tipo = tipo;
        this.tamano = tamano;
        this.idioma = idioma;
        this.color = color;
    }

    public Teclado(String marca, String tipo, double tamano) {
        this.marca = marca;
        this.tipo = tipo;
        this.tamano = tamano;
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

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Teclado{" +
                "marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", tamano=" + tamano +
                ", idioma='" + idioma + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void escribir() {
        System.out.println("Estas escribiendo en el teclado");
    }

    public void desconectar() {
        System.out.println("Acabas de descoenctar el teclado");
    }

    public void ajustarTamano(double v) {
        System.out.println("Acabas de acoplar e teclado numero ");
    }
}
