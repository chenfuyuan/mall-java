package com.learn.project.mall.order.dao;

import com.learn.project.mall.order.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author chenfuyuan
 * @email chenfuyuan0713@163.com
 * @date 2021-04-16 15:45:07
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}
