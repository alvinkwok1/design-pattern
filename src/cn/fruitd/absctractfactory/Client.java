package cn.fruitd.absctractfactory;

public class Client {

    public static void main(String[] args){
        //现有需求
        AbstrctFactory aFactory=new AFactory();
        //组成最终产品1，并绘制
        ColorShape a=new ColorShape();
        a.setColor(aFactory.getColor("yellow"));
        a.setShape(aFactory.getShape("square"));
        a.draw();

        //现在需求有变，需要紫色的三角形
        //在不改变原有需求的情况下扩展了B工厂
        AbstrctFactory bFactory=new BFactory();
        ColorShape b=new ColorShape();
        b.setShape(bFactory.getShape(null));
        b.setColor(bFactory.getColor(null));
        b.draw();
    }

}
