package strategy;

public class TestMain {
    public static void main(String[] args){
        Player player1 = new Player("李明",new ProbStrategy(33));
        Player player2 = new Player("丽丽",new WinStrategy(200));
        for(int i=0;i<10000;i++){
            Hand hand1 = player1.nextHand();
            Hand hand2 = player2.nextHand();
            if(hand1.isStronger(hand2)){
                System.out.println("赢者是："+player1.name);
                player1.win();
                player2.lose();
            }else if(hand1.isWeaker(hand2)){
                System.out.println("赢者是："+player2.name);
                player2.win();
                player1.lose();
            }else {
                player1.even();
                player2.even();
            }
            player1.toString();
            player2.toString();
        }
    }

}
