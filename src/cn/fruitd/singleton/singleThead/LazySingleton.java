package cn.fruitd.singleton.singleThead;

/**
 * 延迟加载类型的单例模式，需要用时再加载
 *
 */
public class LazySingleton {

    private Object someProperties;

    private static LazySingleton instance;

    private LazySingleton(Object someArguments) {
        this.someProperties = someArguments;
    }

    public static LazySingleton getInstance() {
        if (instance == null)
            instance = new LazySingleton(new Object());
        return instance;
    }
}
