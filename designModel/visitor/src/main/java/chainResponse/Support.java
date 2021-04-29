package chainResponse;

public abstract class Support {
    private String name;
    private Support next;
    public Support(String name){
        this.name = name;
    }
    public Support setNext(Support support){
        next = support;
        return next;
    }
    protected abstract Boolean resolve(Trouble trouble);
    public final void support(Trouble trouble){
        if (resolve(trouble)){
            done();
        }else if (next!=null){
            next.support(trouble);
        }else{
            fail();
        }

    }
    public void done(){
        System.out.println("问题解决");
    }
    public void fail(){
        System.out.println("问题解决失败");
    }
}
