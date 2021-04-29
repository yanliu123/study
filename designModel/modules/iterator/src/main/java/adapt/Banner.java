package adapt;

public class Banner {
    private String key;
    public Banner(String key){
        this.key = key;
    }
    public void printKH(){
        System.out.println("("+key+")");
    }
    public void printXH(){
        System.out.println(key+"*");
    }
}
