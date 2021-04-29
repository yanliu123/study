package chainResponse;

public class LimitSupport extends Support{
    private int limit;
    public LimitSupport(String name,int limit){
        super(name);
        this.limit = limit;
    }
    @Override
    protected Boolean resolve(Trouble trouble){
        if (trouble.getNumber()<limit){
            return true;
        }
        return false;
    }
}
