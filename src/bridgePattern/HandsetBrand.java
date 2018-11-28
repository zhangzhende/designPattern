package bridgePattern;

public abstract class HandsetBrand {
    protected HandsetSoft soft;

    public void setSoft(HandsetSoft soft) {
        this.soft = soft;
    }
    public abstract void run();
}
