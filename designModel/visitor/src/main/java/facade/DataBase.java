package facade;

import java.io.FileInputStream;
import java.util.Properties;

public class DataBase {
    private DataBase(){}
    public static Properties getProperties(String filename){
        Properties properties = new Properties();
        try{
            properties.load(new FileInputStream(filename+".txt"));
        }catch (Exception e){

        }
        return properties;
    }
}
