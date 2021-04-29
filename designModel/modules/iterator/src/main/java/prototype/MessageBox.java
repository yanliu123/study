package prototype;

public class MessageBox implements Product{
    private char box;
    MessageBox(char box){
        this.box = box;
    }
    @Override
    public void use(String printStr) {
        for (int i=0;i<(printStr.getBytes().length+4);i++){
            System.out.print(box);
        }
        System.out.println("");
        System.out.println(box+" "+ printStr+" "+box);
        for (int i=0;i<(printStr.getBytes().length+4);i++){
            System.out.print(box);
        }
        System.out.println("");
    }

    @Override
    public Product createClone() {
        Product product = null;
        try {
            product=(Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return product;
    }
}
