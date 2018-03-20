package cn.fruitd.creator;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new RealBuilder();
        director.creator(builder);
        Product product = builder.getResult();
        product.use();
    }
}
