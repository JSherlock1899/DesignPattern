package Decorator;

/**
 * @program: DesignMode
 * @description:
 * @author: Mr.Jiang
 * @create: 2019-06-17 21:25
 **/

public class Test {

    public static void main(String[] args) {
        //创建出最原始的实现类
        Phone phone = new IphoneX();

        //装饰成打电话之后可以听音乐
        phone = new MusicPhone(phone);

        //装饰成打电话之前可以通知当前时间
        phone = new GiveCurrentTimePhone(phone);

        phone.call();
    }
}
