package mediator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import mediator.*;

public class LoginFrame extends Frame implements ActionListener,Mediator {
    private ColleagueButton buttonOK;
    private ColleagueButton buttonCancel;
    private ColleagueCheckBox  register;
    private ColleagueCheckBox login;
    private ColleagueTextField user;
    private ColleagueTextField pass;

    public LoginFrame(String title){
        super(title);
        setBackground(Color.white);
        setLayout(new GridLayout(4,2));
        createColleagues();
        add(register);
        add(login);
        add(new Label("username:"));
        add(user);
        add(new Label("password::"));
        add(pass);
        add(buttonOK);
        add(buttonCancel);
        colleaguesChanged(register);
        pack();
        show();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        System.exit(0);
    }

    @Override
    public void createColleagues() {
        CheckboxGroup g = new CheckboxGroup();
        register = new ColleagueCheckBox("register",g,true);
        login = new ColleagueCheckBox("login",g,false);
        buttonOK = new ColleagueButton("OK");
        buttonCancel = new ColleagueButton("Cancel");
        user = new ColleagueTextField("user",10);
        pass = new ColleagueTextField("password",10);
        pass.setEchoChar('*');

        register.setMediator(this);
        login.setMediator(this);
        buttonCancel.setMediator(this);
        buttonOK.setMediator(this);
        user.setMediator(this);
        pass.setMediator(this);

        register.addItemListener(register);
        login.addItemListener(login);
        user.addTextListener(user);
        pass.addTextListener(pass);
        buttonOK.addActionListener(this);
        buttonCancel.addActionListener(this);
    }

    @Override
    public void colleaguesChanged(Colleague c) {
        if (c==register || c==login){
            if (register.getState()==true){
                user.setColleagueChanged(false);
                pass.setColleagueChanged(false);
                buttonOK.setColleagueChanged(true);
            }else{
                user.setColleagueChanged(true);
                userpassChange();
            }
        }else if(c==user || c==pass){
            userpassChange();
        }else{
            System.out.println("Unknown Model:"+c);
        }
    }

    private void userpassChange() {
        if (user.getText().length()>0){
            pass.setColleagueChanged(true);
            if(pass.getText().length()>0){
                buttonOK.setColleagueChanged(true);
            }
        }else{
            pass.setColleagueChanged(false);
            buttonOK.setColleagueChanged(false);
        }
    }
}
