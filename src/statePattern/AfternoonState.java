package statePattern;

public class AfternoonState extends AbstractState {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 17) {
            System.out.println("当前时间为" + work.getHour() + "下午精神好");
        }else{
            work.setState(new EveningState());
            work.writeProgram();
        }
    }
}
