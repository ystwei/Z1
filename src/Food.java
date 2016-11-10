/**
 * Created by Administrator on 2016/11/10.
 */
public class Food {

    void modify(String s){
        s="456";
    }

    public static void main(String[] args) {
        Food  f=new Food();
        String s="123";
        f.modify(s);
        System.out.println(s);
    }
}
