package FactoryMethod;

/**
 * @program: DesignPattern
 * @description:
 * @author: Mr.Jiang
 * @create: 2019-07-07 12:08
 **/

public class BananaFactory implements FruitFactory{

    @Override
    public Fruit getFruit() {
        return new Banana();
    }
}
