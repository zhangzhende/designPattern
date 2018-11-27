package FacadePattern;

/**\
 *
 * 外观模式 【门面模式】
 *
 * 为子系统中的一组接口提供一个一直的界面，此模式定义了一个高层接口，这个接口使得这一子系统更加容易使用
 *
 * 将流程包装，对外提供一个接口，隐藏内部细节，方面使用，大概是这样吧，
 *
 */
public class Main {
    public static void main(String[] args){
              Fund jijin=new Fund();
              jijin.buyFund();
              jijin.sellFund();
    }


}
