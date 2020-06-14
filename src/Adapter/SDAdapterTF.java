package Adapter;

/**
 * @program: DesignPattern
 * @description: 创建SD适配TF （也可以说是SD兼容TF，相当于读卡器）：  实现SDCard接口，
 * 并将要适配的对象作为适配器的属性引入。
 * @author: Mr.Jiang
 * @create: 2019-06-18 20:07
 **/

public class SDAdapterTF implements SDCard {

    private TFCard tfCard;
    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }
    @Override
    public String readSD() {
        System.out.println("adapter read tf card ");
        return tfCard.readTF();
    }
    @Override
    public int writeSD(String msg) {
        System.out.println("adapter write tf card");
        return tfCard.writeTF(msg);
    }
}
