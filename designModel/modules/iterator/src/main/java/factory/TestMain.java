package factory;

public class TestMain {
    public static  void main(String[] args){
        Factory idFactory = new IDCardFactory();
        Product p1 =  idFactory.create("丹丹",23);
        Product p2 = idFactory.create("丽丽",11);
        Product p3 = idFactory.create("明明",12);
        p1.use();
        p2.use();
        p3.use();
    }
}
