package com.xingchen.web.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xingchen.web.model.entity.Generator;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
* @author xing'chen
* @description 针对表【generator(代码生成器)】的数据库操作Mapper
* @createDate 2023-12-29 17:45:03
* @Entity com.xingchen.web.model.entity.Generator
*/
public interface GeneratorMapper extends BaseMapper<Generator> {

    @Select("SELECT id, distPath FROM generator WHERE isDelete = 1")
    List<Generator> listDeletedGenerator();

}




