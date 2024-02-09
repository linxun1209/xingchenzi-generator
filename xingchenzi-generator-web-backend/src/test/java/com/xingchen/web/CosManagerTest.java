package com.xingchen.web;

import com.xingchen.web.manager.CosManager;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Arrays;

@SpringBootTest
class CosManagerTest {

    @Resource
    private CosManager cosManager;

    @Test
    void deleteObject() {
		cosManager.deleteObject("/generator_make_template/1");
    }

    @Test
    void deleteObjects() {
        cosManager.deleteObjects(Arrays.asList("generator_make_template/1/a.zip",
                "generator_make_template/1/b.zip"
                ));
    }

    @Test
    void deleteDir() {
        cosManager.deleteDir("/generator_picture/1/");
    }
}