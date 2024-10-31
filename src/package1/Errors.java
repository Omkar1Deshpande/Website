package package1;

public class Errors {
	static String spd = "pew pew";
	static {
		System.out.println("Static block");
	}
	
	public static void main(String[] args) {
		System.out.println(spd);
		spd = "goa";
		System.out.println(spd);
		print1();
	}

static void print1() {
	System.out.println(spd);
}
	
}
