package visitor;



import java.util.Iterator;

public abstract class Entry implements Acceptor{
    public abstract int getSize();
    public abstract String getName();
    public Entry add(Entry entry)throws Exception {
        throw new Exception();
    }
    public Iterator iterator() throws Exception {
       throw new Exception();
    }
    public String toString(){
        return getName()+"("+getSize()+")";
    }
  
}
