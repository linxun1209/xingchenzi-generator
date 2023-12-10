package com.xingchen.maker.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 动态模版配置
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DataModel {

    /**
     * 是否生成循环
     */
    private boolean loop;

    /**
     * 作者注释
     */
    private String author = "yupi";

    /**
     * 输出信息
     */
    private String outputText = "sum = ";

}
