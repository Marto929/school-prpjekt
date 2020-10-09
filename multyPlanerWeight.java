package domashno;

import java.util.Scanner;

import javax.swing.JOptionPane;
public class multyPlanerWeight {
	

	

	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your weight");
			double weight = (double) sc.nextDouble();
			String [] acceptableValues = {"Mercury", "Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
			String input = (String) JOptionPane.showInputDialog(null,
					"Choose a planet.", "Answer please", 2, null, acceptableValues, acceptableValues[0]);
			if(input=="Mercury") weight*=0.38;
			if(input=="Venus") weight*=0.91;
			if(input=="Mars") weight*=0.38;
			if(input=="Jupiter") weight*=2.36;
			if(input=="Saturn") weight*=0.92;
			if(input=="Uranus") weight*=0.89;
			if(input=="Neptune") weight*=1.13;
			System.out.println("Your weight on " + input + " would be " + weight + ".");
			sc.close();
		}

}
