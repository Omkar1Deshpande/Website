package package1;

import java.util.Scanner;

public class Areas {

	public static void main(String[] args) {
//		Circle cr = new Circle(4);
//		System.out.println("Value of Pi = "+cr.Pi);
//		cr.Area();
//		cr.Circumference();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length = ");
		double l = sc.nextDouble();
		System.out.print("Enter Breadth = ");
		double b = sc.nextDouble();

		Rectangle rec = new Rectangle(b, l);
		rec.Area();
		rec.Diagonal();
		rec.Perimeter();

		sc.close();


	}

}
