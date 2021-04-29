package tempelete;

public class CharDisplay extends AbstractDisplay{
    private char ch;
    public CharDisplay(char str) {
       this.ch = str;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
