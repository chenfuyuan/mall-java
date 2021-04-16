package com.learn.project.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.learn.project.mall.common.util.PageUtil;
import com.learn.project.mall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author chenfuyuan
 * @email chenfuyuan0713@163.com
 * @date 2021-04-16 15:45:07
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtil queryPage(Map<String, Object> params);
}

