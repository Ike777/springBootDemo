package com.ikeapp.service.impl;

import com.baomidou.mybatisplus.mapper.Condition;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.ikeapp.entity.Resources;
import com.ikeapp.mapper.ResourcesMapper;
import com.ikeapp.service.ResourcesService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ikeapp.systems.DemoMethod;
import org.apache.ibatis.session.RowBounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 序列 服务实现类
 * </p>
 *
 * @author lzf
 * @since 2018-08-23
 */
@CacheConfig(cacheNames = "ResourcesServiceImpl")
@Service
public class ResourcesServiceImpl extends ServiceImpl<ResourcesMapper, Resources> {

    Logger log = LoggerFactory.getLogger(ResourcesServiceImpl.class);

    @Resource
    private ResourcesMapper dao;

    public List<Resources> queryAll(){
        EntityWrapper<Resources> wrapper = new EntityWrapper<Resources>();
        wrapper.where("id > {0}",0);
        return dao.selectList(wrapper);
    }

    @Cacheable(value="page",key="'all'")
    public Page<Resources> queryByPage(String command){
        Page<Resources> page = new Page<Resources>();
        page.setLimit(10);
        EntityWrapper<Resources> wrapper = new EntityWrapper<Resources>();
        wrapper.where("id > {0}",0);

        List<Resources> result = dao.selectPage(page,wrapper);
        page.setRecords(result);
        return page;
    }

    @Transactional(rollbackFor = Exception.class)
    public void insertResource(){
        Resources r = new Resources();
        r.setDescription("xxxxx");
        r.setUrl("ssss");
        r.setName("name");
        r.setLevel("1");
        r.setResKey("key");

        dao.insert(r);

        log.info("--- resID:{}",r.getId());

    }

    @Transactional(rollbackFor = Exception.class)
    public void insertResV2(){
        Resources r2 = new Resources();
        r2.setDescription("xxxxx");
        r2.setUrl("ssss");
        r2.setName("name");
        r2.setLevel("1");
        r2.setResKey("key");

        dao.insert(r2);

        //更新缓存
        resetCache();
        log.info("--- resID:{}",r2.getId());
    }

    @Caching(put={@CachePut(value="page",key="'all'")})
    public Page<Resources> resetCache(){
        Page<Resources> page = new Page<Resources>();
        page.setLimit(10);
        EntityWrapper<Resources> wrapper = new EntityWrapper<Resources>();
        wrapper.where("id > {0}",0);

        List<Resources> result = dao.selectPage(page,wrapper);
        page.setRecords(result);
        return page;
    }

    /**
     * 测试Method Annotation
     * @throws Exception
     */
    @DemoMethod
    public void cost() throws Exception{
        //do nothing
        Thread.sleep(2000);
    }
	
}
