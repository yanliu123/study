package strategy;

public class Player {
    public String name;
    private Strategy strategy;
    private int gameLose=0;
    private int gameWin=0;
    private int gameTotal = 0;
    public Player(String name,Strategy strategy){
        this.name = name;
        this.strategy = strategy;
    }
    public void lose(){
        gameLose++;
        gameTotal++;
        strategy.study(false);
    }
    public void win(){
        gameTotal++;
        gameWin++;
        strategy.study(true);
    }
    public void even(){
        gameTotal++;
    }
    public Hand nextHand(){
        return strategy.nextHand();
    }
    public String toString(){
        return name + ",总局数："+gameTotal+",赢："+gameWin+",输："+gameLose+";";
    }
}
