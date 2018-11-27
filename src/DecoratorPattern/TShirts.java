package DecoratorPattern;

/**
 * 具体服饰类，通过一层层包装的方式来拓展功能
 *
 * decorate方法来指定内层然后包装上
 */
public class TShirts extends Finery {

    @Override
    public void show() {
        System.out.print("大T恤");
        super.show();
    }

}
