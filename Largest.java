package array_programs;

public class Largest {
 public static void main(String[] args) {
	 int[] a= {2,1,2,13,5,4,6,81};
	 int largest=0;
	 for(int x:a) {
		 if(x>largest)
			 largest=x;
	 }
	 System.out.println(largest);
}
}
