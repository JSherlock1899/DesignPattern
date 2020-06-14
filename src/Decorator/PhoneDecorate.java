package Decorator;

/**
 * @program: DesignMode
 * @description:
 * @author: Mr.Jiang
 * @create: 2019-06-17 21:22
 **/

// 装饰器，实现接口
public abstract class PhoneDecorate implements Phone {

    // 以组合(构造函数传递)的方式来获取默认实现类
    private Phone phone;
    public PhoneDecorate(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void call() {
        phone.call();
    }
}
