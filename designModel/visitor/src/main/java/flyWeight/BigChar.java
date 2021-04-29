package flyWeight;

import java.io.*;

public class BigChar {
    private char charName;
    private String chars;

    public  char getCharName(){
        return charName;
    }
    public BigChar(char charName) throws IOException {
        this.charName = charName;
        BufferedReader fileReader = new BufferedReader(new FileReader("big"+charName+".txt"));
        String line;
        StringBuffer sb = new StringBuffer();
        if((line=fileReader.readLine())!=null){
            sb.append(line);
        }
        chars=sb.toString();
    }

    public String toString(){
        return chars;
    }
}
