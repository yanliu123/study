package memento;

import java.util.Vector;

public class Memento {
    private int money;
    private Vector fruits;

    public Memento(int money){
        this.fruits = new Vector();
        this.money = money;
    }
    public int getMoney(){
        return money;
    }
    public void addFruit(String fruit){
        fruits.add(fruit);
    }

    public Vector getFruits(){
        return (Vector) fruits.clone();
    }

}
