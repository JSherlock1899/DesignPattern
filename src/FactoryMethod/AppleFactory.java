package FactoryMethod;

/**
 * @program: DesignPattern
 * @description:
 * @author: Mr.Jiang
 * @create: 2019-07-07 12:06
 **/

public class AppleFactory implements FruitFactory{

    @Override
    public Fruit getFruit() {
        return new Apple();
    }
}
