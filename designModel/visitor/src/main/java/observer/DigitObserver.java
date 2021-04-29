package observer;

public class DigitObserver implements Observer{
    @Override
    public void update(NumberGenerator numberGenerator) {
        for (int i=0;i<numberGenerator.getNumber();i++){
            System.out.print('*');
        }
        try{
            Thread.sleep(100);
        }catch (Exception e){

        }
    }
}
