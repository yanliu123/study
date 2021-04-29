package adapt;

public class TestMain {
    public static void main(String[] args) {
        Print p = new PrintBanner1("Hello 1");
        p.printWeak();
        p.printStrong();

        Print2 p2 = new PrintBanner2("Hello 2");
        p2.printWeak();
        p2.printStrong();
    }
}
