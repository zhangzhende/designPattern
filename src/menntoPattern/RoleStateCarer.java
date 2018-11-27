package menntoPattern;

/**
 * 角色状态管理里类
 *
 * 保存备忘
 */
public class RoleStateCarer {
    private RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
