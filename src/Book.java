/**
 * Created by Administrator on 2016/11/14.
 */
public class Book {
//    Book(int age){
//        this();
//        System.out.print(age);
//
//    }
//    void ok(){
//
//    }
//    Book(){
//
//        System.out.print("ok");
//    }
    int i=0;
    Book go(){
        i++;
        return this;
        //return new Book();
    }
    public static void main(String[] args) {
        Book b=new Book();
        b.go().go().go();
        System.out.print(b.i);
    }
}
