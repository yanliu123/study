package prototype;

import java.util.Hashtable;

public  class Manager {
    private Hashtable showcase = new Hashtable();
    public Product create(String key){
        return (Product)showcase.get(key);
    }
    public void register(String key,Product product){
        showcase.put(key,product);
    }
}
