package ProxyPattern;


/**
 * 代理模式
 * <p>
 * 为其他对象提供一个代理以控制对这个对象的访问
 *
 * 操作为接口，两个实现类，proxy和persuit,
 * proxy实现接口方法中调用的是persuit的实现方法，对外使用proxy但是内部确实用的persuit的方法
 * 则proxy代理了persuit,从而对外隐藏了persuit
 *
 *
 *
 *
 */
public class Main {

    public static void main(String[] args) {
        Girl girl = new Girl("一一");
        Proxy proxy = new Proxy(girl);
        proxy.giveChocolate();
        proxy.giveDolls();
        proxy.giveFlowers();

    }
}
