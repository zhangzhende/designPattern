package commandPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Waiter {
    private List<Command> orders = new ArrayList<>();

    //添加订单，假设鸡肉没了
    public void setOrder(Command command) {
        if (command instanceof BakeChickenCommand) {
            System.out.println("no chicken left ,please choose others");
        } else {
            orders.add(command);
            System.out.println("Order +1");
        }
    }

    //取消订单
    public void cancelOrder(Command command) {
        orders.remove(command);
        System.out.println("Order -1");
    }

    //通知执行
    public void tellAll() {
        for (Command command : orders) {
            command.ExcuteCommand();
        }
    }
}

