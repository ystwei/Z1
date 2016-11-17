/**
 * Created by Administrator on 2016/11/17.
 */
public class Z extends Z0{

    @Override//重写注解
    void go() {
        System.out.println("考大学，但是考上了");
    }

    @Override
    public String toString() {
        return "我这里面有私有成员如下：name,old,go()";
    }

    public static void main(String[] args) {
       System.out.println(new Z());
    }


}
class Z0 extends  Z00{
    @Override
    void   go(){
        System.out.println("考大学，但是没考上");

    }



    protected void   go(int old){
        System.out.println("考大学，但是没考上");

    }
}
class Z00{
    void go(){
        System.out.println("考小学！");
    }
}