package practiceexercise3java;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixAddition {
	public int[][]  MatrixAddition(){
//	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m, n, c, d;
   System.out.println("Enter the number of rows and columns of the matrix");
    m = sc.nextInt();
    n = sc.nextInt();
    int first[][] = new int[m][n];
    int second[][] = new int[m][n];
    int sum[][] = new int[m][n];
    System.out.println("Enter the elements of first matrix");
    
    for (c = 0; c < m; c++)
       for (d = 0; d < n; d++)
          first[c][d] = sc.nextInt();
    System.out.println("Enter the elements of second matrix");
    
    for (c = 0 ; c < m ; c++)
       for (d = 0 ; d < n ; d++)
          second[c][d] = sc.nextInt();
    for (c = 0; c < m; c++)
        for (d = 0; d < n; d++)
            sum[c][d] = first[c][d] + second[c][d];
//System.out.println(Arrays.deepToString(sum));

    return sum;

   
    
    
    
    
	}

	@Override
	public String toString() {
		return "MatrixAddition [MatrixAddition()=" + Arrays.toString(MatrixAddition()) + "]";
	}
}
