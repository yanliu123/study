package bridge;

public class CountDisplay extends Display{
    public CountDisplay(DisplayImpl displayImpl) {
        super(displayImpl);
    }
    public void multiDisplay(){
        open();
        for (int i=0;i<10;i++){
            System.out.print("33");
        }
        close();
    }
}
