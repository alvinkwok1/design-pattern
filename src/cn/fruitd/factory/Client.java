package cn.fruitd.factory;

public class Client {

    public static void main(String[] args) throws Exception {
        //创建工厂
        AbstractFactory factory = new AFactory();
        //创建产品
        AbsctractProduct producta = factory.create("A");
        AbsctractProduct productb = factory.create("B");

        producta.use();
        productb.use();
    }
}
