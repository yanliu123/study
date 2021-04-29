package chainResponse;

import java.util.Random;

public class TestMain {
    public static  void main(String[] args){
        Support s1 = new LimitSupport("limit",10);
        Support s2 =  new NoSupport("no");
        Support s3 = new OodSupport("odd");
        Support s4  = new SpecialSupport("special",50);
        s1.setNext(s2);
        s2.setNext(s3);
        s3.setNext(s4);
        Random random = new Random(100);
        for (int i=0;i<20;i++){
            int number = random.nextInt();
            s1.support(new Trouble(number));
        }
    }
}
