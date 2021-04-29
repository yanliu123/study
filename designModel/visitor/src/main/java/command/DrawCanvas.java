package command;

import java.awt.*;

public class DrawCanvas extends Canvas implements Drawable{
    private Color color = Color.red;
    private int radium = 6;
    private MacroCommand history;

    public DrawCanvas(int width,int height,MacroCommand history){
        setSize(width,height);
        setBackground(Color.white);
        this.history = history;
    }
    @Override
    public void draw(int x, int y) {
        Graphics g = getGraphics();
        g.fillOval(x,y,radium*2,radium*2);
    }

    public void paint(){
        history.execute();
    }
}
