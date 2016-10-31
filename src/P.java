/**
 * Created by Administrator on 2016/10/31.
 */
public class P {

    public  static void main(String[] args) {
//        for(int i=0;i<10;i++){
//            if(i==5){
//                return;//返回
//            }
//            System.out.print(i);
//        }
//        System.out.println("ok");

        //int  a []={1,2,3,4,5};//引用类型
//        char a[]=new char[10];//规定栈多大，10个元素，0---9\u0000
//        int b[]=new int[10];
//        b[10]=100;//
//        String s[]={"AC","AB","AE"};
//        //a=null;
//        //s=null;
//        System.out.println(a[1]);
//        int [] b=new int[200];
//
//        for(int i=0;i<200;i++){
//            b[i]=i*2;
//            System.out.println(b[i]);
//        }
        int a[]={4,1,5,7,8,20,5};

//        for( int i=0 ;i<6  ; i++){//遍历，迭代 iterator
//            System.out.println(a[i]);
//        }
//        int i=0;
//        while(i<6){
//            System.out.println(a[i]);
//            i++;
//        }
//        int j=0;
//        do{
//            System.out.println(a[j]);
//            j++;
//        }while(j<6);
        //field attribute prroperty
        for( int i=0 ;i<a.length  ; i++){//遍历，迭代 iterator//又读又写
           a[i]=0;
        }
//        for(int k  : a ){//速度快，只读的。
//            k=0;
//        }
        for( int i=0 ;i<a.length  ; i++){//遍历，迭代 iterator
            System.out.println(a[i]);
        }
    }
}
