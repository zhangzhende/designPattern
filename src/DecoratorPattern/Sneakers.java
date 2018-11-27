package DecoratorPattern;

public class Sneakers extends Finery {
    @Override
    public void show() {
        System.out.print("破鞋子 ");
        super.show();
    }
}
