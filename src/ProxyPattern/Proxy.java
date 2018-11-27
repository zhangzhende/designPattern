package ProxyPattern;

public class Proxy implements IGiveGift {
    private Persuit persuit;

    public Proxy(Girl girl) {
        this.persuit = new Persuit(girl);
    }

    @Override
    public void giveDolls() {
        persuit.giveDolls();
    }

    @Override
    public void giveFlowers() {
        persuit.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        persuit.giveChocolate();
    }
}
