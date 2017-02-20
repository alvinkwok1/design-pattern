package cn.fruitd.decoractor;

/**
 * Created by ll130 on 2017/2/20.
 */
public class ConcreteComponent implements IComponent {
    @Override
    public void Operation() {
        System.out.println("具体的对象操作");
    }
}
