package facade;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class HtmlWriter {
  private Writer writer;
  public HtmlWriter(FileWriter writer){
      this.writer = writer;
  }
  public Writer getWriter(){
      return this.writer;
  }
  public void title(String title) throws IOException {
    writer.write("<html><head><title>");
      writer.write(title);
    writer.write("</title></head><body>");
    writer.write("<h>"+title+"</h>");
  }

  public void writeh(String msg) throws IOException {
      getWriter().write("<p>"+msg+"</p>");
  }
  public void writeLink(String link,String caption) throws IOException {
      writer.write("<a herf=\""+link+"\" >"+caption+"</a>");
  }
  public void writemail(String link,String caption) throws IOException {
      writeLink("writeMail:"+caption,link);
  }
    public void close() throws IOException {
      writer.write("</body></html>");
      writer.close();
    }
}
