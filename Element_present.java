package array_programs;

public class Element_present {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		int flag=0;
		int[] a= {2,1,2,13,5,4,6,8};
		for(int x:a) {
			if(num==x) {
				System.out.println("Element present");
				flag=1;
				break;
				
			}
			
		}
		if(flag==0)
		System.out.println("Element not present");
	}

}
