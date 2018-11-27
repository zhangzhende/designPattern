package ProxyPattern;

public class Persuit implements IGiveGift{

     private Girl girl;

    public Persuit(Girl girl) {
        this.girl = girl;
    }

    @Override
    public void giveDolls() {
    System.out.print(girl.getName()+" 送你洋娃娃");
    }

    @Override
    public void giveFlowers() {
        System.out.print(girl.getName()+" 送你鲜花");
    }

    @Override
    public void giveChocolate() {
        System.out.print(girl.getName()+" 送你巧克力");
    }
}
