package adapt;

/**
 * 继承
 */
public class PrintBanner1 extends Banner implements Print {
    public PrintBanner1(String key){
        super(key);
    }

    @Override
    public void printWeak() {
        printKH();
    }

    @Override
    public void printStrong() {
        printXH();
    }
}
