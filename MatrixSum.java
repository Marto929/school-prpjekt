package domashnoit;
import java.util.Scanner;
public class MatrixSum {

	public static void main(String[] args) {
		final int arraySize = 3;
		int[][] matrix = new int [arraySize] [arraySize];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < arraySize; i++) {
			for(int k = 0; k < arraySize; k++) {
				System.out.println("Enter a number on index " + i + ", " + k );
				matrix[i][k] = scanner.nextInt();
			}
		}
		
		
		for (int i = 0; i < arraySize; i++) {
			for(int j = 0; j<arraySize; j++) {
			System.out.print(matrix[i][j] + "\t");	
			}
			System.out.println();
		}
		
		int indexMaxSum = 0, maxSum = 0;
		for (int i = 0;i<arraySize; i++) {
			int sumCurrentRow = 0;
			for(int j = 0; j<arraySize; j++){
				sumCurrentRow += matrix[i][j];
				}
			if(i == 0) {
				indexMaxSum = i;
				maxSum = sumCurrentRow;
			}else if(sumCurrentRow>maxSum) {
				indexMaxSum = i;
				maxSum = sumCurrentRow;
			}
		}
		
		System.out.println("The row with the biggest sum of elements is with index " + indexMaxSum);
		
	}

}