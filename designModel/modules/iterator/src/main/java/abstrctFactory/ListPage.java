package abstrctFactory;


import java.util.Iterator;

public class ListPage extends Page{
    public ListPage(String author, String title) {
        super(author, title);
    }

    @Override
    public String makeHtml() {
        StringBuilder sb = new StringBuilder();
        sb.append("<html><head><title>"+title).append("</title></head><body>");
        sb.append("<h>"+title+"</h>\n");
        Iterator it = vector.iterator();
        sb.append("<ul>\n");
        while (it.hasNext()){
            Item item = (Item) it.next();
            sb.append(item.makeHtml());
        }
        sb.append("</ul>\n");
        sb.append("</html>\n");
        return sb.toString();
    }
}
