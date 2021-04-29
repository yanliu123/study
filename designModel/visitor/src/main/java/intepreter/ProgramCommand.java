package intepreter;

public class ProgramCommand implements Node{
    private Node commandNode;

    @Override
    public void parse(Context context) throws Exception {
        context.skipToken("program");
        commandNode = new CommandListNode();
        commandNode.parse(context);
    }
    public String toString(){
        return "[ProgramCommand]"+commandNode;
    }
}
