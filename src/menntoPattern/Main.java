package menntoPattern;

/**
 * 备忘录模式
 * <p>
 * 在不破坏封装性的前提下，捕获一个对象的内部状态，并在对象之外保存这个状态，
 * 这样以后就可以将这个对象恢复到以前的状态
 * <p>
 * 使用场景：适用于功能比较复杂，但需要维护或记录属性历史的类，或者需要保存的属性是众多属性的一部分
 * ，发起人可以根据保存的备忘恢复到之前的状态
 * <p>
 * 缺点：如果需要备忘的数据很大，那么就非常的消耗资源
 */
public class Main {
    public static void main(String[] agrs) {
        GameRole role = new GameRole();
        //初始
        role.init();
        role.stateShow();
//保存进度
        RoleStateCarer carer = new RoleStateCarer();
        carer.setRoleStateMemento(role.saveState());
//战斗
        role.fight();
        role.stateShow();
//恢复
        role.RecoveryState(carer.getRoleStateMemento());
        role.stateShow();
    }
}
