package Iterator;

/**
 * @program: DesignPattern
 * @description:
 * @author: Mr.Jiang
 * @create: 2019-06-26 20:35
 **/

public class IteratorTest {

    public static void main(String[] args) {

        List list=new ConcreteAggregate();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        Iterator it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}