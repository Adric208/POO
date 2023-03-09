package Tarea7;

public class Gato {
    private int edad;
    private String sexo;
    private String raza;

    public Gato() {
    }

    public Gato(int edad, String sexo, String raza) {
        this.edad = edad;
        this.sexo = sexo;
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "edad=" + edad +
                ", sexo='" + sexo + '\'' +
                ", raza='" + raza + '\'' +
                '}';
    }
    public void maullar() {
        System.out.println("¡Miau!");
    }
    public void comer() {
        System.out.println("Comiendo croquetas");
    }
}
