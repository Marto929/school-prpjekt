package domashno;
	import java.util.Scanner;

	public class zadachi {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner reader = new Scanner(System.in);
			int zvezdi;
			System.out.println("Enter # of *s on the 1st line : ");
			zvezdi=reader.nextInt();
			for(int i=0; i<zvezdi; i++) {
				for(int a=0; a<i; a++) {
					System.out.print("  ");
				}
				for(int a=0; a<zvezdi-i; a++) {
					System.out.print("* ");
				}
				System.out.print("\n");
			}
			reader.close();
		}

	} 





	
	
	