package strategyPattern2;

/**
 * 策略模式
 *
 * 优点：
 * 1、策略模式提供了对“开闭原则”的完美支持，用户可以在不修改原有系统的基础上选择算法或行为，也可以灵活地增加新的算法或行为。
 2、策略模式提供了可以替换继承关系的办法。
 3、使用策略模式可以避免使用多重条件转移语句。

 缺点
 1、客户端必须知道所有的策略类，并自行决定使用哪一个策略类。
 2、策略模式将造成产生很多策略类，

 五、使用场景
 1、如果在一个系统里面有许多类，它们之间的区别仅在于它们的行为，那么使用策略模式可以动态地让一个对象在许多行为中选择一种行为。
 2、一个系统需要动态地在几种算法中选择一种。
 3、如果一个对象有很多的行为，如果不用恰当的模式，这些行为就只好使用多重的条件选择语句来实现。
 * Created by Administrator on 2018/11/28 0028.
 */
public class Main {
    public static void main(String[] args) {
        testInsert();
        testSelect();
        testBubble();
    }

    public static void testInsert() {
        int[] a = {91, 62, 53, 54, 69, 25, 98, 35, 71, 65, 25};
        Handle handle = new Handle();
        handle.setSort(new InsertSort());
        handle.sort(a);
        for (int b : a) {
            System.out.print(b + " ,");
        }
        System.out.println();
    }

    public static void testSelect() {
        int[] a = {91, 62, 53, 54, 69, 25, 98, 35, 71, 65, 25};
        Handle handle = new Handle();
        handle.setSort(new SelectSort());
        handle.sort(a);
        for (int b : a) {
            System.out.print(b + " ,");
        }
        System.out.println();
    }

    public static void testBubble() {
        int[] a = {91, 62, 53, 54, 69, 25, 98, 35, 71, 65, 25};
        Handle handle = new Handle();
        handle.setSort(new BubbleSort());
        handle.sort(a);
        for (int b : a) {
            System.out.print(b + " ,");
        }
        System.out.println();
    }


}
