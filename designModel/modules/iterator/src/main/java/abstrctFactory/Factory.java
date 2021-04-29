package abstrctFactory;

public abstract class Factory {

    public static Factory getFactory(String factoryClassName){
        Factory factory = null;
        try {
            factory= (Factory) Class.forName(factoryClassName).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return  factory;
    }
    public abstract Link createLink(String name,String url);
    public abstract Tray createTray(String name);
    public abstract Page createPage(String author,String title);

}
