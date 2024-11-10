package CreationalDesignPatterns.SingletonPattern;

// Method 1 – Classic Implementation || Make getInstance() static to implement Singleton Method Design Pattern
public class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton is Instantiated.");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("Somethong is Done.");
    }
}
/*
Method 2 || Make getInstance() synchronized to implement Singleton Method Design Pattern
// Thread Synchronized Java implementation of singleton design pattern
class Singleton {
    private static Singleton obj;
    private Singleton() {}

    // Only one thread can execute this at a time
    public static synchronized Singleton getInstance()
    {
        if (obj == null)
            obj = new Singleton();
        return obj;
    }
}

Method 3 – Eager Instantiation || Static initializer based implementation of singleton design pattern
// Static initializer based Java implementation of singleton design pattern
class Singleton {
    private static Singleton obj = new Singleton();
    private Singleton() {}

    public static Singleton getInstance() { return obj; }
}

Method 4 – Most Efficient || Use “Double Checked Locking” to implement singleton design pattern
// Double Checked Locking based Java implementation of singleton design pattern
class Singleton {
    private static volatile Singleton obj = null;
    private Singleton() {}

    public static Singleton getInstance()
    {
        if (obj == null) {
            // To make thread safe
            synchronized (Singleton.class)
            {
                // check again as multiple threads
                // can reach above step
                if (obj == null)
                    obj = new Singleton();
            }
        }
        return obj;
    }
}

Method 5 – Enum
public enum EnumSingleton {
    INSTANCE;
    public static void doSomething() {
        // do something
    }
}

 */


