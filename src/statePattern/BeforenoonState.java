package statePattern;

public class BeforenoonState extends AbstractState {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 12) {
            System.out.println("当前时间为" + work.getHour() + "上午精神好");
        }else{
            work.setState(new NoonState());
            work.writeProgram();
        }
    }
}
