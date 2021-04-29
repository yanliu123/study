package flyWeight;

import java.io.IOException;
import java.util.Iterator;
import java.util.Vector;

public class BigCharFactory {
    private static BigCharFactory factory = new BigCharFactory();
    private BigCharFactory(){}
    private Vector bigChars = new Vector();

    public  static BigCharFactory instantOf(){
        return factory;
    }

    public synchronized BigChar getBigChar(char charName) throws IOException {
      Iterator iterator = bigChars.iterator();
      while (iterator.hasNext()){
          BigChar bigChar = (BigChar) iterator.next();
          if (bigChar.getCharName()==charName){
              return bigChar;
          }
      }
        return new BigChar(charName);
    }
}
