package observer;

public class TestMain {
    public static void main(String[] args){
       Observer digitObserver = new DigitObserver();
        Observer graphObserver = new GraphObserver();
        NumberGenerator numberGenerator=new RandNumberGenerator();
        numberGenerator.addObserver(digitObserver);
        numberGenerator.addObserver(graphObserver);
        numberGenerator.execute();
    }

}
