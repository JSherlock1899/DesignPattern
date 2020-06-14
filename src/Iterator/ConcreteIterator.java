package Iterator;



/**
 * @program: DesignPattern
 * @description:定义具体迭代器角色(Concrete Iterator)
 * @author: Mr.Jiang
 * @create: 2019-06-26 20:34
 **/

public class ConcreteIterator implements Iterator {
    private List list = null;
    private int index;

    public ConcreteIterator(List list) {
        super();
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (index >= list.getSize()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Object object = list.get(index);
        index++;
        return object;
    }

}
