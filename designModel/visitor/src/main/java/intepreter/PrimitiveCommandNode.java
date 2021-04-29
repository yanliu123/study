package intepreter;

public class PrimitiveCommandNode implements Node{
    private String name;
    @Override
    public void parse(Context context) throws Exception {
        name = context.getCurrentToken();
        if (!name.equals("go")&& !name.equals("right") &&!name.equals("left")){
            throw new Exception("Unknown");
        }
    }

    public String toString(){
        return name;
    }
}
