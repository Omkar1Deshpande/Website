package package1;

public class Rectangle {
	
	double breadth;
	double length;
	
	public Rectangle(double b, double l) {
		breadth = b;
		length = l;
	}
	
	public void Area() {
		System.out.println("Area of Rectangle = " + breadth*length);
	}
	
	public void Perimeter() {
		System.out.println("Perimeter of Rectangle = " + 2*(breadth+length));
	}
	
	public void Diagonal() {
		System.out.println("Diagonal of Rectangle = "+Math.sqrt(breadth*breadth+length*length));
	}

}
