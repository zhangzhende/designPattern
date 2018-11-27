package adapterPattern;

/**
 * 适配器模式
 * 通过包装，使他能用现在的调用方式调用其他的接口，通过适配器封装
 *
 * 1.  将目标类和适配者类解耦，通过使用适配器让不兼容的接口变成了兼容，让客户从实现的接口解耦。

 2. 增加了类的透明性和复用性，将具体的实现封装在适配者类中，对于客户端类来说是透明的，而且提高了适配者的复用性。

 3. 灵活性和扩展性都非常好在不修改原有代码的基础上增加新的适配器类，符合“开闭原则”。
 * Created by Administrator on 2018/11/26 0026.
 */
public class Main {
    public static void main(String[] args){
        Dog dog=new Dog();
        Robot adapter=new DogAdapter(dog);
        adapter.cry();
        adapter.move();
    }

}
