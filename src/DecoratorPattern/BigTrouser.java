package DecoratorPattern;

public class BigTrouser extends Finery {
    @Override
    public void show() {
        System.out.print("垮裤 ");
        super.show();
    }
}
