package FactoryMethod;

/**
 * @program: DesignPattern
 * @description:
 * @author: Mr.Jiang
 * @create: 2019-07-06 23:22
 **/

public class MainClass {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        //获得苹果工厂
        FruitFactory appleFactory = new AppleFactory();
        //获得实例对象
        Fruit apple = appleFactory.getFruit();
        FruitFactory bananaFactory = new BananaFactory();
        Fruit banana = bananaFactory.getFruit();
    }
}
