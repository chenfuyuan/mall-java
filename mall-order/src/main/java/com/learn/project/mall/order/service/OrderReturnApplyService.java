package com.learn.project.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.learn.project.mall.common.util.PageUtil;
import com.learn.project.mall.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author chenfuyuan
 * @email chenfuyuan0713@163.com
 * @date 2021-04-16 15:45:07
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtil queryPage(Map<String, Object> params);
}

