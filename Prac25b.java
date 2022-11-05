// Java Program to check whether matrix is
// symmetric or not
import java.util.*;
class NotSymmetricException extends Exception {
    public NotSymmetricException(String msg) {
        super(msg);
    }
}
public class Prac25b {
	static void checkSymmetric(int mat[][], int row, int col)
	{
		int i, j, flag = 1;
        int sum_part1 = 0, sum_part2 = 0, sum_part3 = 0, sum_part4 = 0;
        int totalsum = 0;
		System.out.println("The matrix formed is: ");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println("");
		}
		// Matrix 2
		// Finding transpose of the matrix
		int[][] transpose = new int[row][col];
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				transpose[j][i] = mat[i][j];
			}
		}
		// Condition check over Matrix 1 with Matrix 2
		if (row == col) {
			for (i = 0; i < row; i++) {
				for (j = 0; j < col; j++) {
					// Comparing two matrices
					if (mat[i][j] != transpose[i][j]) {
						flag = 0;
						break;
					}
				}
				// Setting a flag value for symmetric matrix
				if (flag == 0){
                    try{
                        throw new NotSymmetricException("\nException: Entered matrix is not symmetric");
                    }
                    catch(NotSymmetricException e){
                        System.out.println(e.getMessage());
                    }
                    break;
				}
                else {
                    System.out.print("\nThe matrix is symmetric");
                    break;
                }
			}
            if(flag==1){
                for (int k = 0; k < row; k++) {
                    for (int l = 0; l < col; l++) {
                        // Condition for selecting all values
                        // before the second diagonal of metrics
                        if (k + l < row - 1) {
                            // Top portion of the matrix
                            if (k < l && k != l && k + l > 0)
                                sum_part1 += mat[k][l];
                            // Left portion of the matrix
                            else if (k != l)
                                sum_part2 += mat[k][l];
                        }
                        else {
              
                            // Bottom portion of the matrix
                            if (k > l && k + l != row - 1)
                                sum_part3 += mat[k][l];
              
                            // Right portion of the matrix
                            else {
                                if (k + l != row - 1 && k != l)
                                    sum_part4 += mat[k][l];
                            }
                        }
                    }
                }
                // Adding all the four portions into a vector
                totalsum = sum_part1 + sum_part2 + sum_part3 + sum_part4;
                System.out.println("\nThe sum of all the non diagonal elements is "+totalsum);
            }
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i, j, row, col, flag = 1;
		System.out.print("Enter the number of rows: ");
		row = sc.nextInt();
		System.out.print("Enter the number of columns: ");
		col = sc.nextInt();
        // If it isn't a square matrix then it can't be a symmetric matrix
		if(row != col) {
			System.out.print("\nThe matrix is not symmetric (since it is not a square matrix)");
            sc.close();
            return;
		}
		// Declaring a 2D array(matrix)
		int[][] mat = new int[row][col];
		System.out.println("Enter the matrix elements:");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		checkSymmetric(mat, row, col);
	}
}
