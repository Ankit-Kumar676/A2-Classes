
public class Leapyear {
    public static void main(String[] args) {
       

       int y = 2104;
       if (y%400==0 || y%4==0 && y%100!=0 ){
        System.out.println("leap year");
       }
       else{
        System.out.println("not leap year");
       }
        
    }

    
}
