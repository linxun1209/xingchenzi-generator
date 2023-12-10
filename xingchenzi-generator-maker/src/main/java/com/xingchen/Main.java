package com.xingchen;

import cn.hutool.extra.template.TemplateException;
import com.xingchen.maker.generator.main.MainGenerator;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws TemplateException, IOException, InterruptedException, freemarker.template.TemplateException {
        MainGenerator mainGenerator = new MainGenerator();
        mainGenerator.doGenerate();
    }
}
