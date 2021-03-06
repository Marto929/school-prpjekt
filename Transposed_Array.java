package domashnoit;
import java.util.Scanner;
public class Transposed_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of rows");
		int rowSize = sc.nextInt();
		System.out.println("Enter a number of columns");
		int columnSize = sc.nextInt();
		
		int[][] matrix = new int [rowSize][columnSize];
		int[][] transposed = new int [columnSize][rowSize];
		
		for(int i = 0; i < rowSize; i++) {
			for(int j = 0; j < columnSize; j++) {
				System.out.println("Enter a number of index " + i + ", " + j);
				matrix[i][j] = sc.nextInt();
			}
			
		}
		
		
		for(int i = 0; i < rowSize; i++) {
			for(int j = 0; j < columnSize; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		
		for(int i = 0; i < rowSize; i++) {
			for(int j = 0; j < columnSize; j++) {
				transposed[j][i] = matrix[i][j];
			}
			
		}
		
		System.out.println();
		System.out.println("Transposed: \n" );
		
		for(int i = 0; i < columnSize; i++) {
			for(int j = 0; j < rowSize; j++) {
				System.out.print(transposed[i][j] + "\t");
			}
			System.out.println();
		}

	}

}