package tempelete;

public class StringDisplay extends AbstractDisplay{
  private String str;
  private int width;

  public StringDisplay(String str){
      this.str  = str;
      this.width = str.getBytes().length;
  }
    @Override
    public void open() {
        PrintLine();
    }

    private void PrintLine() {
        System.out.print("+");
        for (int i=0;i<width;i++){
            System.out.print("-");
        }
        System.out.println("+");
    }

    @Override
    public void print() {
        System.out.println("|"+str+"|");
    }

    @Override
    public void close() {
        PrintLine();
    }
}
