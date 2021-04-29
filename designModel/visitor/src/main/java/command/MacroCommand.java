package command;

import java.util.Iterator;
import java.util.Stack;

public class MacroCommand implements Command{
    private Stack stack = new Stack();

    public void addCommand(Command command){
        stack.push(command);
    }

    public void undo(){
        if (stack.size()>0){
            stack.pop();
        }
    }
    public void clean(){
        stack.clear();
    }

    @Override
    public void execute() {
        Iterator iterator = stack.iterator();
        if (iterator.hasNext()){
            Command command = (Command) iterator.next();
            command.execute();
        }
    }
}
