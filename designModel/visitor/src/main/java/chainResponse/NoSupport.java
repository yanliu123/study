package chainResponse;

public class NoSupport extends Support{
    public NoSupport(String name){
        super(name);
    }
    @Override
    protected Boolean resolve(Trouble trouble){
        return false;
    }
}
