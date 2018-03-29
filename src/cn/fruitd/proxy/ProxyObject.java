package cn.fruitd.proxy;

public class ProxyObject implements Subject {

    private Subject obj;

    public ProxyObject() {
        this.obj = new RealObject();
    }

    @Override
    public String service() {
        String result = "";
        //do something before call real method
        before();

        result = this.obj.service();
        System.out.println(result);
        //do something after call method
        after();
        return result;
    }

    public void before() {
        System.out.println("call method before");
    }

    public void after() {
        System.out.println("call method after");
    }
}
