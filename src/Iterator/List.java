package Iterator;

/**
 * @program: DesignPattern
 * @description:定义容器角色(Aggregate)
 * @author: Mr.Jiang
 * @create: 2019-06-26 20:34
 **/

//定义集合可以进行的操作
public interface List {

    public void add(Object obj);
    public Object get(int index);
    public Iterator iterator();
    public int getSize();
}