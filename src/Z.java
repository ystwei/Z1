/**
 * Created by Administrator on 2016/11/17.
 */
public class Z extends Z0{

    @Override//��дע��
    void go() {
        System.out.println("����ѧ�����ǿ�����");
    }

    @Override
    public String toString() {
        return "����������˽�г�Ա���£�name,old,go()";
    }

    public static void main(String[] args) {
       System.out.println(new Z());
    }


}
class Z0 extends  Z00{
    @Override
    void   go(){
        System.out.println("����ѧ������û����");

    }



    protected void   go(int old){
        System.out.println("����ѧ������û����");

    }
}
class Z00{
    void go(){
        System.out.println("��Сѧ��");
    }
}