/**
 * Created by Administrator on 2016/11/7.
 */
public class V {

    public static void main(String[] args) {
        int []a={5,1,4,6,2,7,9,3};
        int start=0;
        int end=a.length-1;
        quickSort(a,start,end);
        for(int i :a){
            System.out.println(i);
        }
    }
    static void quickSort(int a[] ,int start,int end){
        int i=start;
        int j=end;
        if(i>=j){//i==j退出的是第一个递归，i>j是退出的第二个递归。
            return ;
        }
        boolean flag=true;//true:游标从右到左，flase：游标从左到右
        while(i!=j){//临界值还没有在中间
            if(a[i]-a[j]>0){
                int tmp=0;
                tmp=a[i];
                a[i]=a[j];
                a[j]=tmp;
                flag=!flag;//方向发生改变
            }
            if(flag){//true
              j--;  //游标从右往左
            }else{//false
              i++;//游标从左往右
            }
        }
        i--;
        j++;
        quickSort(a,start,i);//左面小段
        quickSort(a,j,end);//右面小段
    }
}
