package com.learn.project.mall.product.dao;

import com.learn.project.mall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author chenfuyuan
 * @email chenfuyuan0713@163.com
 * @date 2021-04-16 14:32:05
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
