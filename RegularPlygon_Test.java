package domashnoit;

import java.util.Scanner;

public class RegularPlygon_Test {
	
	    public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

	        RegularPolygon polygon1 = new RegularPolygon();
	        RegularPolygon polygon2 = new RegularPolygon(6, 4);
	        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

			System.out.println(polygon1.getPerimeter() + " " + polygon1.getArea());
			System.out.println(polygon2.getPerimeter() + " " + polygon2.getArea());
			System.out.println(polygon3.getPerimeter() + " " + polygon3.getArea());

	    }
	}


