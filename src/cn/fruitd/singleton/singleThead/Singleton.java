package cn.fruitd.singleton.singleThead;

/**
 * 类加载后，该单例对象会被直接加载
 */
public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton() {

    }

    private static Singleton getInstance() {
        return instance;
    }

}
