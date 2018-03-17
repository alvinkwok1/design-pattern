#单例模式
####创建型设计模式
单例模式的目的是为了对象只会被初始化一次，只后都直接使用该对象。
可以用在那些地方：一些公共工具类。

单线程下的单例模式：
1. 饿汉模式
2. 懒汉模式

###饿汉模式
饿汉模式也就是在类加载的时候就被直接初始化,用不到的情况也可能会创建对象，会造成内存空间的浪费
###懒汉模式
其实也就是所谓的延时加载，需要用时再创建对象。

###多线程下的单例模式
多线程下的单例模式有多种，本项目中只提到了两种。
1. 通过同步的方式创建单例模式
2. 通过内部静态类的方式创建单例对象达到延时创建的要求。

先说第一种
```java
public class SyncSingleton {

    private static SyncSingleton instance = null;

    private SyncSingleton() { }

    public static synchronized SyncSingleton SyncSingleton() {
        if (instance == null)
            instance = new SyncSingleton();
        return instance;
    }
}
```
这种是懒汉模式的多线程版本一，对获取实例的方法进行加锁保证多线程的安全性。

第二种
```java
public class Singleton {
    private Singleton() { }

    private static class InlineClass {
        public static Singleton singleton = new Singleton();
    }

    private static Singleton getInstance() {
        return InlineClass.singleton;
    }
}
```
这种也是懒汉模式的一种，这种模式的安全性是由JVM进行内部类和内部类初始化的方式保证的。
我们对InlineClass的权限设置为private保证了外部类无法访问，其次利用JVM的类初始化机制创建单例。
这种方法在高并发环境下性能优越。