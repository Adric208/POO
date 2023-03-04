package ClasesYpruebas;

public class Persona {
    private int edad;
    private String nombre;
    private double estatura;
    private double peso;
    private char genero;

    public Persona(int edad, String nombre, double estatura, double peso, char genero) {
        this.edad = edad;
        this.nombre = nombre;
        this.estatura = estatura;
        this.peso = peso;
        this.genero = genero;
    }

    public Persona(int edad, String nombre, double estatura) {
        this.edad = edad;
        this.nombre = nombre;
        this.estatura = estatura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", estatura=" + estatura +
                ", peso=" + peso +
                ", genero=" + genero +
                '}';
    }
    public void comer() {
        System.out.println(nombre + " come algo de pizza");
    }
    public void dormir() {
        System.out.println(nombre + " se esta durmiento tarde");
    }

    public void ban() {
        System.out.println(nombre + " está bañandose temprano");
    }
}
