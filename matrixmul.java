import java.util.Scanner;

class MatrixMultiplication {
    public static void main(String args[]) {
        int r1, c1, r2, c2;
        Scanner sc = new Scanner(System.in);
        
        // Input dimensions for the first matrix
        System.out.println("Enter the rows and columns of matrix 1");
        r1 = sc.nextInt();
        c1 = sc.nextInt();
        int a[][] = new int[r1][c1];
        
        // Input dimensions for the second matrix
        System.out.println("Enter the rows and columns of matrix 2");
        r2 = sc.nextInt();
        c2 = sc.nextInt();
        int b[][] = new int[r2][c2];
        
        // Input elements of the first matrix
        System.out.println("Enter the elements of matrix 1");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        
        // Input elements of the second matrix
        System.out.println("Enter the elements of matrix 2");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        
        // Check if matrix multiplication is possible
        if (c1 == r2) {
            int c[][] = new int[r1][c2];
            
            // Matrix multiplication logic
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    c[i][j] = 0;
                    for (int k = 0; k < c1; k++) {
                        c[i][j] = c[i][j] + (a[i][k] * b[k][j]);
                    }
                }
            }
            
            // Output the result
            System.out.println("Product of the matrices:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrix multiplication is not possible with the given dimensions.");
        }
    }
}