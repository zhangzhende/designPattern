package MediatorPattern;

/**
 * Created by Administrator on 2018/11/29 0029.
 */
public class HouseOwner extends Person {
    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void contact(String msg) {
        mediator.contact(msg, this);
    }

    public void getMsg(String msg) {
        System.out.println(name + " get the msg " + msg);
    }
}
