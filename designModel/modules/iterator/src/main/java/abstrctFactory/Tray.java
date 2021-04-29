package abstrctFactory;

import java.util.Vector;

public abstract class Tray extends Item{;
    protected Vector vector = new Vector();
    public Tray(String name) {
        super(name);
    }
    public void addItem(Item item){
        vector.add(item);
    }
}
