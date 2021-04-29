package state;

public class DayState implements State{
    private static DayState dayState= new DayState();
    private DayState(){}

    @Override
    public void doClock(Context context, int hour) {
        if (hour<9||hour>=17){
            context.changeState(NightState.getNightState());
        }
    }

    public static DayState getDayState(){
        return dayState;
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("白天使用");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("警铃（白天）");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("一般通话（白天）");
    }
    public String toString(){
        return "[夜晚]";
    }
}
