package com.learn.project.mall.ware.dao;

import com.learn.project.mall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author chenfuyuan
 * @email chenfuyuan0713@163.com
 * @date 2021-04-16 15:48:08
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
