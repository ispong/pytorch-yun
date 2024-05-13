package com.isxcode.torch.modules.workflow.entity;

import com.isxcode.torch.modules.work.entity.WorkExportInfo;
import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WorkflowExportInfo {

    private WorkflowEntity workflow;

    private WorkflowConfigEntity workflowConfig;

    private List<WorkExportInfo> works;
}
