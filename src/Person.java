/**
 * Created by Administrator on 2016/11/14.
 */
public class Person {
    private Hand h;
    Person(){
      h=new Hand();//同时出生，组合Composite
    }
    private Computer c;
    public void setC(Computer c1){//设置Computer,聚合
        c=c1;
    }

    public static void main(String[] args) {
        Person p=new Person();//实例化,组合，person生，hand必须生

        Computer c1=new Computer();//聚合：只有person调用它，他才生。
        p.setC(c1);//聚合

    }
}
class Hand{

}
class Computer{//Aggregation:聚合

}