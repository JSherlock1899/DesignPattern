package Adapter;

/**
 * @program: DesignPattern
 * @description:创建TF卡实例
 * @author: Mr.Jiang
 * @create: 2019-06-18 20:06
 **/

public class TFCardImpl implements TFCard {

    @Override
    public String readTF() {
        String msg ="tf card reade msg : hello word tf card";
        return msg;
    }
    @Override
    public int writeTF(String msg) {
        System.out.println("tf card write a msg : " + msg);
        return 1;
    }
}
