/**
 * Created by Administrator on 2016/10/30.
 */
public class L {//基本类型的值传递,引用类型的引用传递

    public static void main(String[] args) {
        int i=100;//100付给整数i
        int q=100;//100付给整数q
        {



        }
        q=200;
//        int m=10;
//        half(10);
//        System.out.println(m);

    }

    /**
     *
     * @param m:传值用
     */
    static void half(int m){
        m=m/2;
        System.out.println(m);
    }
}
