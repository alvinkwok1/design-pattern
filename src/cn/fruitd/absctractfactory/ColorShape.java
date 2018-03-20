package cn.fruitd.absctractfactory;

/**
 * 有颜色的形状
 */
public class ColorShape {
    private Shape shape;
    private Color color;

    public void draw() {
        if (shape != null)
            shape.draw();
        if (color != null)
            color.fill();
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
