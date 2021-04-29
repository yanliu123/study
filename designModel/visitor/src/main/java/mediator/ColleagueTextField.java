package mediator;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class ColleagueTextField extends TextField implements Colleague, TextListener {
    private Mediator mediator;
    public ColleagueTextField(String field,int column){
        super(field,column);
    }
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueChanged(Boolean enabled) {
        setEnabled(enabled);
        setBackground(enabled?Color.BLACK:Color.lightGray);
    }

    public void textValueChanged(TextEvent event){
        mediator.colleaguesChanged(this);
    }

}
