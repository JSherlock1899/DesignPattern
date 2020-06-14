package SimpleFactory;

/**
 * @program: DesignPattern
 * @description:
 * @author: Mr.Jiang
 * @create: 2019-07-06 23:22
 **/

public class MainClass {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
//        Apple apple = new Apple();
//        Banana banana = new Banana();
//
//        apple.get();
//        banana.get();

//          Fruit apple = new Apple();
//          Fruit banana = new Banana();
//          apple.get();
//          banana.get();

//        Fruit apple = FruitFactory.getApple();
//        Fruit banana = FruitFactory.getBanana();
//        apple.get();
//        banana.get();
        Fruit apple = FruitFactory.getFruit("Apple");
        Fruit banana = FruitFactory.getFruit("Banana");
        apple.get();
        banana.get();
    }
}
