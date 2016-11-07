/**
 * Created by Administrator on 2016/11/7.
 */
public class U {
    public static void main(String[] args) {
        //二分（有序的，Arrays.sort()---冒泡）
        int [] a={4,3,1,6,7,2};
        bubble(a);
        System.out.print(binarySearch(6,a));
    }
    static int binarySearch(int key,int [] a){
        int low=a[0];
        int hi=a.length-1;

        while( low<=hi){
            int mid=(low+hi)/2;
            if(a[mid]-key>0){
               hi=mid-1;

            }else if(a[mid]-key<0){

                low=mid+1;
            }else{
                return mid;
            }

        }
        return -1;

    }
    static void bubble(int [] a){

        for(int i=0;i<a.length-1;i++){

            for(int j=0;j<a.length-1-i;j++){
                int tmp=0;
                if(a[j]-a[j+1]>0){
                    tmp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;

                }

            }
        }

    }




}
