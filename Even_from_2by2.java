package array_programs;
import java.util.Scanner;
public class Even_from_2by2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[2][];
		a[0]=new int[3];
		a[1]=new int[4];
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a[i].length;j++) {
//				if(a[i][j]%2==0)
//					System.out.println(a[i][j]);
//			}
//		}
		
		for(int x[]:a) {
			for(int y:x) {
				if(y%2==0)
				System.out.println(y);
			}
		}
	}

}
