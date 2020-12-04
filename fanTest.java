package domashnoit;
import java.util.Scanner;

public class fanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan[] fans = new Fan[2];
		Scanner sc = new Scanner(System.in);
		
		fans[0] = new Fan();
		fans[1] = new Fan();
		
		fans[0].setSpeed(3);
		fans[0].switchOn();
		fans[0].setRadius(10);
		fans[0].setColor("Yellow");
		
		fans[1].setSpeed(2);
		fans[1].switchOff();
		fans[1].setRadius(5);
		fans[1].setColor("Blue");
		
		System.out.println(fans[0].toString());
		System.out.println(fans[1].toString());
		
		sc.close();
	}

}