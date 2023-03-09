package Tarea7;

public class CuboRubik {
    private String Forma;
    private String Tipo;
    private int caras;

    public CuboRubik() {
    }

    public CuboRubik(String forma, String tipo, int caras) {
        Forma = forma;
        Tipo = tipo;
        this.caras = caras;
    }

    public String getForma() {
        return Forma;
    }

    public void setForma(String forma) {
        Forma = forma;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public int getCaras() {
        return caras;
    }

    public void setCaras(int caras) {
        this.caras = caras;
    }

    @Override
    public String toString() {
        return "CuboRubik{" +
                "Forma='" + Forma + '\'' +
                ", Tipo='" + Tipo + '\'' +
                ", caras=" + caras +
                '}';
    }
    public void mezclar() {
        System.out.println("El cubo de Rubik se está mezclando...");
    }

    public boolean esCuboNormal() {
        return Tipo.equalsIgnoreCase("Normal");
    }
}
