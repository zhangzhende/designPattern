package commandPattern;

/**
 * 具体命令类
 */
public class BakeChickenCommand extends Command {
    public BakeChickenCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void ExcuteCommand() {
        barbecuer.bakeChicken();
    }
}
