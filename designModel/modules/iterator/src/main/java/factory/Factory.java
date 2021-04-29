package factory;

public abstract class Factory {
    public Product create(String own,Integer idCard){
        Product product = createProduct(own,idCard);
        registerProduct(product);
        return product;
    }
    protected abstract Product createProduct(String own,Integer idCard);
    protected abstract void registerProduct(Product own);
}
