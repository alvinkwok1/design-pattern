package cn.fruitd.decoractor;

/**
 * Created by ll130 on 2017/2/20.
 */
public class Decorator implements IComponent {

    protected IComponent component;

    public void setComponent(IComponent component) {
        this.component = component;
    }

    @Override
    public void Operation() {
        if (component != null) {
            component.Operation();
        }
    }
}
