import java.util.Date;

/**
 * Created by Administrator on 2016/11/10.
 */
public class Animal {
    void modify(Date d){//修改
        d.setYear(118);//1900
        System.out.print(d);
    }

    public static void main(String[] args) {
        Animal a=new Animal();

        Date d=new Date();

        System.out.print(d);
        a.modify(d);

        System.out.println(d);
    }
}
