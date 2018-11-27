package TemplateMethod;


/**
 * 模板方法模式
 *
 * 定义一个操作中的算法的骨架，而将一些步骤延迟到子类中，
 * 模板方法是的子类可以不改变一个算法的结构即可重新定义该算法的某些特定的步骤
 *
 * 模板方法模式是通过吧不变的行为搬移到超类，取出子类中的重复代码。
 * 主要体现继承的优势，以及方法的重写
 *
 */
public class Main {

    public static void main(String[] args){
        System.out.println("A student");
        TestPaper a=new StudentA();
        a.testQuestion1();
        a.testQuestion2();
        a.testQuestion3();
        System.out.println("B student");
        TestPaper b=new StudentB();
        b.testQuestion1();
        b.testQuestion2();
        b.testQuestion3();
    }
}
