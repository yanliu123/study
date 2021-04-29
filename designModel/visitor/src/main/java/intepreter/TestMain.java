package intepreter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestMain {
    public static void main(String[] args) throws Exception {
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader("program.txt"));
            String line;
            while ((line=bufferedReader.readLine())!=null){
                System.out.println("命令："+line);
                Node node = new ProgramCommand();
                node.parse(new Context(line));
                System.out.println(node);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
