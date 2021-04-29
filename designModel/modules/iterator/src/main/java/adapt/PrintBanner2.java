package adapt;

/**
 * 委托
 */
public class PrintBanner2  extends Print2 {
    private Banner banner;

    public PrintBanner2(String key){
        this.banner= new Banner(key);
    }
    @Override
    public void printWeak() {
        this.banner.printKH();
    }

    @Override
    public void printStrong() {
        this.banner.printXH();
    }
}
