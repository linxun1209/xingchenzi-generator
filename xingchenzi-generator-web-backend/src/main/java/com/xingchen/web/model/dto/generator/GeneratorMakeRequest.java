package com.xingchen.web.model.dto.generator;

/**
 * @author xingchen
 * @version V1.0
 * @Package com.xingchen.web.model.dto.generator
 * @date 2024/1/30 20:08
 */

import com.xingchen.maker.meta.Meta;
import lombok.Data;

import java.io.Serializable;
/**
 * 制作代码生成器请求
 * @author xingchen
 * @version V1.0
 * @Package com.xingchen.web.model.dto.generator
 * @date 2024/1/30 20:08
 */
@Data
public class GeneratorMakeRequest implements Serializable {

    /**
     * 压缩文件路径
     */
    private String zipFilePath;

    /**
     * 元信息
     */
    private Meta meta;

    private static final long serialVersionUID = 1L;
}