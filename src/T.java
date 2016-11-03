/**
 * Created by Administrator on 2016/11/3.
 */
public class T {
    public static void main(String[] args) {
        bubbleSort();
    }
    static void bubbleSort(){

        int [] a={1,3,2,5,9,0,12};

        for( int i=0;i<a.length-1;i++){//控制怕j+1越界
            for(int j=0;j<a.length-1-i;j++){//每经过一次循环，最大的数已经在最后了，-i 主要是把后面已经排序的数不用排了
                int tmp=0;
                if(a[j]-a[j+1]>0){//前面比后面大
                    tmp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;

                }

            }

        }

        for(int i :a){
            System.out.println(i);

        }



    }
    static void matrixMulti(){
        int a[][]={{1,6},{3,8}};
        int b[][]={{2,2},{9,7}};

        int c[][]=new int [a.length][a[0].length];

        for(int i=0;i<a.length;i++){//a ---x
            for(int j=0;j<b[0].length;j++){//b---x

                int tmp=0;//临时变量

                for(int k=0;k<b.length;k++){//b---y

                    tmp+=a[i][k]*b[k][j];


                }
                c[i][j]=tmp;


            }

        }

        for(int i[] :c){
            for( int j :i){

                System.out.println(j);
            }



        }

    }
    static void matrixAdd(){

        int a[][]={{1,2,3,5},{5,6,7,8}};
        int b[][]={{1,2,3,5},{5,6,7,8}};

        int c[][]=new int [a.length][a[0].length];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                c[i][j]=a[i][j]+b[i][j];

            }

        }

        for(int i[] :c){

            for(int k :i){
                System.out.println(k);
            }
        }

    }
}
