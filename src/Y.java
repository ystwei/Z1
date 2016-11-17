/**
 * Created by Administrator on 2016/11/17.
 */
public class Y extends Y0{
    static int old=100;//1
    Y(){
        super(100);
        System.out.println("1");
    }
    Y(int age){     //4721
        this();
        System.out.println("8");//457218  452718
    }
    public static void main(String[] args) {
        System.out.print(new Y());
    }
    {
        System.out.println("2");
    }

}
class Y0{
    Y0(int age){
        System.out.println("7");
    }
    Y0(){
        System.out.println("5");
    }
    {
        System.out.println("4");
    }


}
