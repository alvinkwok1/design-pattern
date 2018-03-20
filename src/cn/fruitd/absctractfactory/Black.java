package cn.fruitd.absctractfactory;

/**
 * 黑色
 */
public class Black implements Color {
    @Override
    public void fill() {
        System.out.println("fill black!");
    }
}
