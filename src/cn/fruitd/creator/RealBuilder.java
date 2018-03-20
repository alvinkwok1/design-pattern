package cn.fruitd.creator;

/**
 * 实际的建造者
 * 进行各个部件的生产建造
 */
public class RealBuilder implements Builder {

    private Product product;

    public RealBuilder() {
        product = new Product();
    }

    @Override
    public void createPart1() {
        product.setPart1("part1");
    }

    @Override
    public void createPart2() {
        product.setPart2("part2");
    }

    @Override
    public void createPart3() {
        product.setPart3("part3");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
