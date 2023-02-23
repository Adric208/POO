public class Gato{
    public static void main(String[] args) {
        char[][] x = new char[3][3];
        x[0][0] = ' ';
        x[0][1] = ' ';
        x[0][2] = ' ';
        x[1][0] = ' ';
        x[1][1] = ' ';
        x[1][2] = ' ';
        x[2][0] = ' ';
        x[2][1] = ' ';
        x[2][2] = ' ';

        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(x[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
}
