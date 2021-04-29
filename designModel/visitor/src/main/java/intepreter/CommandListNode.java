package intepreter;

import java.util.Vector;

public class CommandListNode implements Node{
    private Vector list = new Vector();
    @Override
    public void parse(Context context) throws Exception {
        while(true) {
            if (context.getCurrentToken() == null) {
                throw new Exception("Missing");
            } else if (context.getCurrentToken().equals("end")) {
                context.skipToken(context.getCurrentToken());
                break;
            }else{
                Node commandNode = new CommandNode();
                commandNode.parse(context);
                list.add(commandNode);

            }
        }
    }

    public String toString(){
        return "[CommandListNode]"+list.toString();
    }
}
