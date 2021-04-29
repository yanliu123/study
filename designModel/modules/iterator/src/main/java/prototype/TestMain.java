package prototype;

public class TestMain {
    public static void main(String[] args){
        //pre
        Manager manager = new Manager();
        MessageBox box1 = new MessageBox('#');
        MessageBox box2 = new MessageBox('/');
        UnderlinePen pen = new UnderlinePen('@');
        manager.register("WarnBox",box1);
        manager.register("CodeBox",box2);
        manager.register("UnderLineBox",pen);
        //Use
        Product p1 = manager.create("WarnBox");
        Product p2 = manager.create("CodeBox");
        Product p3= manager.create("UnderLineBox");
        p1.use("Hello you");
        p2.use("NO,Thanks");
        p3.use("Hello");
    }


}
