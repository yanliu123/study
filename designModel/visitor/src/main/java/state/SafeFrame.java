package state;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SafeFrame extends Frame implements ActionListener, Context{
    private TextField currentTime = new TextField(60);
    private TextArea securityCenter = new TextArea(10,60);
    private Button jk = new Button("金库");
    private Button alarm  = new Button("警铃");
    private Button phone = new Button("通话");
    private Button end = new Button("结束");
    private State nowState = DayState.getDayState();

    public SafeFrame(String title){
        super(title);
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());
        add(currentTime,BorderLayout.NORTH);
        currentTime.setEditable(false);
        add(securityCenter,BorderLayout.CENTER);
        securityCenter.setEditable(false);

        Panel panel = new Panel();
        panel.add(jk);
        panel.add(alarm);
        panel.add(phone);
        panel.add(end);
        add(panel,BorderLayout.SOUTH);

        pack();
        show();

        jk.addActionListener(this);
        alarm.addActionListener(this);
        phone.addActionListener(this);
        end.addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(""+e);
        if (e.getSource()==jk){
            nowState.doUse(this);
        }else if (e.getSource()==alarm){
            nowState.doAlarm(this);
        }else if (e.getSource()==phone){
            nowState.doPhone(this);
        }else if (e.getSource()==end){
            System.exit(0);
        }else{
            System.out.println("?");
        }
    }

    @Override
    public void setClock(int hour) {
        String clockString = "现在时间是：";
        if (hour<10){
            clockString = clockString+"0"+hour+":00:00";
        }else{
            clockString =  clockString+hour+":00:00";
        }
        System.out.println(clockString);
        currentTime.setText(clockString);
        nowState.doClock(this,hour);
    }

    @Override
    public void changeState(State state) {
        System.out.println("状态变化:"+nowState+"->"+state);
        this.nowState = state;
    }

    @Override
    public void callSecurityCenter(String msg) {
        System.out.println("安全中心："+msg);
        securityCenter.append("安全中心："+msg+"\n");
    }

    @Override
    public void recordLog(String log) {
        System.out.println("记录："+log);
    }
}
