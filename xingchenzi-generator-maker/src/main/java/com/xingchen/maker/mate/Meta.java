package com.xingchen.maker.mate;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author xingchen
 * @version V1.0
 * @Package com.xingchen.maker.mate
 * @date 2023/12/6 16:26
 */
@NoArgsConstructor
@Data
public class Meta {

    private String name;
    private String description;
    private String basePackage;
    private String version;
    private String author;
    private String createTime;
    private FileConfigDTO fileConfig;
    private ModelConfigDTO modelConfig;

    @NoArgsConstructor
    @Data
    public static class FileConfigDTO {
        private String inputRootPath;
        private String outputRootPath;
        private String type;
        private List<FilesDTO> files;

        @NoArgsConstructor
        @Data
        public static class FilesDTO {
            private String inputPath;
            private String outputPath;
            private String type;
            private String generateType;
        }
    }

    @NoArgsConstructor
    @Data
    public static class ModelConfigDTO {
        private List<ModelsDTO> models;

        @NoArgsConstructor
        @Data
        public static class ModelsDTO {
            private String fieldName;
            private String type;
            private String description;
            private Object defaultValue;
            private String abbr;
        }
    }
}
