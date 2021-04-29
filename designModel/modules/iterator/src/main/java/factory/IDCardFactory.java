package factory;

import java.util.Vector;

public class IDCardFactory extends Factory{
    private Vector vector = new Vector<>();

    @Override
    protected Product createProduct(String own,Integer idCard) {
       return new IDCard(own,idCard);
    }

    @Override
    protected void registerProduct(Product own) {
        vector.add(((IDCard)own).getOwn());
    }
}
