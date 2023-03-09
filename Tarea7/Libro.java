package Tarea7;

public class Libro {
    private String titulo;
    private String genero;
    private int cantidadHojas;

    public Libro() {
    }

    public Libro(String titulo, String genero, int cantidadHojas) {
        this.titulo = titulo;
        this.genero = genero;
        this.cantidadHojas = cantidadHojas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCantidadHojas() {
        return cantidadHojas;
    }

    public void setCantidadHojas(int cantidadHojas) {
        this.cantidadHojas = cantidadHojas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", cantidadHojas=" + cantidadHojas +
                '}';
    }
    public String tipoDeLibro() {
        if (genero == "Ficción") {
            return "Ficción";
        } else {
            return "No Ficción";
        }

    }
    public String cantidadDeHojas() {
        if (cantidadHojas <= 60) {
            return "Cuento o Fábula";
        } else {
            return "Libro de otro género";
        }
    }

}
