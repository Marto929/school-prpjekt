package domashno;

	import java.util.Scanner;

	public class Paint {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner reader = new Scanner(System.in);
			System.out.println("What's the height of the room?");
			double height = reader.nextDouble();
			System.out.println("What's the length of the room?");
			double length = reader.nextDouble();
			System.out.println("What's the width of the room?");
			double width = reader.nextDouble();
			double surface = 2*height*width+2*height*length+length*width;
			int money=0,b1=0,b2=0;
			while(surface>90) {
				money+=15;
				surface-=140;
				b1++;
			}
			while(surface>0) {
				money+=4;
				surface-=30;
				b2++;
			}
			System.out.println(b1 + " 5-liter buckets needed and " + b2
					+ " 1-liter buckets needed.");
		}

}
