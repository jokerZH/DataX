package com.alibaba.datax.common.plugin;

public abstract class AbstractJobPlugin extends AbstractPlugin {
	private JobPluginCollector jobPluginCollector;

	public JobPluginCollector getJobPluginCollector() {
		return jobPluginCollector;
	}

	public void setJobPluginCollector(JobPluginCollector jobPluginCollector) {
		this.jobPluginCollector = jobPluginCollector;
	}
}
