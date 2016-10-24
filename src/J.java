/**
 * Created by Administrator on 2016/10/24.
 */
public class J {
   //三角形面积
   public static void main(String[] args) {
       area();
       area1(10,2);


       System.out.print(area2(10,2));
   }
    static void area(){
        int a=10;
        int b=2;
        System.out.println(a*b/2);
    }
    static void area1(int a,int b){

        System.out.println(a*b/2);

    }
    static float area2(int a,int b){

        return a*b/2;

    }

}
