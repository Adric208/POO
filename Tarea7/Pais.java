package Tarea7;

public class Pais {
    private String nombre;
    private String idioma;
    private String moneda;

    public Pais() {
    }

    public Pais(String nombre, String idioma, String moneda) {
        this.nombre = nombre;
        this.idioma = idioma;
        this.moneda = moneda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", idioma='" + idioma + '\'' +
                ", moneda='" + moneda + '\'' +
                '}';
    }


    public String economia() {
            System.out.println("Se usa el Dolar");
        return null;
    }

    public void idiomaBuscado() {
        System.out.println("Se habla español");
    }
}