package com.alibaba.datax.common.spi;

import com.alibaba.datax.common.util.Configuration;

import java.util.Map;

public interface Hook {
    public String getName();

    public void invoke(Configuration jobConf, Map<String, Number> msg);
}
