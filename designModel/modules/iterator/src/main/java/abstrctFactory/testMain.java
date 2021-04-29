package abstrctFactory;

public class TestMain {
    public static void main(String[] args){
        Factory factory = Factory.getFactory("LinkFactory");
        Link link1 = factory.createLink("百度","http://www.baidu.com");
        Link link2 = factory.createLink("谷歌","http://www.google.com");
        Tray tray = factory.createTray("浏览器");
        tray.addItem(link1);
        tray.addItem(link2);
        Page page = factory.createPage("浏览器","浏览器");
        page.addItem(tray);
        System.out.print(page.makeHtml());
    }
}
