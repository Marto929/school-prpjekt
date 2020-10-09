package domashno;
import java.util.Scanner;
public class cenaobuchenie {
	

	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner reader = new Scanner(System.in);
			double increase=0.06;
			double cenaobuchenie=10000;
			int years=10;
			for(int a=0; a<years; a++) {
				cenaobuchenie+=cenaobuchenie*increase;
			}
			System.out.println("In " + years + " years the price will be " + cenaobuchenie);
			int additionalYears=4;
			double sum=0;
			for(int a=0; a<additionalYears; a++) {
				cenaobuchenie+=cenaobuchenie*increase;
				sum+=cenaobuchenie;
			}

			System.out.println("Total price in the next " + additionalYears
					+ " will be " + sum);
			reader.close();
		}

}
