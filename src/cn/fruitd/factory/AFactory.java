package cn.fruitd.factory;

public class AFactory extends AbstractFactory {
    @Override
    public AbsctractProduct create(String type) throws Exception {
        if ("A".equals(type)) {
            return new AProduct();
        } else if ("B".equals(type)) {
            return new BProduct();
        } else {
            throw new Exception("no product is created");
        }
    }
}
