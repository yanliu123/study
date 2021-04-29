package flyWeight;

import java.io.IOException;

public class BigString {
    private BigChar[] bigChars;
    BigCharFactory bigCharFactory = BigCharFactory.instantOf();

    public BigString(String string) throws IOException {
        bigChars = new BigChar[string.length()];
        for (int i=0;i<string.length();i++){
            bigChars[i] = bigCharFactory.getBigChar(string.charAt(i));
        }
    }
    public String toString(){
        StringBuffer sb = new StringBuffer();
        for (int i=0;i<bigChars.length;i++){
            sb.append(bigChars[i].toString());
        }
        return sb.toString();
    }
}
