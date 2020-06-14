package Strategy;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/6/5 2:10
 */
public class Test {

    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        context.doOperation(5, 2);
        context = new Context(new OperationSubtract());
        context.doOperation(5, 2);
        context = new Context(new OperationMultiply());
        context.doOperation(5, 2);
        context = new Context((int num1,int num2)->{
            System.out.println("num1 / num2 = " + (num1 / num2));
        });
        context.doOperation(5, 2);

    }
}
