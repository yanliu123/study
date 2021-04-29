package observer;

public class GraphObserver implements Observer{

    @Override
    public void update(NumberGenerator numberGenerator) {
        System.out.println("GraphObserver"+numberGenerator.getNumber());
        try{
           Thread.sleep(100);
        }catch (Exception e){

        }
    }
}
