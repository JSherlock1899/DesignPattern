package AbstructFactory;

/**
 * @program: DesignPattern
 * @description:
 * @author: Mr.Jiang
 * @create: 2019-07-08 11:05
 **/

public class SouthFruitFactory implements FruitFactory{
    @Override
    public Fruit getApple() {
        return new SouthApple();
    }

    @Override
    public Fruit getBanana() {
        return new SouthBanana();
    }
}
