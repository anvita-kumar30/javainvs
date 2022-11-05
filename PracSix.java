import java.util.*;

class MatrixException extends Exception {
    public MatrixException(String msg) {
        super(msg);
    }
}
public class PracSix {
    static void mulMat(int[][] array1, int[][] array2, int R1, int C2, int R2) {
        int[][] rslt = new int[R1][C2];
        System.out.println("Multiplication of given two matrices is:");
        int i, j, k;
        for (i = 0; i < R1; i++) {
            for (j = 0; j < C2; j++) {
                rslt[i][j] = 0;
                for (k = 0; k < R2; k++)
                    rslt[i][j] = rslt[i][j] + array1[i][k] * array2[k][j];
                System.out.print(rslt[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int i, j;

        System.out.println("Enter the number of rows and columns for matrix A: ");
        Scanner s1 = new Scanner(System.in);
        int R1 = s1.nextInt();
        int C1 = s1.nextInt();
        int array1[][] = new int[R1][C1];
        System.out.println("Enter the number of rows and columns for matrix B: ");
        Scanner s = new Scanner(System.in);
        int R2 = s.nextInt();
        int C2 = s.nextInt();
        int array2[][] = new int[R2][C2];
        if (C1 != R2) {
            try {
                throw new MatrixException("Matrices cannot be multiplied");
            } 
            catch (MatrixException e) {
                System.out.println(e.getMessage());
            }
        } 
        else {
            System.out.println("For Matrix A:");
            System.out.println("Enter the matrix elements: ");
            for (i = 0; i < R1; i++) {
                for (j = 0; j < C1; j++) {
                    array1[i][j] = s1.nextInt();
                    System.out.print("");
                }
            }
            System.out.println("For Matrix B:");
            System.out.println("Enter the matrix elements: ");
            for (i = 0; i < R2; i++) {
                for (j = 0; j < C2; j++) {
                    array2[i][j] = s.nextInt();
                    System.out.print("");
                }
            }
            System.out.println("The Matrix A is: ");
            for (i = 0; i < R1; i++) {
                for (j = 0; j < C1; j++) {
                    System.out.print(array1[i][j] + " ");
                }
                System.out.println(" ");
            }
            System.out.println("The Matrix B is: ");
            for (i = 0; i < R2; i++) {
                for (j = 0; j < C2; j++) {
                    System.out.print(array2[i][j] + " ");
                }
                System.out.println(" ");
            }
            mulMat(array1, array2, R1, C2, R2);
        }
    }
}