import java.util.Scanner;
class MatrixMultiplication {
    public static void main(String args[]) {
        int m1, n1, m2, n2;
        Scanner sc = new Scanner(System.in);
        
        // Input for Matrix 1 dimensions
        System.out.println("Enter the rows and columns of matrix 1:");
        m1 = sc.nextInt();
        n1 = sc.nextInt();
        int a[][] = new int[m1][n1];
        
        // Input for Matrix 2 dimensions
        System.out.println("Enter the rows and columns of matrix 2:");
        m2 = sc.nextInt();
        n2 = sc.nextInt();
        
        // Check if matrix multiplication is possible
        if (n1 != m2) {
            System.out.println("Matrix multiplication is not possible. Number of columns in matrix 1 must equal number of rows in matrix 2.");
            return;
        }
        
        int b[][] = new int[m2][n2];
        int c[][] = new int[m1][n2]; // Resulting matrix

        // Input elements for Matrix 1
        System.out.println("Enter the elements of matrix 1:");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Input elements for Matrix 2
        System.out.println("Enter the elements of matrix 2:");
        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < n2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // Multiplication logic
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                c[i][j] = 0; // Initialize result matrix element
                for (int k = 0; k < n1; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        // Output the result matrix
        System.out.println("Resultant matrix:");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}