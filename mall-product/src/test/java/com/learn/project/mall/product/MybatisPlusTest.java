package com.learn.project.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.learn.project.mall.product.entity.BrandEntity;
import com.learn.project.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

/**
 * @Description: MybatisPlus整合测试
 * @Author: chenfuyuan
 * @Date: 2021/4/16 15:13
 */
@SpringBootTest
public class MybatisPlusTest {

    @Autowired
    private BrandService brandService;


    @Test
    public void testSave() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");
        brandEntity.setDescript("华为描述");
        brandService.save(brandEntity);
    }

    @Test
    public void testUpdate() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setName("华为1");
        brandService.updateById(brandEntity);
    }

    @Test
    public void testQuery() {

        List<BrandEntity> brandList = brandService.list(new QueryWrapper<BrandEntity>().eq("name", "华为"));
        System.out.println(brandList);
        
    }
}
