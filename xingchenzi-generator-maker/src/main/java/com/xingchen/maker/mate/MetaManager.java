package com.xingchen.maker.mate;

import cn.hutool.core.io.resource.ResourceUtil;
import cn.hutool.json.JSONUtil;

/**
 * @author xingchen
 * @version V1.0
 * @Package com.xingchen.maker.mate
 * @date 2023/12/6 16:37
 */
public class MetaManager {

    private static final Meta meta = initMeta();

    private MetaManager() {
        // 私有构造函数，防止外部实例化
    }

    public static Meta getMetaObject() {
        return meta;
    }

    private static Meta initMeta() {
        String projectPath = System.getProperty("user.dir");
        String metaJson = ResourceUtil.readUtf8Str("meta.json");
        Meta newMeta = JSONUtil.toBean(metaJson, Meta.class);
        // todo 校验和处理默认值
        return newMeta;
    }
}