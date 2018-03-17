package cn.fruitd.singleton.multiThread;

public class SyncSingleton {

    private static SyncSingleton instance = null;

    private SyncSingleton() { }

    public static synchronized SyncSingleton SyncSingleton() {
        if (instance == null)
            instance = new SyncSingleton();
        return instance;
    }
}
