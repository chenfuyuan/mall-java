package com.learn.project.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.learn.project.mall.common.util.PageUtil;
import com.learn.project.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author chenfuyuan
 * @email chenfuyuan0713@163.com
 * @date 2021-04-16 15:45:07
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtil queryPage(Map<String, Object> params);
}

