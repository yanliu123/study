package strategy;

public class Hand {
    public final static int CQ_ST=0;
    public final static int CQ_QD=1;
    public final static int CQ_B=2;
    private int cq;
    private final static Hand[] hands = new Hand[]{new Hand(CQ_ST),new Hand(CQ_QD),new Hand(CQ_B)};
    private Hand(int cq){
        this.cq = cq;
    }
    public static Hand getHand(int cq){
        return  hands[cq];
    }
    public Boolean isStronger(Hand hand){
        return isFight(hand)==1;
    }
    public Boolean isWeaker(Hand hand){
        return isFight(hand)==-1;
    }

    private int isFight(Hand hand) {
        if (this==hand){
            return 0;
        }else if((this.cq+1)%3==hand.cq){
            return 1;
        }else{
            return -1;
        }
    }

}
