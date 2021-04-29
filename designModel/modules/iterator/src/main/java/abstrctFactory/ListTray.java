package abstrctFactory;

public class ListTray extends Tray{
    protected StringBuilder sb;
    public ListTray(String name) {
        super(name);
        sb = new StringBuilder();
    }

    @Override
    public String makeHtml() {
        sb.append("<li>");
        sb.append(name);
        sb.append("<ul>");
        for (int i=0;i<vector.size();i++){
            Item item = (Item) vector.get(i);
            sb.append(item.makeHtml());
        }
        sb.append("</ul>");
        sb.append("</li>");
       
        return sb.toString();
    }
}
