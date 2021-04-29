package chainResponse;

public class OodSupport extends Support{
    public OodSupport(String name){
        super(name);
    }
    @Override
    protected Boolean resolve(Trouble trouble){
        if (trouble.getNumber()%2==1){
            return true;
        }
        return false;
    }
}
