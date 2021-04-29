package builder;

import java.io.*;

public class HtmlBuilder extends Builder {
    private PrintWriter writer;
    private String fileName;

    @Override
    public void setTitle(String title) {
        this.fileName = title+".html";
        try{
            writer = new PrintWriter(new FileWriter(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>"+title+"</title></head><body>");
        writer.println("<h>"+title+"</h>");
    }

    @Override
    public void setString(String string) {
        writer.println("<p>"+string+"</p>");
    }

    @Override
    public void setItems(String[] items) {
        writer.println("<ul>");
        for (int i=0;i<items.length;i++){
            writer.println("<li>"+items[i]+"</li>");
        }
        writer.println("</ul>");
    }

    @Override
    public Object getResult() {
        writer.println("</body></html>");
         writer.close();
         return fileName;
    }
}
