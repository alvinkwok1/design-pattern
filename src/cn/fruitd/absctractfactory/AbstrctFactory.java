package cn.fruitd.absctractfactory;

public interface AbstrctFactory {
    public Shape getShape(String type);

    public Color getColor(String type);

}
