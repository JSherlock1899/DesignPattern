package Adapter;

/**
 * @program: DesignPattern
 * @description:创建一个计算机实例，实现计算机接口，并实现其读取SD卡方法
 * @author: Mr.Jiang
 * @create: 2019-06-18 20:01
 **/

public class ThinkpadComputer implements Computer {

    @Override
    public String readSD(SDCard sdCard) {
        if(sdCard == null)throw new NullPointerException("sd card null");
        return sdCard.readSD();
    }
}
