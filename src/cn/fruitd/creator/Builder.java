package cn.fruitd.creator;

/**
 * 建造者接口
 * 定义建造步骤
 */
public interface Builder {
    void createPart1();

    void createPart2();

    void createPart3();

    Product getResult();


}
