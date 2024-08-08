package array_programs;

public class Add_two_same {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {11,2,3,7,5,4,5,6,1};
		int b[]= {1,3,6,2,4,6,9};
		
		if(a.length>b.length) {
			for(int i=0;i<b.length;i++) {
				a[i]=a[i]+b[i];
			}
			for(int x:a) {
				System.out.print(x+" ");
			}
		}
		else {
			for(int i=0;i<a.length;i++) {
				b[i]=a[i]+b[i];
			}
			for(int x:b) {
				System.out.print(x+" ");
			}
		}
		
	}

}
