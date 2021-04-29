package visitor;

public class TestMain {
    public static void main(String[] args){
        Directory dir = new Directory("目录1");
        File file1 = new File("文件1",20);
        File file2 = new File("文件2",30);
        dir.add(file1);
        dir.add(file2);
        Visitor visitor = new ListVisitor("/");
        dir.accept(visitor);
    }

}
