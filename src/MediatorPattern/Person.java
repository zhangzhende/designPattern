package MediatorPattern;

/**
 * Created by Administrator on 2018/11/29 0029.
 */
public abstract class Person {
    protected String name;
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
