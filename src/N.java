/**
 * Created by Administrator on 2016/10/30.
 */
public class N {
    public static void main(String[] args) {
//        int age=2016;
//        if(((age%4==0)&&(age%100!=0))||(age%400==0)){
//
//
//        }else{
//
//        }

        int month=12;// 12 1 2 冬季 3 4 5： spring
        String name="mike";//byte int short long
        switch(month){
            case 1:
            case 12:
            case 2:
                System.out.println("围炉赏雪");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春暖花开");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏日炎炎");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋风瑟瑟");
                break;
            default:

                System.out.println("没有该月份！");

        }

    }
}
