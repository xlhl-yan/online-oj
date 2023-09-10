package com.xlhl.onlinejudgemodel.model.codesandbox;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * ExecuteCodeResponse
 *
 * @author xlhl
 * @version 1.0
 * @description 代码沙箱响应类
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExecuteCodeResponse {
    /**
     * 输出
     */
    private List<String> outputList;

    /**
     * 接口信息
     */
    private String message;

    /**
     * 执行状态
     */
    private Integer status;


    /**
     * 判题信息
     */
    private JudgeInfo judgeInfo;
}
