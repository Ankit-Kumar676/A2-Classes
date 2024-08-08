package array_programs;

public class College_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch[]= {'g','a','n','g','a','i','n','s','t','i','t','u','t','e','o','f','t','e','c','h',
				'n','o','l','o','g','y','a','n','d','m','a','n','a','g','e','m','e','n','t'};
		int c=0;
		for(char x:ch) {
			if(x=='a')
				c++;
		}
		System.out.println("A is "+c+" times appearing in college name");
		}
	}


