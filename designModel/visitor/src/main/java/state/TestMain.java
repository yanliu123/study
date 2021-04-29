package state;

public class TestMain {
    public  static void main(String[] args){
        SafeFrame safeFrame = new SafeFrame("金库");
       for (int i=0;i<=24;i++){
           safeFrame.setClock(i);
           try{
               Thread.sleep(1000);
           }catch (Exception e){}
       }
    }
}
