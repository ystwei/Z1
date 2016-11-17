/**
 * Created by Administrator on 2016/11/17.
 */
public class MyCar {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed>60){

            this.speed=40;
            System.out.print("你超速了，限制在40公里");
        }else{
            this.speed = speed;//正常速度
        }

    }
}
