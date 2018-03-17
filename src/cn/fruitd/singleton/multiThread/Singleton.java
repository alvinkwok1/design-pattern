package cn.fruitd.singleton.multiThread;

import sun.management.jmxremote.SingleEntryRegistry;

/**
 * 多线程下的单例模式
 */
public class Singleton {
    private Singleton() { }

     static class InlineClass {
        public static Singleton singleton = new Singleton();
    }

    private static Singleton getInstance() {
        return InlineClass.singleton;
    }
}
