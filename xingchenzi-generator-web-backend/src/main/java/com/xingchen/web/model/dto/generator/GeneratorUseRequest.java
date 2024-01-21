package com.xingchen.web.model.dto.generator;

/**
 * @author xingchen
 * @version V1.0
 * @Package com.xingchen.web.model.dto.generator
 * @date 2024/1/21 18:16
 */

import lombok.Data;

import java.io.Serializable;
import java.util.Map;

/**
 * 使用代码生成器请求
 */
@Data
public class GeneratorUseRequest implements Serializable {

    /**
     * 生成器的 id
     */
    private Long id;

    /**
     * 数据模型
     */
    Map<String, Object> dataModel;

    private static final long serialVersionUID = 1L;
}