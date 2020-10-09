package domashno;
import java.util.Scanner;
public class chislovipiramidi {




		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner reader = new Scanner(System.in);
			int pyramidNumber;
			System.out.println("Enter # of rows in the pyramid : ");
			pyramidNumber=reader.nextInt();
			while(pyramidNumber>0) {
				for(int a=pyramidNumber; a>=1; a--) {
					System.out.print(a + " ");
				}
				for(int a=2; a<=pyramidNumber; a++) {
					System.out.print(a + " ");
				}
				System.out.print("\n");
				pyramidNumber--;
			}
			reader.close();
		}

}
