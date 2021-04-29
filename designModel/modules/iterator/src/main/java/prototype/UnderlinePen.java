package prototype;


public class UnderlinePen implements Product{
    private char underline;
    UnderlinePen(char underline){
        this.underline = underline;
    }
    @Override
    public void use(String printStr) {
        System.out.println("\""+printStr+"\"");
        for (int i=0;i<printStr.getBytes().length;i++){
            System.out.print(underline);
        }
        System.out.println("");
    }

    @Override
    public Product createClone() {
        Product product=null;
        try {
             product= (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return product;
    }
}
