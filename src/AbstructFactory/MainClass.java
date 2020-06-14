package AbstructFactory;

/**
 * @program: DesignPattern
 * @description:
 * @author: Mr.Jiang
 * @create: 2019-07-08 11:06
 **/

public class MainClass {

    public static void main(String[] args) {
        FruitFactory f1 = new NorthFruitFactory();
        Fruit apple = f1.getApple();
        Fruit banana = f1.getBanana();
        apple.get();
        banana.get();
    }
}
