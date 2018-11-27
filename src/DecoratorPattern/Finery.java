package DecoratorPattern;


/**
 * 服装类，继承person
 */
public class Finery extends Person {
    protected Person component;

    /**
     * 打扮，即赋予对象具体的实例，然后show方法调用该实例的show方法
     * @param component
     */
    public void decorate(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null) {
            component.show();
        }
    }
}
