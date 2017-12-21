package com.alibaba.datax.common.plugin;

import java.util.List;
import java.util.Map;

/* 插件信息的收集器 */
public interface JobPluginCollector extends PluginCollector {
	/* 从Task获取自定义收集信息 TODO */
	Map<String/*key*/, List<String>> getMessage();

	/* 从Task获取自定义收集信息 TODO */
	List<String> getMessage(String key);
}
