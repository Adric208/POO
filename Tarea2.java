import java.util.Scanner;
public class Tarea2{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        	System.out.println("Dame la cadena en el siguiente orden: 'Nombre Profesión Pais de Origen':");
        String x = sc.nextLine();
        String[] p = x.split(" ");
        String a = p[0].toUpperCase();
        String b = p[1].toUpperCase();
        String c = p[2].toUpperCase();
        	System.out.println("Nombre: " + a);
        	System.out.println("Profesión: " + b);
       		System.out.println("País: " + c);
    }
}
	

