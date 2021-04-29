package singleton;

public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton(){
        System.out.println("已经创建单例实体");
    }
    public static Singleton getInstant(){
        return singleton;
    }
}
