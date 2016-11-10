/**
 * Created by Administrator on 2016/11/7.
 */
public class Student {

    public static void main(String[] args) {
//        Student s=new Student();//把类变成对象，默认构造器是自动存在的。
//        Student s1=s;
//        System.out.println(s);
//        System.out.println(s1);
//        s.setName("Json");//赋值
//        System.out.print("我的名字叫："+s1.getName());//取值
        Student s1;

    }
    Student(){
        System.out.print(1);
        name="alice";
    }
    Student(int old,int old1,int old2,int old3){
    }
    String name;//attribute 卫昆
    int old;
    char sex;
    String getAddress() {
        return address;
    }
    void setAddress(String address) {
        this.address = address;
    }

    String address;
    int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    String getName(){//告诉给别人，读
        System.out.print(3);
        return name;
    }

    void setName(String name1){//我的名字改了，
        System.out.print(2);
        name=name1;
    }
}
