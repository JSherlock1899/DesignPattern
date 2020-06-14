package Adapter;

/**
 * @program: DesignPattern
 * @description: 测试计算机通过SD读卡器读取TF卡
 * @author: Mr.Jiang
 * @create: 2019-06-18 20:02
 **/

public class ComputerReadDemo {
    public static void main(String[] args) {
        Computer computer = new ThinkpadComputer();
        SDCard sdCard = new SDCardImpl();
        System.out.println(computer.readSD(sdCard));
        System.out.println("====================================");
        TFCard tfCard = new TFCardImpl();
        SDCard tfCardAdapterSD = new SDAdapterTF(tfCard);
        System.out.println(computer.readSD(tfCardAdapterSD));
    }
}