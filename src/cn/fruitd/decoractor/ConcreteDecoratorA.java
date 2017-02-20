package cn.fruitd.decoractor;

/**
 * Created by ll130 on 2017/2/20.
 */
public class ConcreteDecoratorA extends Decorator {
    /**
     * special function of ConcreteDecoratorA,used to distinguish ConcreteDecoratorB
     */
    private String addedState;

    /**
     * if the first excuting the function operation() of origin component equivalent to decorate
     * origin component
     */
    @Override
    public void Operation() {
        super.Operation();
        addedState = "this is A class function";
        System.out.println(addedState);
    }
}
