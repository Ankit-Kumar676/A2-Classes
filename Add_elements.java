package array_programs;

public class Add_elements {

	public static void main(String[] args) {
		
//		int a[]= {11,2,3,7,5};
//		int b[]= {1,3,6,2,4,6,9};
//		int c[];
//		if(a.length>b.length) {
//			 c=new int[a.length];
//			 
//			for(int i=0;i<b.length;i++) {
//				c[i]+=b[i];
//				
//			}
//			for(int j=0;j<c.length;j++) {
//				c[j]+=a[j];
//			}
//		}
//		else {
//			c=new int[b.length];
//			for(int i=0;i<a.length;i++) {
//				c[i]+=a[i];
//			}
//			for(int j=0;j<c.length;j++) {
//				c[j]+=b[j];
//			}
//		}
//
//		for(int x:c) {
//			System.out.println(x);
//		}
		
		int a[]= {11,2,3,7,5};
		int b[]= {1,3,6,2,4,6,9};
		int c[];
		 if(a.length>b.length) {
			 c=new int[a.length];
			 for(int i=0;i<c.length;i++) {
				 if(i<b.length)
					 c[i]=a[i]+b[i];
				 else
					 c[i]+=a[i];
			 }
		 }
		 else
		 {
			 c=new int[b.length];
			 for(int i=0;i<c.length;i++) {
				 if(i<a.length)
					 c[i]=a[i]+b[i];
				 else
					 c[i]+=b[i];
			 }
		 }
		 for(int x:c) {
			 System.out.print(x+"  ");
		 }
	}

}
