package cn.fruitd.proxy;

/**
 * 被代理类，完成实际的业务操作
 */
public class RealObject implements Subject {
    @Override
    public String service() {
        //do something
        String result = "result";
        return result;
    }
}
