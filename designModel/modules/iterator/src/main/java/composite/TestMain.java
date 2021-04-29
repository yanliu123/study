package composite;

public class TestMain {
    public static void main(String[] args){
        File file1 = new File("你好1",1);
        File file2 = new File("你好2",2);
        Directory directory1 =new Directory("天才");
        directory1.add(file1);
        directory1.add(file2);
        Directory directory2 =new Directory("天才不是");
        directory2.add(directory1);
        directory2.printList("/");
    }
}
