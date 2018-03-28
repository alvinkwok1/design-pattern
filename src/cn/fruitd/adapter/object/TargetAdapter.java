package cn.fruitd.adapter.object;

/**
 * 目标转换接口。使用新的服务接口调用旧的服务接口。
 * 实例获取方式：通过注入实例获得
 */
public class TargetAdapter implements SourceAdapter {
    /**
     * 原始接口类型
     */
    private Source source;

    public TargetAdapter(Source source) {
        this.source = new Source();
    }

    @Override
    public String service() throws NullPointerException{
        String result = "";
        if (source != null) {
            result = source.oldService();
        }else{
            throw  new NullPointerException("souce service instance is null!");
        }
        return result;
    }
}
