import java.util.Scanner;
Class Document	{
	
	public static int add(int n, int m){
	return n+m;
	}
	public static void main(String [] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter First Number");
	int n=sc.nextInt();
	System.out.println("Enter Second Number");
	int m= sc.nextInt();
	add(n,m);
	}

}