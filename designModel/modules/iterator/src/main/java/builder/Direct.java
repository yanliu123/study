package builder;

public class Direct {
    private Builder builder;
    public Direct(Builder builder){
        this.builder = builder;
    }
    public Object construct(){
        builder.setTitle("你好！");
        builder.setString("从早上到晚上！");
        builder.setItems(new String[]{
            "早上","晚上"
        });
        builder.setString("晚上！");
        builder.setItems(new String[]{
                "开始","结束"
        });
        return builder.getResult();
    }
}
