package DecoratorPattern;

/**
 * 装饰者模式
 * <p>
 * 目的是为已有的功能动态的添加更多功能的一种方式，
 * <p>
 * 场景：当系统需要新的功能的时候，是向旧的类中添加新代码，这些新加的代码通常装饰了原有类的核心职责或主要行为
 * 而新加的东西仅仅是为了满足一些只在特定的情况下才会执行的特殊行为的需要（也就是说并不是所有相关的地方都需要修改）
 * ，那么利用装饰者模式可以很好额解决这个问题，
 * <p>
 * 优点：有效的将核心职责和装饰功能分开，
 * <p>
 * 一般结构：
 * 抽象类
 * abstract class Component{public abstract void Operation(); }
 * <p>
 * ConcreteComponent类
 * public class ConcreteComponent extends Component{
 *
 * @verride public void Operation(){
 * 操作（）;
 * }
 * }
 * 继承自抽象类然后重写方法，增加一个setComponent,指定实例化对象
 * public class Decorator extends Component{
 * protected Component component;
 * public void setComponent(Component component){this.component=component}
 * @verride public void Operation(){
 * if(component!=null){component.Operation()}
 * }
 * }
 * 具体装饰
 * public class ConcreteDecorator extends Decorator{
 * @verride public void Operation(){
 * super.Operation();
 * 新加的操作（）
 * }
 * }
 */
public class Main {

    public static void main(String[] args) {
        Person person = new Person("老张");
        System.out.print("装饰1：");
        TShirts tShirts = new TShirts();
        BigTrouser bigTrouser = new BigTrouser();
        Sneakers sneakers=new Sneakers();
        tShirts.decorate(person);
        bigTrouser.decorate(tShirts);
        sneakers.decorate(bigTrouser);
        sneakers.show();
    }

}
