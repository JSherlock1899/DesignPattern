package Strategy;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/6/5 2:08
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doOperation(int num1, int num2) {
        this.strategy.doOperatoion(num1, num2);
    }
}
