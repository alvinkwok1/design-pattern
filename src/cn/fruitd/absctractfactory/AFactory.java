package cn.fruitd.absctractfactory;

/**
 * A工厂只生产圆形和正方形
 * 颜色只生产黑色和黄色
 */
public class AFactory implements AbstrctFactory {
    @Override
    public Shape getShape(String type) {
        if ("square".equals(type)) {
            return new Square();
        } else if ("circular".equals(type)) {
            return new Circular();
        }
        return null;
    }

    @Override
    public Color getColor(String type) {
        if ("black".equals(type)) {
            return new Black();
        } else if ("yellow".equals(type)) {
            return new Yellow();
        }
        return null;
    }
}
