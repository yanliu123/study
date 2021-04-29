package proxy;

public class TestMain {
    public static void main(String[] args){
        PrinterProxy proxy = new PrinterProxy("代理");
        System.out.println("现在的名称："+proxy.getName());
        proxy.setName("真实");
        System.out.println("现在的名称："+proxy.getName());
        proxy.print("BOB");
    }
}
