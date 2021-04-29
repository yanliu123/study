package strategy;

import java.util.Random;

public class ProbStrategy implements Strategy {
    private int currentCq = 0;
    private int preCq = 0;
    private Random random;
    private int[][] history = new int[][]{
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1}
    };
    public ProbStrategy(int seek){
        this.random = new Random(seek);
    }
    @Override
    public Hand nextHand() {
        int handValue = 0;
       int bet = random.nextInt(getSum(currentCq));
       if (bet<history[currentCq][0]){
            handValue = 0 ;
       }else if(bet<history[currentCq][0]+history[currentCq][1]){
           handValue = 1;
       }else{
           handValue = 2;
       }
        preCq = currentCq;
       currentCq = handValue;
        return Hand.getHand(currentCq);
    }

    private int getSum(int currentCq) {
        int sum = 0;
        for (int i=0;i<3;i++){
            sum+=history[currentCq][i];
        }
        return sum;
    }

    @Override
    public void study(Boolean win) {
        if (win){
            history[preCq][currentCq]++;
        }else{
            history[preCq][(currentCq+1)%3]++;
            history[preCq][(currentCq+2)%3]++;
        }
    }
}
