package SimpleFactory;

/**
 * @program: DesignPattern
 * @description:
 * @author: Mr.Jiang
 * @create: 2019-07-06 23:45
 **/

public class FruitFactory {

    /**
     * 获得Apple实例
     */
    public static Fruit getApple(){
        return new Apple();
    }

    /**
     * 获得Banana实例
     */
    public static Fruit getBanana(){
        return new Banana();
    }

    /**
     * 获得所有产品
     */
    public static Fruit getFruit(String type) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
//        if ("apple".equalsIgnoreCase(type)){
//            return Apple.class.newInstance();
//        }else if("banana".equalsIgnoreCase(type)){
//            return Banana.class.newInstance();
//        }else {
//            System.out.println("Not Found!");
//            return null;
//        }
        Class fruit = Class.forName("SimpleFactory." + type);
        return (Fruit) fruit.newInstance();
    }

}
