package menntoPattern;

/**
 * 角色类
 */
public class GameRole {
    private int vit;
    private int atk;
    private int def;
    public void stateShow(){
        System.out.println("当前状态：");
        System.out.println("体力："+this.vit);
        System.out.println("攻击力："+this.atk);
        System.out.println("防御力："+this.def);
    }
    //初始化
    public void init(){
        this.vit=100;
        this.atk=100;
        this.def=100;
    }
    //战斗，清0
    public void fight(){
        this.vit=0;
        this.atk=0;
        this.def=0;
    }
    //保存进度，创建备忘录，保存当前状态
    public RoleStateMemento saveState(){
        return new RoleStateMemento(vit,atk,def);
    }
    //恢复状态
    public void RecoveryState(RoleStateMemento roleStateMemento){
        this.vit=roleStateMemento.getVit();
        this.atk=roleStateMemento.getAtk();
        this.def=roleStateMemento.getDef();
    }
}
