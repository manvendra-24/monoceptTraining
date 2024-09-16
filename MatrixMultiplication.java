import java.util.Scanner;

public class MatrixMultiplication {

    
    static void printMatrix(int M[][], int rowSize, int colSize) {
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++)
                System.out.print(M[i][j] + " ");
            System.out.println();
        }
    }

    static void multiplyMatrix(int row1, int col1, int matrixA[][], int row2, int col2, int matrixB[][]) {
        int i, j, k;

       
        System.out.println("\nMatrix A:");
        printMatrix(matrixA, row1, col1);
        System.out.println("\nMatrix B:");
        printMatrix(matrixB, row2, col2);

       
        if (col1 != row2) {
            System.out.println("\nMultiplication Not Possible");
            return;
        }

        
        int matrixC[][] = new int[row1][col2];

       
        for (i = 0; i < row1; i++) {
            for (j = 0; j < col2; j++) {
                for (k = 0; k < col1; k++) {
                    matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        
        System.out.println("\nResul Matrix:");
        printMatrix(matrixC, row1, col2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.println("Enter the number of rows and columns for matrix A:");
        int row1 = scanner.nextInt();
        int col1 = scanner.nextInt();

        
        int[][] matrixA = new int[row1][col1];
        System.out.println("Enter the elements of matrix A:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

       
        System.out.println("Enter the number of rows and columns for matrix B:");
        int row2 = scanner.nextInt();
        int col2 = scanner.nextInt();

       
        int[][] matrixB = new int[row2][col2];
        System.out.println("Enter the elements of matrix B:");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }

      
        multiplyMatrix(row1, col1, matrixA, row2, col2, matrixB);

        scanner.close();
    }
}
