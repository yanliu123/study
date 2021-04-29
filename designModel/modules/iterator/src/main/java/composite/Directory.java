package composite;

import java.util.Iterator;
import java.util.Vector;

public class Directory extends Entity{
    private String name;
    private Vector directory;
    public Directory(String name){
        this.name = name;
        this.directory = new Vector();
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator it = directory.iterator();
        while (it.hasNext()){
            size++;
        }
        return size;
    }
    public Entity add(Entity entity){
        directory.add(entity);
        return (Entity)this;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix+"/"+this);
        Iterator it = directory.iterator();
        while (it.hasNext()){
            Entity entity =(Entity) it.next();
            entity.printList(prefix+"/"+entity.getName());
        }
    }

}
