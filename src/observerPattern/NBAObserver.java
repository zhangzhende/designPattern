package observerPattern;

/**
 * 具体的观察者，看NBA的
 */
public class NBAObserver extends Observer {
    public NBAObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println(sub.getSubjectStatus()+name+"关闭NBA，继续工作");
    }
}
