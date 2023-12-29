package MatrixMultiplication4;

import java.util.Scanner;

public class MatrixMultiplication {

    public static int[][] multiplyMatrices(int[][] mat1, int[][] mat2) {
        int rowsA = mat1.length;
        int colsA = mat1[0].length;
        int rowsB = mat2.length;
        int colsB = mat2[0].length;

        // Check if the matrices can be multiplied
        if (colsA != rowsB) {
            System.out.println("Matrices cannot be multiplied. Invalid dimensions.");
            return null;
        }

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dimensions of the first matrix
        System.out.print("Enter the number of rows for the first matrix: ");
        int rowsA = scanner.nextInt();
        System.out.print("Enter the number of columns for the first matrix: ");
        int colsA = scanner.nextInt();

        // Input elements for the first matrix
        int[][] matrixA = new int[rowsA][colsA];
        System.out.println("Enter the elements for the first matrix:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        // Input dimensions of the second matrix
        System.out.print("Enter the number of rows for the second matrix: ");
        int rowsB = scanner.nextInt();
        System.out.print("Enter the number of columns for the second matrix: ");
        int colsB = scanner.nextInt();

        // Input elements for the second matrix
        int[][] matrixB = new int[rowsB][colsB];
        System.out.println("Enter the elements for the second matrix:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }

        // Multiply matrices and display the result
        int[][] resultMatrix = multiplyMatrices(matrixA, matrixB);

        if (resultMatrix != null) {
            System.out.println("Resultant Matrix after multiplication:");
            printMatrix(resultMatrix);
        }

        scanner.close();
    }
}
