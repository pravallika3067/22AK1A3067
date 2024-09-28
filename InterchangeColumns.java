public class InterchangeColumns {

    public static void main(String[] args) {
        // Define a sample matrix
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Interchange the first and last columns
        interchangeFirstAndLastColumns(matrix);

        System.out.println("Matrix after interchanging first and last columns:");
        printMatrix(matrix);
    }

    // Method to interchange the first and last columns of the matrix
    public static void interchangeFirstAndLastColumns(int[][] matrix) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;

        for (int i = 0; i < numRows; i++) {
            int temp = matrix[i][0];           // Store the first column element
            matrix[i][0] = matrix[i][numCols - 1]; // Move the last column element to the first column
            matrix[i][numCols - 1] = temp;     // Move the stored first column element to the last column
        }
    }

    // Method to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
