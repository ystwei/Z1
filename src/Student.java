/**
 * Created by Administrator on 2016/11/7.
 */
public class Student {

    public static void main(String[] args) {
//        Student s=new Student();//�����ɶ���Ĭ�Ϲ��������Զ����ڵġ�
//        Student s1=s;
//        System.out.println(s);
//        System.out.println(s1);
//        s.setName("Json");//��ֵ
//        System.out.print("�ҵ����ֽУ�"+s1.getName());//ȡֵ
        Student s1;

    }
    Student(){
        System.out.print(1);
        name="alice";
    }
    Student(int old,int old1,int old2,int old3){
    }
    public String name;//attribute ���� default
    private int old;
    private char sex='Ů';
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    private String address;
    public int getOld() {
        return this.old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public char getSex() {
        return this.sex;
    }

    public void setSex(char sex) {
        if(sex!='Ů'){
            this.sex = 'Ů';
            System.out.println("��ɵ�ư���");
        }

    }

    String getName(){//���߸����ˣ���
        System.out.print(3);
        return name;
    }

    void setName(String name1){//�ҵ����ָ��ˣ�
        System.out.print(2);
        name=name1;
    }
}
