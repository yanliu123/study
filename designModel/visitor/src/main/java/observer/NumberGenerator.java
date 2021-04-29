package observer;

import java.util.Iterator;
import java.util.Vector;

public abstract class NumberGenerator {
    private Vector<Observer> observerVector = new Vector<>();
    public void  addObserver(Observer observer){
        observerVector.add(observer);
    }
    public void deleteObserver(Observer observer){
        observerVector.remove(observer);
    }
    public void notifyObserver(){
        Iterator iterator = observerVector.iterator();
        while (iterator.hasNext()){
            Observer observer = (Observer) iterator.next();
            observer.update(this);
        }
    }

    public abstract int getNumber();
    public abstract void execute();

}
