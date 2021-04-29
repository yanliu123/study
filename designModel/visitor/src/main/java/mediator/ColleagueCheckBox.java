package mediator;


import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ColleagueCheckBox extends Checkbox implements Colleague, ItemListener {
    private Mediator mediator;
    public ColleagueCheckBox(String caption,CheckboxGroup group,Boolean state){
        super(caption,group,state);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueChanged(Boolean enabled) {
        setEnabled(enabled);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        mediator.colleaguesChanged(this);
    }
}
