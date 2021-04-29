package command;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestMain extends JFrame implements ActionListener, MouseMotionListener, WindowListener{
    private Button clearButton = new Button("清除");
    private MacroCommand history = new MacroCommand();
    private DrawCanvas drawCanvas = new DrawCanvas(400,400,history);

    public static void main(String[] args){
        new TestMain("首页");
    }

        public TestMain(String title){
           super(title);
           this.addWindowListener(this);
            drawCanvas.addMouseMotionListener(this);
            clearButton.addActionListener(this);

            Box buttonBox = new Box(BoxLayout.X_AXIS);
            buttonBox.add(clearButton);

            Box mainBOx = new Box(BoxLayout.Y_AXIS);
            mainBOx.add(buttonBox);
            mainBOx.add(drawCanvas);
            getContentPane().add(mainBOx);
            pack();
            show();
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource()==clearButton){
                history.clean();
                drawCanvas.paint();
            }
        }


        @Override
        public void windowOpened(WindowEvent e) {

        }

        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }

        @Override
        public void windowClosed(WindowEvent e) {

        }

        @Override
        public void windowIconified(WindowEvent e) {

        }

        @Override
        public void windowDeiconified(WindowEvent e) {

        }

        @Override
        public void windowActivated(WindowEvent e) {

        }

        @Override
        public void windowDeactivated(WindowEvent e) {

        }

    @Override
    public void mouseDragged(MouseEvent e) {
        Command command = new DrawCommand(drawCanvas,e.getPoint());
        history.addCommand(command);
        command.execute();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
