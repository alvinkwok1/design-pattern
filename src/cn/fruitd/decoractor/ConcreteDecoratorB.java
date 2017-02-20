package cn.fruitd.decoractor;

/**
 * Created by ll130 on 2017/2/20.
 */
public class ConcreteDecoratorB extends Decorator {
    public void addBehavior() {
        System.out.println("this is B class function");
    }

    @Override
    public void Operation() {
        super.Operation();
        addBehavior();
    }
}
