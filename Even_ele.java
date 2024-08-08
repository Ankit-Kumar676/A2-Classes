package array_programs;

public class Even_ele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,1,2,13,5,4,6,8};
		int c=0;
		for(int x:a) {
			if(x%2==0) {
				c++;
				System.out.println(x);
		}
			

	}
		System.out.println("Number of even elements: "+c);

}
}
