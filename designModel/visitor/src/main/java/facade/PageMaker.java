package facade;

import java.io.FileWriter;
import java.util.Properties;

public class PageMaker {

    private PageMaker(){
    }
    public static void makeWelcomHtml(String mail,String filename){
        try {
            Properties properties = DataBase.getProperties("database");
            HtmlWriter htmlWriter = new HtmlWriter(new FileWriter(filename));
            htmlWriter.title("欢迎：" + properties.getProperty(mail));
            htmlWriter.writeh("欢迎：" + properties.getProperty(mail) + "来到，首页");
            htmlWriter.writeh("等你来信！");
            htmlWriter.writemail(mail, properties.getProperty(mail));
            htmlWriter.close();
        }catch (Exception e){

        }

    }
}
