package adapterPattern;

/**
 * 被适配的对象，让他能符合现在的接口
 * Created by Administrator on 2018/11/26 0026.
 */
public class Dog {
    public  void wang(){
        System.out.println("dog wangwang.....");
    }

    public void run(){
        System.out.println("dog run....");
    }
}
