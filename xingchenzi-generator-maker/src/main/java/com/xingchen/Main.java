package com.xingchen;

import cn.hutool.extra.template.TemplateException;
import com.xingchen.maker.generator.main.GenerateTemplate;
import com.xingchen.maker.generator.main.MainGenerator;
import com.xingchen.maker.generator.main.ZipGenerator;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws TemplateException, IOException, InterruptedException, freemarker.template.TemplateException {
        //        GenerateTemplate generateTemplate = new MainGenerator();
        GenerateTemplate generateTemplate = new ZipGenerator();
        generateTemplate.doGenerate();
    }


}
