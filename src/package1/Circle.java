package package1;

public class Circle {

	double Pi = 3.1415;
	double rad;
	
	public Circle(double x){
		rad = x;
	}
	
	public void Area() {
		System.out.println("Area of Circle = "+ Pi*rad*rad);
	}
	
	public void Circumference()
	{
		System.out.println("Circumference of Circle = "+ 2*Pi*rad);
	}

}
