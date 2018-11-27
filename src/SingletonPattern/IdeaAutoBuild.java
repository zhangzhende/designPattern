package SingletonPattern;

/**
 * Created by Administrator on 2018/11/26 0026.
 */
public class IdeaAutoBuild {
    private static IdeaAutoBuild ourInstance = new IdeaAutoBuild();

    public static IdeaAutoBuild getInstance() {
        return ourInstance;
    }

    private IdeaAutoBuild() {
    }
}
