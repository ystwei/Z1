/**
 * Created by Administrator on 2016/11/14.
 */
public class X extends X0{
    public static void main(String[] args) {
        new X(200);
    }
    X(){
      super(100);
    }
    X(int age){
        super();
    }
//    void go(){//覆盖，重写 override
//        super.go();
//        System.out.print("我上大学了！");
//    }
}
class X0 extends X00{
    X0(){
        this(200);
        System.out.print("ooo");
    }
    X0(int age){
        System.out.print(age);
    }
//    void go(){
//        super.go();
//        System.out.print("我上不去了！");
//    }

}
class X00{
    X00(){

    }


//    void go(){
//        System.out.print("我小学刚毕业！");
//    }
}
