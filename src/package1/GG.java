package package1;

//import java.io.*;
import java.util.* ;

public class GG{

	@SuppressWarnings("resource")
	public static void main(String[] args){
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter Length of Array = ");
				int len = sc.nextInt();
				System.out.print("Enter Sum = ");
				int Sum = sc.nextInt();
				int arr[] = new int[len];
				for(int i=0; i<len; i++){
					arr[i] = sc.nextInt();
				}

		List<int[]> printInt = pairSum(arr, Sum);
		printInt.sort(Comparator.comparingInt(arr2 -> arr2[0]));
		
		 for (int[] array : printInt) {
	            System.out.println(Arrays.toString(array));
	        }

	}
	public static List<int[]> pairSum(int[] arr, int s) {
		List<int[]> Arrlist = new ArrayList<>();
		for(int i=0; i<arr.length;i++){
			for(int j=i+1; j<arr.length;j++){
				if(arr[i]+arr[j] == s) {
					int[] arr12 = {arr[i] ,arr[j]};
					Arrlist.add(arr12);
					Arrays.sort(arr12);
				}
				else {
					continue;
				}
			}	
		}
		return Arrlist;
	}
}

