package Strategy;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/6/5 2:06
 */
public class OperationAdd implements Strategy {
    @Override
    public void doOperatoion(int num1, int num2) {
        System.out.println("num1 + num2 = " + (num1 + num2));
    }
}
