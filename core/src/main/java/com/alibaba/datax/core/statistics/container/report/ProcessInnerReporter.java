package com.alibaba.datax.core.statistics.container.report;

import com.alibaba.datax.core.statistics.communication.Communication;
import com.alibaba.datax.core.statistics.communication.LocalTGCommunicationManager;

/* 内部提价统计信息, 统计信息提交到本地的manager */
public class ProcessInnerReporter extends AbstractReporter {

    @Override
    public void reportJobCommunication(Long jobId, Communication communication) {
    }

    @Override
    public void reportTGCommunication(Integer taskGroupId, Communication communication) {
        LocalTGCommunicationManager.updateTaskGroupCommunication(taskGroupId, communication);
    }
}