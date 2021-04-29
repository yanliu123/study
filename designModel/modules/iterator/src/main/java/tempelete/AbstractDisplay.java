package tempelete;

public abstract class AbstractDisplay {
    abstract public void open();
    abstract  public  void print();
    abstract public void close();
    public void display(){
        open();
        print();
        close();
    }
}
