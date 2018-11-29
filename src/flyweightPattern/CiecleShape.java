package flyweightPattern;

/**
 * Created by Administrator on 2018/11/29 0029.
 */
public class CiecleShape extends Shape {
    private String color;

    public CiecleShape(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("draw a circle: "+color);
    }
}
