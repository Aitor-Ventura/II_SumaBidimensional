import java.util.Scanner;
/** ... */
public class MainClass {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nº de filas: ");
        int f = input.nextInt();
        System.out.print("Nº de columnas: ");
        int c = input.nextInt();

        int[][] mat = Excercise.init(f, c);

        for (int i = 0; i < mat.length; i ++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}