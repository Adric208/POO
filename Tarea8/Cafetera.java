package Tarea8;

public class Cafetera {
    private int agua;
    private int crema;
    private int vasos;
    private int cafe;

    public Cafetera() {
        agua=5000;
        crema=1000;
        cafe=1500;
        vasos=50;
    }

    public Cafetera(int agua, int crema, int vasos, int cafe) {
        this.agua = agua;
        this.crema = crema;
        this.vasos = vasos;
        this.cafe = cafe;
    }

    public int getAgua() {return agua;}

    public void setAgua(int agua) {
        if (agua <= 5000) {
            this.agua = agua;
        } else {
            System.out.println("No puede almacenarse mas agua");
        }
    }

    public int getCrema() {
        return crema;
    }

    public void setCrema(int crema) {

        if (crema <= 1500) {
            this.crema = crema;
        } else {
            System.out.println("No puede almacenarce mas crema");
        }
    }

    public int getVasos() {
        return vasos;
    }

    public void setVasos(int vasos) {
        if (vasos <= 50) {
            this.vasos = vasos;
        } else {
            System.out.println("Ya no caben mas vasos");
        }
    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        if (cafe <= 1000) {
            this.cafe = cafe;
        } else {
            System.out.println("No puede almacenarse mas café");
        }
    }

    @Override
    public String toString() {
        return "Tarea8.Cafetera{" +
                "agua=" + agua +
                ", crema=" + crema +
                ", vasos=" + vasos +
                ", cafe=" + cafe +
                '}';
    }
    public void prepararAmericano() {
        if (agua >= 180 && cafe >= 15 && vasos >= 1) {
            agua -= 180;
            cafe -= 15;
            vasos--;
            System.out.println("Americano listo.");
        } else {
            System.out.println("No hay suficientes recursos para el americano");
        }
    }

    public void prepararExpreso() {
        if (agua >= 120 && cafe >= 20 && vasos >= 1) {
            agua -= 120;
            cafe -= 20;
            vasos--;
            System.out.println("Expreso listo.");
        } else {
            System.out.println("No hay suficientes recursos para el expreso.");
        }
    }

    public void prepararCapuchino() {
        if (agua >= 100 && crema >= 70 && cafe >= 14 && vasos >= 1) {
            agua -= 100;
            crema -= 70;
            cafe -= 14;
            vasos--;
            System.out.println("Capuchino listo.");
        } else {
            System.out.println("No hay suficientes recursos para el capuchino.");
        }}
    public void deposito(){
        System.out.println("Recursos actuales");
        System.out.println("1-Crema: " + crema + " ml");
        System.out.println("2-Agua: " + agua + " ml");
        System.out.println("3-Café: " + cafe + " g");


        }
        public void cantvasos() {
            System.out.println("Cantidad de vasos restantes");
            System.out.println("1-Vasos=" + vasos + "vasos restantes");
        }

}
