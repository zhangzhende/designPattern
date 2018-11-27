package adapterPattern;

/**
 * 适配器
 * 通过包装，让其符合现在接口的调用，在具体内部调用其他接口，
 * 让他想之前那样调用但是内部用新的接口实现
 * Created by Administrator on 2018/11/26 0026.
 */
public class DogAdapter implements Robot {
    private Dog dog;

    public DogAdapter(Dog dog) {
        this.dog = dog;
    }

    public void move() {
        System.out.println("robot dog run.....");
        dog.run();
    }

    public void cry() {
        System.out.println("robot dog cry....");
        dog.wang();
    }
}
