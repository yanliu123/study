package intepreter;


import java.util.StringTokenizer;

public class Context {
    private StringTokenizer tokenizer;
    private String currentToken;

    public Context(String text){
        tokenizer = new StringTokenizer(text);
        nextToken();
    }

    public String nextToken() {
        if (tokenizer.hasMoreTokens()){
            currentToken=tokenizer.nextToken();
        }else{
            currentToken=null;
        }
        return currentToken;
    }

    public  String getCurrentToken(){
        return currentToken;
    }
    public void skipToken(String token) throws Exception {
        if (!token.equals(currentToken)){
            throw new Exception("不存在该操作");
        }
        nextToken();
    }

    public int currentNum(){
        int number = 0;
        try{
            number = Integer.parseInt(currentToken);
        }catch (Exception e){

        }
        return number;
    }
}
