import java.util.*;
class S{
    public static void main(String[]ar){
        System.out.println("Aviable Phones are ");
        System.out.println("1 for Samsung");
        System.out.println("2 for Redmi");
        System.out.println("3 for vivo");
        String s="Samsung";
        String r="Redmi";
        String v="Vivo";
        int ram=0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your Choice : ");
        //String j=sc.next();//.charAt(0);
        int j=sc.nextInt();
        if(j==1){
            System.out.println("Phone :"+s);
            System.out.println("Choose the Ram : 6(gb) or 8(gb)");
            ram=sc.nextInt();
            if(ram==6){
                System.out.println("RAM :"+ram+"GB");
                System.out.print("128GB internal memory");

            }else if(ram==8){
                System.out.println("RAM :"+ram+"GB");
                System.out.print("256GB internal memory");


            }else{
                System.out.println("Not Available");
            }

        }else if(j==2){
            System.out.println("Phone :"+r);
            System.out.println("Choose the Ram : 6(gb) or 8(gb)");
            ram=sc.nextInt();

            if(ram==6){
                System.out.println("RAM :"+ram+"GB");
                System.out.print("128GB internal memory");

            }else if(ram==8){
                System.out.println("RAM :"+ram+"GB");
                System.out.print("256GB internal memory");


            }else{
                System.out.println("Not Available");
            }
        }else if(j==3){
            System.out.println("Phone :"+v);
            System.out.println("Choose the Ram : 6(gb) or 8(gb)");
            ram=sc.nextInt();
            if(ram==6){
                System.out.println("RAM :"+ram+"GB");
                System.out.print("128GB internal memory");

            }else if(ram==8){
                System.out.println("RAM :"+ram+"GB");
                System.out.print("256GB internal memory");


            }
            else{
                System.out.println("Not Available");
            }
            
        }
        else{
            System.out.println("other Phones options are Unavailable right now");
        }

    }
}
// class A extends S{
//     public static void main(String[] args) 
//     {
//         S s=new S();
//         A a = new A();
//         S sa=new A();//upcasting
//         A sa1=a;//upcasting
//         A a1= (A)sa1;//downcasting
//         A a2= (A)sa;//downcasting


 
//     }
// }


class V{
   static V va = new V();
    int n=12;
    static int q=13;

    public void m1(){
       
       System.out.println(va.n); 
        System.out.println(q);
        m2();
    }
    public static void m2(){
        System.out.println(va.n); 
        System.out.println(q);
        va.m1();
    }
    public static void main(String[] args) {
      //  V vaa = new V();
      m2();
        
    }
}