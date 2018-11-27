package StrategyPattern;

/**
 * 策略模式---
 *
 * 1、他是一种定义一系列算法的方法，从概念上将，所有的这些算法完成的都是相同的工作，只是实现不同，
 * 他可以以相同的方式调用所有的算法，减少了各种算法类与使用算法类之间的耦合
 *
 * 2、策略算法的Strategy类层次为Context定义了一系列的可供重用的算法，继承有助于提取这些算法的公共功能
 *
 *
 *
 *
 *
 */
public class Main {
    public static  void main(String[] args){
        int num=10;
        double price=35.6;
        CaseContext context=new CaseContext("2");
        double totalPrice=context.getResult(num*price);
        System.out.print("totalPrice:"+totalPrice);
    }
}
