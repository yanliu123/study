package proxy;

public class PrinterProxy implements Printable{
    private String name;
    private Printer real;
    public PrinterProxy(String name){
        this.name = name;
    }
    @Override
    public synchronized void setName(String name) {
        if (real!=null){
            real.setName(name);
        }
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print(String msg) {
        realize();
        real.print(msg);
    }

    private synchronized void realize() {
        if (real==null){
            real = new Printer(name);
        }

    }
}
