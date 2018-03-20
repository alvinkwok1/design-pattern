package cn.fruitd.factory;

public class Client {

    public static void main(String[] args) throws Exception {
        //创建工厂
        AbstractFactory afactory = new AFactory();
        AbstractFactory bfactory = new BFactory();


        AbstractProduct productA = afactory.create();
        AbstractProduct productB = bfactory.create();

        productA.use();
        productB.use();

    }
}
