import java.util.Arrays;

/**
 * Created by Administrator on 2016/11/3.
 */
public class R {
    public static void main(String[] args) {

        int [] a={2,1,4,7,3};
//
        int key=6;
//
        Arrays.sort(a);
//        //否则返回 (-(插入点) - 1)。插入点 被定义为将键插入数组的那一点：即第一个大于此键的元素索引，
//        //果数组中的所有元素都小于指定的键，则为 a.length。
//        System.out.print(Arrays.binarySearch(a,i));
        System.out.print(erfenFind(key,a));
    }
    static int erfenFind(int key ,int [] a){//手动写二分
        int low=0;//循环的低位索引
        int high=a.length-1;// 循环的高位索引
        while( low<=high){
            int mid=(low+high)/2;//相对中间位置
            if(key<a[mid]){// 关键字小于a[mid],代表必须在mid的左侧查找
                high=mid-1;
            }else if(key>a[mid]){//关键字大于a[mid],代表必须在mid的右侧查找
                low=mid+1;
            }else{
                return mid;//最后终于找到了
            }
        }
        return -1;//并没有找到
    }

}
