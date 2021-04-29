package decorator;

public class TestMain {
    public static void main(String[] args){
        Display d1 = new StringDisplay("你好");
        Display d2 = new SideBorder(d1,'$');
        Display d3 = new FullBorder(d1);
        d1.show();
        d2.show();
        d3.show();
        Display d4 = new SideBorder(
                new FullBorder(
                        new SideBorder(
                                new StringDisplay("是我"),'%')),'%');
        d4.show();
    }

}
