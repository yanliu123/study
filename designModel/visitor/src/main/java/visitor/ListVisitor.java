package visitor;

import java.util.Iterator;

public class ListVisitor extends Visitor{
    private String currentPath;
    public ListVisitor(String currentPath){
        this.currentPath = currentPath;
    }
    @Override
    public void visit(File file) {
        System.out.println(file.getName());
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentPath+"/"+directory);
        currentPath = currentPath+"/"+directory;
        Iterator iterator = directory.iterator();
        while (iterator.hasNext()){
            Entry entry = (Entry) iterator.next();
            entry.accept(this);
        }
    }
}
