package cn.fruitd.adapter.object;

/**
 * 客户端调用类
 */
public class Client {

    public static void main(String[] args) {
        Source source=new Source();
        SourceAdapter adapter=new TargetAdapter(source);
        String result=adapter.service();
        System.out.println(result);
    }
}
