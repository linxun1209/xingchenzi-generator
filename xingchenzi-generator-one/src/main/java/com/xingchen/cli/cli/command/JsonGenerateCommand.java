package com.xingchen.cli.cli.command;

import cn.hutool.core.io.FileUtil;
import cn.hutool.json.JSONUtil;
import com.xingchen.cli.generator.MainGenerator;
import com.xingchen.cli.model.MainTemplateConfig;
import lombok.Data;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import java.util.concurrent.Callable;

/**
 * @author xingchen
 * @version V1.0
 * @Package com.xingchen.cli.cli.command
 * @date 2024/1/21 16:48
 */
@Command(name = "json-generate", description = "读取 json 文件生成代码", mixinStandardHelpOptions = true)
@Data
public class JsonGenerateCommand implements Callable<Integer> {

    @Option(names = {"-f", "--file"}, arity = "0..1", description = "json 文件路径", interactive = true, echo = true)
    private String filePath;

    public Integer call() throws Exception {
        String jsonStr = FileUtil.readUtf8String(filePath);
        MainTemplateConfig dataModel = JSONUtil.toBean(jsonStr, MainTemplateConfig.class);
        MainGenerator.doGenerate(dataModel);
        return 0;
    }
}