package cn.fruitd.adapter.classextends;

/**
 * 客户端调用类
 */
public class Client {

    public static void main(String[] args) {
        SourceAdapter adapter=new TargetAdapter();
        String result=adapter.service();
        System.out.println(result);
    }
}
