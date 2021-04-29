package builder;

public abstract class Builder {
    public abstract void setTitle(String title);
    public abstract void setString(String string);
    public abstract void setItems(String[] items);
    public abstract Object getResult();
}
