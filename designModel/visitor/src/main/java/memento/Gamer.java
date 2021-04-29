package memento;

import java.util.Iterator;
import java.util.Random;
import java.util.Vector;

public class Gamer {
    private Random random = new Random();
    private Vector fruits = new Vector();
    private int money;
    private final String[] fruitNames= {"苹果","香蕉","梨","橘子"};
    public Gamer(int money){
        this.money = money;
    }
    public int getMoney(){
        return money;
    }
    public void bet(){
        int dice = random.nextInt(7);
        if (dice==1){
            money=money+100;
            System.out.println("钱数加100");
        }else if(dice==2){
            money = money/2;
            System.out.println("钱数减半");
        }else if(dice==6){
            String fruit = getFruit();
            fruits.add(fruit);
            System.out.println("获取水果");
        }else{
            System.out.println("什么都没有发生");
        }
    }

    public Memento createMemento(){
        Memento memento = new Memento(money);
        Iterator iterator = fruits.iterator();
        while (iterator.hasNext()){
            String fruit = (String) iterator.next();
            if (fruit.startsWith("好吃的")){
                memento.addFruit(fruit);
            }
        }
        return memento;
    }

    public void restoreMemento(Memento memento){
        this.money = memento.getMoney();
        this.fruits = memento.getFruits();
    }

    private String getFruit() {
        String prefix = "";
        if (random.nextBoolean()){
            prefix = "好吃的";
        }
        return prefix+fruitNames[random.nextInt(fruitNames.length)];
    }

    @Override
    public String toString(){
        return "现状：钱数："+money+",水果："+fruits.toString();
    }
}
