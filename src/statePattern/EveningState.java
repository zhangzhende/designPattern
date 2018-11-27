package statePattern;

public class EveningState extends AbstractState {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 21) {
            System.out.println("当前时间为" + work.getHour() + "晚上精神好");
        }else{
            System.out.print("下班");
        }
    }
}
