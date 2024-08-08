class Array8
{
public static void main(String[] args){
boolean[] a;
a=new boolean[5];
System.out.println(a);
System.out.println(a[0]);
System.out.println(a[1]);
System.out.println(a[2]);
System.out.println(a[3]);
System.out.println(a[4]);
a[0]=true;
a[1]=true;
a[2]=true;
a[3]=false;
a[4]=true;
System.out.println(a[0]);
System.out.println(a[1]);
System.out.println(a[2]);
System.out.println(a[3]);
System.out.println(a[4]);
System.out.println();

boolean[] b={true,false,true,true,false};
System.out.println(b[0]);
System.out.println(b[1]);
System.out.println(b[2]);
System.out.println(b[3]);
System.out.println(b[4]);
}

}