package abstrctFactory;

public class ListFactory extends Factory{

    @Override
    public Link createLink(String name, String url) {
        return new ListLink(name,url);
    }

    @Override
    public Tray createTray(String name) {
        return new ListTray(name);
    }

    @Override
    public Page createPage(String author, String title) {
        return new ListPage(author,title);
    }
}
