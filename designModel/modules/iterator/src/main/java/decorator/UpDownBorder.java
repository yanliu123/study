package decorator;

public class UpDownBorder extends Border{
    private char upDown;

    protected UpDownBorder(Display display,char upDown) {
        super(display);
        this.upDown = upDown;
    }

    @Override
    public int getRows() {
        return display.getRows()+2;
    }

    @Override
    public int getColumns() {
        return display.getColumns();
    }

    @Override
    public String getRowText(int row) {
        if (row==0||(row ==(display.getRows()+1))){
            return makeText(upDown,getColumns());
        }
        return display.getRowText(row);
    }

    private String makeText(char upDown, int columns) {
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<columns;i++){
            sb.append(upDown);
        }
        return sb.toString();
    }
}
