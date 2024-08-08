package array_programs;

public class Nthelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,1,2,13,7,4,6,8};
		int n=5;
		for(int i=0;i<a.length;i++) {
			if(i+1==n)
				System.out.println(a[i]);
		}
	}

}
