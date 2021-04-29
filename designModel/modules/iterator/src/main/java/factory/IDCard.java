package factory;

public class IDCard extends Product{
    private String own;
    private Integer idCard;
     IDCard(String own,Integer idCard){
        System.out.println("用户"+own+"，卡号："+idCard+" is register");
        this.own = own;
        this.idCard = idCard;
    }
    public String getOwn(){
        return own;
    }

    @Override
    public void use() {
        System.out.println("用户"+own+"，卡号："+idCard+" is in use");
    }
}
