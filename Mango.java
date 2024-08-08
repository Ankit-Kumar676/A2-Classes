public class Mango extends Fruit {
    int h;
    boolean d;
    public static void main(String[] args) {
        
        
        Fruit k = null;


switch(2){
    case 1:
     k = new Mango();//upcastimg
case 2:
     k= new Apple();
}






        if(k instanceof Mango){
            Mango v = (Mango) k;
            System.out.println("1");
        }else if (k instanceof Apple) {
             k = (Apple) k; //downcasting
            System.out.println("2");
        }else{
            System.out.println("qwerty");
        }

        // Jitter a=new Jitter();
        // Kit q = new Kit();
        // System.out.println(q.d);
        // System.out.println(k.d);
        // System.out.println(a.d);
        // k.d;

    }

}
