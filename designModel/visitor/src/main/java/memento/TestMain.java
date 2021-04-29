package memento;

public class TestMain {
    public static void main(String[] args){
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();

        for (int i=0;i<100;i++){
            gamer.bet();
            if (gamer.getMoney()> memento.getMoney()){
                System.out.println("赚钱了，先存起来");
                memento = gamer.createMemento();
            }else if(gamer.getMoney()< memento.getMoney()/2){
                System.out.println("亏钱多了，重置");
                gamer.restoreMemento(memento);
            }
            System.out.println(gamer.toString());
            try{
                Thread.sleep(100);
            }catch (Exception e){}
        }
    }
}
