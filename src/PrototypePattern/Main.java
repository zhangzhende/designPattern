package PrototypePattern;


/**
 * 原型模式
 *
 * 原型模式是指从一个对象在创建另外一个可定制的对象，而且不需要知道任何细节。主要靠克隆来实现，
 * 克隆---实现Cloneable接口
 * 单纯克隆是浅复制，深复制需要自己弄
 * 浅复制：值对象直接复制，引用对象复制地址，也就是说复制后的两个引用会指向同一个对象，改变一个会都改变。
 * 所以深复制是整体复制，包括引用对象的值
 *
 */
public class Main {
    //以下基于深拷贝，其实就是拷贝的时候单独处理了一下引用对象，把他单独拷贝一下
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume a =new Resume("老张");
        a.setUserinfo("男",20);
        a.setWorkingExperience("2015-2016","A company");

        Resume b= (Resume) a.clone();
        b.setWorkingExperience("2016-2017","B company");

        a.display();
        b.display();
    }
}
