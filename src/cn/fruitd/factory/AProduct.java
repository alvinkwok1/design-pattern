package cn.fruitd.factory;

public class AProduct extends AbstractProduct {

    public AProduct(){
        System.out.println("A product is created by product");
    }

    @Override
    public void use() {
        System.out.println("A product is using");
    }
}
