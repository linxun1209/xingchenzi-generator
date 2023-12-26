package com.xingchen.maker.template.model;

/**
 * @author xingchen
 * @version V1.0
 * @Package com.xingchen.maker.template.model
 * @date 2023/12/26 23:23
 */

import lombok.Data;

@Data
public class TemplateMakerOutputConfig {

    // 从未分组文件中移除组内的同名文件
    private boolean removeGroupFilesFromRoot = true;
}

