import java.util.Arrays;//include using

/**
 * Created by Administrator on 2016/10/31.
 */
public class Q {
    static void max(){//找出数组中的最大元素
        int [] a={1,2,3,4,6};
        int m=a[0];//最大值
        for(int i=1;i<a.length;i++){
            if(a[i]-m>0){//a[i]>m
                m=a[i];
            }

        }
        System.out.print(m);
    }


    static void reverse1() {//颠倒数组
        int [] a={1,2,3,4,6};
        int [] b=new int[a.length];
        int j=0;
        for(int i=a.length-1;i>=0;i--){
            b[j]=a[i];
            j++;
        }
        for(int k  :b){
            System.out.println(k);
        }

    }
    static void copy3(){//description: destination
        int a[]={1,2,3,4,5};
        int b[]={6,7,89,10,11,222,333};//堆不能改变
        System.arraycopy(a,2,b,3,2);

        for(int i :b){
            System.out.println(i);
        }
    }

    static void copyOf(){
        int a[]={1,2,3,4,5,6};

        int b[]=Arrays.copyOf(a,10);

        for(int k  :b){
            System.out.println(k);
        }
    }
    static void fill(){
        int a[]=new int[10];

        Arrays.fill(a,9);
        for(int k  :a){
            System.out.println(k);
        }

    }

    static void reverse2() {//正宗颠倒数组
        int [] a={1,2,3,4,6};
        int n=a.length;
        for(int i=0;i<n/2;i++){
            int tmp=a[i];
            a[i]=a[n-1-i];
            a[n-1-i]=tmp;
        }
        for(int k  :a){
            System.out.println(k);
        }

    }
    static void sort() {//复制数组
        int [] a={4,1,2,8,3,6,5};
        Arrays.sort(a);
        for(int i :a){
            System.out.println(i);
        }

    }
    static void copy(){//复制数组
        int [] a={1,2,3,4,6};
        int [] b=new int[a.length];//开个和a一样大小堆的空间，给b
        for( int i=0;i<a.length;i++){

            b[i]=a[i];
        }
        a[2]=100;
//        for( int i=0;i<b.length;i++){
//            System.out.println(b[i]);
//        }

        System.out.println(b[2]);

    }
    static void avg(){//计算数组平均值
        int [] a={1,2,3,4,6};
        double sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.print(sum/a.length);

    }
    public static void main(String[] args) {
       //max();
        copyOf();
    }
}
