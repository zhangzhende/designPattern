package statePattern;

/**
 *状态模式
 *
 * 当一个独享的内在状态改变时允许改变其行为，这个对象看起来像改变了类一样
 *
 * 状态模式主要解决的是控制一个对象的状态转换条件表达式过于复杂时的情况，把状态的判断逻辑转移到不同状态的一系列类中
 * 可以把复杂的判断逻辑简化，若判断逻辑不复杂，就没必要用改模式
 *
 * 优点：将特定的状态相关的行为局部化，并且讲不通行为分割开【即通过将各种状态转移的逻辑散布到state的子类，减少相互的依赖】
 */
public class Main {
    public static void main(String[] args){
        Work work=new Work();
        work.setHour(10);
        work.writeProgram();
        work.setHour(12);
        work.writeProgram();
    }
}
