package abstrctFactory;

public class ListLink extends Link{
    public ListLink(String name, String url) {
        super(name, url);
    }

    @Override
    public String makeHtml() {
        return "<li><a href=\""+url+"\"/>"+name+"</li>";
    }
}
