package strategy;

import java.util.Random;

public class WinStrategy implements Strategy{
    private Random random;
    private Boolean win=false;
    private Hand preHand;
    public WinStrategy(int seek){
        this.random = new Random(seek);
    }
    @Override
    public Hand nextHand() {
        if (!win){
            preHand = Hand.getHand(random.nextInt(3));
            return preHand;
        }
        else return preHand;
    }

    @Override
    public void study(Boolean win) {
        this.win = win;
    }
}
