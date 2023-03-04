import java.util.Scanner;
public class Gato2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa los siguientes caracteres para poder jugar, siendo solo 9, y no pueden ser diferentes:O,X,_");
        String variable = scanner.nextLine();
        if (variable.length() != 9) {
            System.out.println("Los caracteres ingresados no pueden ser mayor o menor a 9");
            return;
        }
        for (int i = 0; i < variable.length(); i++) {
            char c = variable.charAt(i);
            if (c != 'X' && c != 'O' && c != '_') {
                System.out.println("Ingresa solo los caracteres permitidos");
                return;
            }
        }
        System.out.println("El juego queda asi :");
        System.out.println(" ------------- ");
        System.out.println("| " + variable.charAt(0) + " | " + variable.charAt(1) + " | " + variable.charAt(2) + " |");
        System.out.print("| ");
        System.out.print(variable.charAt(3) + " | " + variable.charAt(4) + " | " + variable.charAt(5) + " |");
        System.out.println(" ");
        System.out.println("| " + variable.charAt(6) + " | " + variable.charAt(7) + " | " + variable.charAt(8) + " |");
        System.out.println(" ------------- ");
    }
}