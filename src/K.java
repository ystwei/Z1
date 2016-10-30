/**
 * Created by Administrator on 2016/10/30.
 */
public class K {
    //圆的面积
    public static void main(String[] args) {
        getArea(2);

        System.out.println( getArea1(2));

        getArea2();
    }
    //1有形参，无返回
    static void getArea(int r){//r
        System.out.println(3.14*r*r);

    }
    /*
        byte (8 )short(16) int(32) long(64):1L.  1999 1999.0
        float(32) double(64)
        char(16)--[0----65535]
        boolean(1)

     */
    //2有形参，有返回

    /**
     *
     * @param r
     * @return:
     */
    static float getArea1(int r){// double 3.1415936 float 3.14
        return 1l;//java默认类型地double
    }
    //3无形参，无返回
    static void getArea2(){
        int r=2;
        System.out.print(3.14*r*r);
    }

}
