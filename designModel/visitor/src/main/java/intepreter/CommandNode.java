package intepreter;

public class CommandNode implements Node {

    private Node node;
    @Override
    public void parse(Context context) throws Exception {
        if (context.getCurrentToken().equals("repeat")){
            node = new RepeatCommandNode();
            node.parse(context);
        }else{
            node = new PrimitiveCommandNode();
        }
    }
}
