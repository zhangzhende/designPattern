package statePattern;

public class NoonState extends AbstractState {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 13) {
            System.out.println("当前时间为" + work.getHour() + "中午精神好");
        }else{
            work.setState(new AfternoonState());
            work.writeProgram();
        }
    }
}
