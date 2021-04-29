package visitor;



import java.util.Iterator;
import java.util.Vector;

public class Directory extends Entry {
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
    public Entry add(Entry entity){
        directory.add(entity);
        return (Entry)this;
    }

    public Iterator iterator(){
        return directory.iterator();
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
