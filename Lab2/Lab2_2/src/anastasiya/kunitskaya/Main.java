package anastasiya.kunitskaya;

import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        PrintStream out = System.out;
        Scanner scanner = new Scanner(System.in);

        out.print("Matrix size: ");
        int n = scanner.nextInt();

        Random rand = new Random();
        int[][] matrix = new int[n][n];
        for(int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                matrix[i][j] = rand.nextInt(2 * n + 1) - n;
            }
        }
        out.println("Input matrix");
        printMatrix(matrix);

        out.println("Transparent Matrix:");
        printMatrix(transparentMatrix(matrix));
    }

    public static int[][] transparentMatrix(int[][] matrix)
    {
        int len = matrix.length;
        int[][] outMatrix = new int[len][len];
        for(int i = 0; i < len; i++)
            for(int j = 0; j < len; j++)
                outMatrix[i][j] = matrix[j][i];
        return outMatrix;
    }

    public static void printMatrix(int[][] matrix)
    {
        PrintStream out = System.out;
        for( int[] row : matrix)
        {
            for (int item : row)
                out.print(String.format("%3d ", item));
            out.println();
        }
    }
}
