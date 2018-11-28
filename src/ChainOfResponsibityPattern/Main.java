package ChainOfResponsibityPattern;

/**
 * 责任链模式
 * <p>
 * 避免请求发送者与接收者耦合在一起，让多个对象都有可能接收请求，将这些对象连接成一条链，并且沿着这条链传递请求，直到有对象处理它为止，这就是职责链模式。
 * 在职责链模式中最关键的一点就是客户提交请求后，请求沿着链往下传递直到有一个处理者处理它，在这里客户无需关心它的请求是哪个处理者来处理，反正总有一个处理者会处理它的请求。
 * 在这里客户端和处理者都没有对方明确的信息，同时处理者也不知道职责链中的结构。所以职责链可以简化对象的相互连接，他们只需要保存一个指向其后续者的引用，而不需要保存所有候选者的引用。
 * 在职责链模式中我们可以随时随地的增加或者更改一个处理者，甚至可以更改处理者的顺序，增加了系统的灵活性。处理灵活性是增加了，但是有时候可能会导致一个请求无论如何也得不到处理
 * ，它会被放置在链末端，这个既是职责链的优点也是缺点。
 *
 *优点
 *
 *       1、降低耦合度。它将请求的发送者和接受者解耦。
 *
 *       2、简化了对象。使得对象不需要知道链的结构。
 *
 *       3、增强给对象指派职责的灵活性。通过改变链内的成员或者调动它们的次序，允许动态地新增或者删除责任。
 *
 *       4、增加新的请求处理类很方便。
 *
 * 缺点
 *
 *       1、不能保证请求一定被接收。
 *
 *       2、系统性能将受到一定影响，而且在进行代码调试时不太方便；可能会造成循环调用。
 *
 *       3、可能不容易观察运行时的特征，有碍于除错。
 *
 * 五、模式适用场景
 *
 *       1、有多个对象可以处理同一个请求，具体哪个对象处理该请求由运行时刻自动确定。
 *
 *       2、在不明确指定接收者的情况下，向多个对象中的一个提交一个请求。
 *
 *       3、可动态指定一组对象处理请求。
 *
 * 六、总结
 *
 *        1、职责链模式将请求的发送者和接受者解耦了。客户端不需要知道请求处理者的明确信息，甚至不需要知道链的结构，它只需要将请求进行发送即可。
 *
 *       2、职责链模式能够非常方便的动态增加新职责或者删除职责。
 *
 *       3、客户端发送的请求可能会得不到处理。
 *
 *       4、处理者不需要知道链的结构，只需要明白他的后续者是谁就可以了。这样就简化了系统中的对象。
 *
 */
public class Main {
    public static void main(String[] args) {
        Leader instructor = new Instructor("陈毅");       //辅导员
        Leader departmentHead = new DepartmentHead("王明");    //系主任
        Leader dean = new Dean("张强");      //院长
        Leader president = new President("王晗");     //校长

        instructor.setSuccessor(departmentHead);       //辅导员的后续者是系主任
        departmentHead.setSuccessor(dean);             //系主任的后续者是院长
        dean.setSuccessor(president);                  //院长的后续者是校长

        //请假3天的请假条
        LeaveNode leaveNode1 = new LeaveNode("张三", 3);
        instructor.handleRequest(leaveNode1);

        //请假9天的请假条
        LeaveNode leaveNode2 = new LeaveNode("李四", 9);
        instructor.handleRequest(leaveNode2);

        //请假15天的请假条
        LeaveNode leaveNode3 = new LeaveNode("王五", 15);
        instructor.handleRequest(leaveNode3);

        //请假20天的请假条
        LeaveNode leaveNode4 = new LeaveNode("赵六", 20);
        instructor.handleRequest(leaveNode4);
    }
}
