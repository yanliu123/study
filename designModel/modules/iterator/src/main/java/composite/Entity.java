package composite;

public abstract class Entity {
    public abstract String getName();
    public abstract int getSize();
    public Entity add(Entity entity){
        throw new FileTreatmentException();
    }
    public void print(){
        printList("");
    }

    protected abstract void printList(String s);

    public String toString(){
        return "实体名称："+getName()+"，实体大小："+getSize();
    }
}
