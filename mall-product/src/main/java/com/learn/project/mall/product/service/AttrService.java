package com.learn.project.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.learn.project.mall.common.util.PageUtil;
import com.learn.project.mall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author chenfuyuan
 * @email chenfuyuan0713@163.com
 * @date 2021-04-16 14:32:05
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtil queryPage(Map<String, Object> params);
}

