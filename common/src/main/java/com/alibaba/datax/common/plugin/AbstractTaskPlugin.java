package com.alibaba.datax.common.plugin;

/* task */
public abstract class AbstractTaskPlugin extends AbstractPlugin {
    private int taskGroupId;                            /* task组id */
    private int taskId;                                 /* task id */
    private TaskPluginCollector taskPluginCollector;    /* 处理失败数据 */

    public TaskPluginCollector getTaskPluginCollector() { return taskPluginCollector; }
    public void setTaskPluginCollector(TaskPluginCollector taskPluginCollector) { this.taskPluginCollector = taskPluginCollector; }
    public int getTaskId() { return taskId; }
    public void setTaskId(int taskId) { this.taskId = taskId; }
    public int getTaskGroupId() { return taskGroupId; }
    public void setTaskGroupId(int taskGroupId) { this.taskGroupId = taskGroupId; }
}
