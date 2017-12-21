package com.alibaba.datax.transformer;

import com.alibaba.datax.common.element.Record;

import java.util.Map;

/*  */
public abstract class ComplexTransformer {
    //transformerName的唯一性在datax中检查，或者提交到插件中心检查。
    private String transformerName;

    public String getTransformerName() { return transformerName; }
    public void setTransformerName(String transformerName) { this.transformerName = transformerName; }

    abstract public Record evaluate(Record record/*记录*/, Map<String, Object> tContext/*transformer运行的配置项*/, Object... paras/*transformer函数参数*/);
}
