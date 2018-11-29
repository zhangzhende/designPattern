package flyweightPattern;

import java.util.HashMap;

/**
 * Created by Administrator on 2018/11/29 0029.
 */
public class FlyweightFactory {
    public static HashMap<String,Shape> map=new HashMap<String, Shape>();

    public static Shape getShape(String key){
        Shape shape=map.get(key);
        if(null==shape){
            shape=new CiecleShape(key);
            map.put(key,shape);
        }
        return shape;
    }

    public static int getSize(){
        return map.size();
    }
}
