/**
 * Created by Administrator on 2016/11/3.
 */
public class S {
    public static void main(String[] args) {
//        int [][] a={
//                {1,2,3,4,5,6},
//                {7,8,9,10}
//        };
////        for(int i=0;i<a.length;i++){//行
////            for(int j=0;j<a[i].length;j++){
////                System.out.print(a[i][j]);
////            }
////            System.out.println();
////        }
//        for( int [] i : a ){//for each
//            for( int j :i){
//                System.out.print(j);
//            }
//            System.out.println();
//        }


//        int [][] b=new int[2][3];
//        int [][] c=new int[2][];
//        c[0]=new int[2];//第0行有2列 [0][0] [0][1]
//        c[1]=new int[3];//第1行有3列 [1][0] [1][1] [1][2]
        /*
                000
                000

         */

        //System.out.print(b[1][2]);


        int [][][]a={{{1,2,3,5,6}},{{7,8,9},{10,11},{13,12}},{{20}},{{22,23},{24,35,31}}};
       for(int i=0;i<a.length;i++){
           for(int j=0;j<a[i].length;j++){
               for(int k=0;k<a[i][j].length;k++){

                    System.out.println(a[i][j][k]);
               }

           }

       }

        for( int [][]i :a){

            for(int [] j  :i){
                for( int  k:j){

                    System.out.println(k);
                }

            }
        }


    }
}
