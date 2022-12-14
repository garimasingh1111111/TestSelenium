public class Register {

    int x =10;
    public int add(){
        int a =10;
        int b = 20;
        int sum =a+b;

        return sum;
    }
    public static void main (String[] args){
        Register obj = new Register();
        System.out.println(obj.x);
        System.out.println(obj.add());
        System.out.println("This is test1");

    }
    
}
