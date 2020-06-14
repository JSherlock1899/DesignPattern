package Decorator;

/**
 * @program: DesignMode
 * @description:
 * @author: Mr.Jiang
 * @create: 2019-06-17 21:21
 **/

public class IphoneX implements Phone {


    @Override
    public void call() {
        System.out.println("打电话给周围的人");
    }
}
