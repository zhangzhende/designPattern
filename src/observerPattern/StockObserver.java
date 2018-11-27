package observerPattern;

/**
 * 具体的观察者，摸鱼的
 */
public class StockObserver  extends Observer{
    public StockObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println(sub.getSubjectStatus()+name+"关闭摸鱼，继续工作");
    }
}
