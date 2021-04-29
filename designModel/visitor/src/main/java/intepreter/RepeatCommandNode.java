package intepreter;

public class RepeatCommandNode implements Node{
    private int number;
    private Node commandNode;
    @Override
    public void parse(Context context) throws Exception {
        context.skipToken("repeat");
        number = context.currentNum();
        context.nextToken();
        commandNode = new CommandListNode();
        commandNode.parse(context);
    }
    public String toString(){
        return "["+number+"]"+commandNode;
    }
}
