package Adapter;

/**
 * @program: DesignPattern
 * @description: SD卡接口的实现类，模拟SD卡的功能
 * @author: Mr.Jiang
 * @create: 2019-06-18 20:03
 **/

public class SDCardImpl implements SDCard {

    @Override
    public String readSD() {
        String msg = "sdcard read a msg :hello word SD";
        return msg;
    }
    @Override
    public int writeSD(String msg) {
        System.out.println("sd card write msg : " + msg);
        return 1;
    }
}
