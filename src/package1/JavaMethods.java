package package1;

public class JavaMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fun1("Omkar", 29);
		System.out.println(Fun2(4,5));
		System.out.println(Fun2(1,2,3));
	}
	
	static void Fun1(String str, int i) {
		System.out.println("I am " + str +"." + " I am " + i +" years old.");
	}
	
	static int Fun2(int i, int j) {
		int add =0;
		add = i+j;
		return add;
	}
	
	static int Fun2(int i, int j, int k) {
		int mul =0;
		mul = i*j*k;
		return mul;
	}
	
	

}
