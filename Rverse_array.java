package array_programs;

public class Rverse_array {

	public static void main(String[] args) {
		int[] a= {2,3,4,5,6,8,11};
		int start=0;
		int end=a.length-1;
		while(start<end) {
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
		for(int x:a) {
			System.out.print(x+" ");
	}
	
		
	}
}


