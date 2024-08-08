package array_programs;

public class LowerUper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] a= {'a','d','i','t','y','a'};
		for(int i=0;i<a.length;i++) {
			if(a[i]>='a' && a[i]<='z') {
				a[i]=(char)(a[i]-32);
			}
		}
		for(char x:a) {
			System.out.print(x+" ");
		}
	}

}
