/**
 * Created by Administrator on 2016/11/14.
 */
public class W extends W0{
    W(){
        System.out.print("me");
    }
    public static void main(String[] args) {
        new W();

    }
}
class W0 extends W00{
    W0(){
        System.out.print("Parent");
    }
}
class W00{
    W00(){
        System.out.print("Grandpa");
    }
}
