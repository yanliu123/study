package builder;

public class TestMain {
    public static void main(String[] args){
        Direct direct = new Direct(new TextBuilder());
        direct.construct();

        Direct direct1 = new Direct(new HtmlBuilder());
        direct1.construct();
    }
}
