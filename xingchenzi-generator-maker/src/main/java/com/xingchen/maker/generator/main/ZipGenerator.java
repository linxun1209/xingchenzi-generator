package com.xingchen.maker.generator.main;

/**
 * @author xingchen
 * @version V1.0
 * @Package com.xingchen.maker.generator.main
 * @date 2024/1/6 11:00
 */
/**
 * 生成代码生成器压缩包
 */
public class ZipGenerator extends GenerateTemplate {

    @Override
    protected String buildDist(String outputPath, String sourceCopyDestPath, String jarPath, String shellOutputFilePath) {
        String distPath = super.buildDist(outputPath, sourceCopyDestPath, jarPath, shellOutputFilePath);
        return super.buildZip(distPath);
    }
}