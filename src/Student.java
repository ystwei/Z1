/**
 * Created by Administrator on 2016/11/7.
 */
public class Student {

    public static void main(String[] args) {

        Student s=new Student();//把类变成对象
        s.setName("Json");//赋值

        System.out.print(s.getName());//取值


    }

    Student(){//构造器，初始化用的。
        sex='女';
        old=0;
        name="李XXX";

    }
    String name;//attribute 卫昆
    int old;
    char sex;

    String getName(){//告诉给别人，读

        return name;
    }

    void setName(String name1){//我的名字改了，

        name=name1;
    }
}
