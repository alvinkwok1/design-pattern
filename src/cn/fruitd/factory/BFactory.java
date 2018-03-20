package cn.fruitd.factory;

public class BFactory implements AbstractFactory {
    @Override
    public AbstractProduct create() {
        return new BProduct();
    }
}
