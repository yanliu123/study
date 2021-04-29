package abstrctFactory;

import java.util.Vector;

public abstract class Page{
    protected String author;
    protected String title;
    protected Vector vector = new Vector();
    public Page(String author,String title) {
       this.author = author;
       this.title = title;
    }
    protected void addItem(Item item){
        vector.add(item);
    }
    public abstract String makeHtml();

}
