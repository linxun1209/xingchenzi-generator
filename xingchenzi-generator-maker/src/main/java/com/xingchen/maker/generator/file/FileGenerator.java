package com.xingchen.maker.generator.file;


import com.xingchen.maker.model.DateModel;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

/**
 * 核心生成器
 */
public class FileGenerator {

    /**
     * 生成
     *
     * @param model 数据模型
     * @throws TemplateException
     * @throws IOException
     */
    public static void doGenerate(Object model) throws TemplateException, IOException {
        String inputRootPath = "E:\\后端大佬成才之路\\星辰代码生成项目\\xingchenzi-generator\\yuzi-generator-demo-projects\\acm-template-pro";
        String outputRootPath = "E:\\后端大佬成才之路\\星辰代码生成项目\\acm-template-pro";

        String inputPath;
        String outputPath;

        inputPath = new File(inputRootPath, "src/com/yupi/acm/MainTemplate.java.ftl").getAbsolutePath();
        outputPath = new File(outputRootPath, "src/com/yupi/acm/MainTemplate.java").getAbsolutePath();
        DynamicFileGenerator.doGenerate(inputPath, outputPath, model);

        inputPath = new File(inputRootPath, ".gitignore").getAbsolutePath();
        outputPath = new File(outputRootPath, ".gitignore").getAbsolutePath();
        StaticFileGenerator.copyFilesByHutool(inputPath, outputPath);

        inputPath = new File(inputRootPath, "README.md").getAbsolutePath();
        outputPath = new File(outputRootPath, "README.md").getAbsolutePath();
        StaticFileGenerator.copyFilesByHutool(inputPath, outputPath);
    }

    public static void main(String[] args) throws TemplateException, IOException {
        DateModel dateModel = new DateModel();
        dateModel.setAuthor("yupi");
        dateModel.setLoop(false);
        dateModel.setOutputText("求和结果：");
        doGenerate(dateModel);
    }
}
