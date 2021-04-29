package mediator;

import java.awt.*;

public class ColleagueButton extends Button implements Colleague{
    public ColleagueButton(String name){
        super(name);
    }
    private Mediator mediator;
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueChanged(Boolean enabled) {
        setEnabled(enabled);
    }

}
