package prototype;

public interface Product extends Cloneable{
     void use(String printStr);
     Product createClone();
}
