package cn.fruitd.creator;

/**
 * 指导者
 * 指导装配工作
 */
public class Director {
    public void creator(Builder builder){
        builder.createPart1();
        builder.createPart2();
        builder.createPart3();
    }
}
