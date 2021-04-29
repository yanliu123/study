package decorator;

public class FullBorder extends Border{

    protected FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getRows() {
        return 2+display.getRows();
    }

    @Override
    public int getColumns() {
        return 2+display.getColumns();
    }

    @Override
    public String getRowText(int row) {
        if (row==0||row==(display.getRows()+1)) return "+"+makeText("-",display.getColumns())+"+";
        else{
            return "|"+display.getRowText(row-1)+"|";
        }
    }

    private String makeText(String s, int columns) {
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<columns;i++){
            sb.append(s);
        }
        return sb.toString();
    }
}
