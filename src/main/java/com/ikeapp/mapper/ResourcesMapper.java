package com.ikeapp.mapper;

import com.ikeapp.entity.Resources;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
  * 序列 Mapper 接口
 * </p>
 *
 * @author 龙朝飞
 * @since 2018-08-23
 */
public interface ResourcesMapper extends BaseMapper<Resources> {


    List<Resources> test();
}