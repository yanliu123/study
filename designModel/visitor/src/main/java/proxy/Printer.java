package proxy;

public class Printer implements Printable{
    private String name;
    public Printer(){
        System.out.println("执行构造函数");
    }

    public Printer(String name){
        System.out.println("执行构造函数（"+name+")");
        this.name = name;
        heavyJob(name);
    }

    private void heavyJob(String name) {
        System.out.println("执行繁重的工作"+name);
        for (int i=0;i<10;i++){
            try{
                Thread.sleep(1000);
            }catch (Exception e){

            }
        }
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print(String msg) {
        System.out.println(msg);
    }
}
