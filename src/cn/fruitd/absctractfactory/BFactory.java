package cn.fruitd.absctractfactory;

/**
 * 当A工厂的形状合颜色不满足要求时新建新的工厂返回新的
 * 形状和颜色组合
 */
public class BFactory implements AbstrctFactory {
    @Override
    public Shape getShape(String type) {
        return new Triangle();
    }

    @Override
    public Color getColor(String type) {
        return new Violet();
    }
}
