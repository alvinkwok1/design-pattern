package cn.fruitd.adapter.classextends;

/**
 * 目标转换接口。使用新的服务接口调用旧的服务接口。
 * 服务实例获取方式：通过继承获得
 */
public class TargetAdapter extends Source implements SourceAdapter {
    /**
     * 原始接口类型
     */
    private Source source;

    public TargetAdapter() {
        this.source = new Source();
    }

    @Override
    public String service() {
        return source.oldService();
    }
}
