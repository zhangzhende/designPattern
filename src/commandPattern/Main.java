package commandPattern;


/**
 * 命令模式
 *
 * 将一个请求封装为一个对象，从而使你可以用不同的请求对客户进行参数化，对请求排队或者记录请求日志，以及支持可撤销的操作
 *
 *   四、模式优缺点
 *          优点
 *              1. 降低了系统耦合度
 *              2. 新的命令可以很容易添加到系统中去。
 *          缺点
 *              使用命令模式可能会导致某些系统有过多的具体命令类。
 *
 *          五、模式使用场景
 *              1.系统需要将请求调用者和请求接收者解耦，使得调用者和接收者不直接交互。
 *              2.系统需要在不同的时间指定请求、将请求排队和执行请求。
 *              3.系统需要支持命令的撤销(Undo)操作和恢复(Redo)操作。
 *              5.系统需要将一组操作组合在一起，即支持宏命令。
 *
 *              七、总结
 *              1. 命令模式的本质就是将命令对象进行封装打包，将发出命令的责任和执行命令的责任进行割开。
 *              2. 命令模式中发送者只需要知道如何发送请求命令，无须关心命令执行具体过程。
 *              3. 在发送者和接收者两者间是通过命令对象进行沟通的。请求命令本身就当做一个对象在两者间进行传递，它封装了接收者和一组动作。
 *              4. 命令模式支持撤销。
 *              5. 命令模式队列请求和日志请求。
 */
public class Main {

    public static void main(String[] args){
        Barbecuer barbecuer=new Barbecuer();
        Command bakeMutton=new BakeMuttonCommand(barbecuer);
        Command bakeChicken=new BakeChickenCommand(barbecuer);

        Waiter waiter=new Waiter();
        waiter.setOrder(bakeMutton);
        waiter.setOrder(bakeChicken);

        waiter.tellAll();
    }
}
