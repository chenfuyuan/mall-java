package com.learn.project.mall.order.dao;

import com.learn.project.mall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author chenfuyuan
 * @email chenfuyuan0713@163.com
 * @date 2021-04-16 15:45:07
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
