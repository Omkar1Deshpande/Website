package package1;

public class Problem1 {

	public static void main(String[] args) {
		int [] Arr = {1, 2, 3, 4, 5, 6};
		int s = 7;

		for(int i=0; i<Arr.length;i++) {
			for(int j=i+1; j<Arr.length; j++)
				if(Arr[i]+Arr[j] == s) {
					System.out.println("["+Arr[i]+","+Arr[j]+"]");
				}

				else {
					continue;
				}

		}

	}
}
