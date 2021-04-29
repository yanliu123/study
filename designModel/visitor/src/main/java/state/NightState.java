package state;

public class NightState implements State{
    private static NightState nightState= new NightState();
    private NightState(){}
    @Override
    public void doClock(Context context, int hour) {
        if (hour>=9 && hour<15){
            context.changeState(DayState.getDayState());
        }
    }
    public static NightState getNightState(){
        return nightState;
    }
    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("通知安全中心（夜晚使用），异常");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("警铃使用（夜晚）");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("转通话录音（夜晚）");
    }

    public String toString(){
        return "[白天]";
    }
}
