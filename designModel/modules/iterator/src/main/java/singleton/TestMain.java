package singleton;

public class TestMain {
    public static  void main(String[] args){
        System.out.println("Start");
        Singleton s1 =  Singleton.getInstant();
        Singleton s2 =  Singleton.getInstant();
        if (s1==s2) System.out.println("两个实体");
        else  System.out.println("两个实体");
        System.out.println("End");

//        Triple t1 =  Triple.getInstant(0);
//        Triple t2 =  Triple.getInstant(1);
//        Triple t3 =  Triple.getInstant(2);
    }
}
