package commandPattern;

/**
 * 具体命令类
 */
public class BakeMuttonCommand extends Command {
    public BakeMuttonCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void ExcuteCommand() {
        barbecuer.bakeMutton();
    }
}

