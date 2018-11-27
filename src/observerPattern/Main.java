package observerPattern;


/**
 *观察者模式【发布订阅模式】
 *
 * 定义了一种一对多的依赖关系，让多个观察者对象监听一个主体对象，这个主题对象在状态发生变化时，会通知所有对象，使他们更新自己
 *
 *
 * 使用场景：当一个对象的改变需要同时改变其他对象的时候，而且他还不知道有多少对象需要改变
 *
 * 其实，观察者模式所做的工作就是在解除耦合，让耦合的双方都依赖于抽象而不依赖于具体，从而使得各自的变化都不会
 * 影响到另一边
 *
 */
public class Main {
    public static void main(String[] args){
        Boss zhangsan=new Boss();
        StockObserver tongshi1=new StockObserver("一一",zhangsan);
        NBAObserver tongshi2=new NBAObserver("lisi",zhangsan);

        zhangsan.attach(tongshi1);
        zhangsan.attach(tongshi2);

        zhangsan.setSubjectStatus("我回来了");
        zhangsan.call();
    }
}
