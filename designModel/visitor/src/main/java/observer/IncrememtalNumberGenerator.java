package observer;

public class IncrememtalNumberGenerator extends NumberGenerator{
    private int begin;
    private int end;
    private int inteval;
    private int number;
    public IncrememtalNumberGenerator(int begin,int end,int inteval){
        this.begin = begin;
        this.end = end;
        this.inteval  = inteval;
        this.number = begin;
    }
    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
     do{
         notifyObserver();
         number=number+inteval;
     }while (number<end);
    }
}
