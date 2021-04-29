package builder;

public class TextBuilder extends Builder{
    private StringBuilder buffer;

    public TextBuilder(){
        buffer = new StringBuilder();
    }
    @Override
    public void setTitle(String title) {
        buffer.append("=============");
        buffer.append("<"+title+">");
        buffer.append("\n");
    }

    @Override
    public void setString(String string) {
            buffer.append("$"+string+"$");
        buffer.append("\n");
    }

    @Override
    public void setItems(String[] items) {
        for (int i=0;i<items.length;i++){
            buffer.append("."+items[i]+"\n");
        }
    }

    @Override
    public Object getResult() {
        buffer.append("=============");
        return buffer.toString();
    }
}
