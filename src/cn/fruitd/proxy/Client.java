package cn.fruitd.proxy;

public class Client {
    public static void main(String[] rags) {
        Subject proxy = new ProxyObject();
        proxy.service();
    }
}
