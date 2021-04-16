package com.learn.project.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.learn.project.mall.common.util.PageUtil;
import com.learn.project.mall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author chenfuyuan
 * @email chenfuyuan0713@163.com
 * @date 2021-04-16 15:45:07
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtil queryPage(Map<String, Object> params);
}

