public class Excercise {
    public static int[][] init(int n, int m) {
        int[][] intArray = new int[n][m]; //creamos un array bidimensional de n x m dimensiones
        for (int i = 0; i < intArray.length; i++){ 
            for (int j = 0; j < intArray[i].length; j++){
                intArray[i][j] = i + j; //el término dentro del índice i j, es la suma de los índices
            }
        }
    return intArray;
    }
}