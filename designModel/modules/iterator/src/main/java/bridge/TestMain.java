package bridge;

public class TestMain {
    public static void main(String[] args){
        Display d1 = new Display(new StringDisplayImpl("你好"));
        Display d2 = new Display(new StringDisplayImpl("谢邀"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("谢邀"));
        d1.display();
        d2.display();
        d3.multiDisplay();
    }
}
